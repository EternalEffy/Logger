import java.io.FileWriter;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class EFFY_Logger {

    public void print(String info){
        System.out.println(formatting(info));
    }

    public void write(String path,boolean append,String info){
        try(FileWriter writer = new FileWriter(path,append)){
            if(append==true) writer.write(formatting(info));
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }

    private String formatting(String info){
        return "["+ZonedDateTime.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm:ss"))+"] "+info+" \n";
    }

}
