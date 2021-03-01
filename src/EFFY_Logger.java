import java.io.FileWriter;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class EFFY_Logger {
    private String info;

    public EFFY_Logger(String info){
        this.info=info;
    }

    public void print(){
        System.out.println(formatting(info));
    }

    public void write(String path,boolean append){
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
