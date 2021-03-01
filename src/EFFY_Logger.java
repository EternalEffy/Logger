import java.io.FileWriter;
import java.time.ZonedDateTime;


public class EFFY_Logger {
    private ZonedDateTime time;
    private String info;


    public void print(String info){
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
        this.info=info;
        time = ZonedDateTime.now();
        return "["+time.getDayOfMonth()+"."+time.getMonthValue()+"."+time.getYear()+" "+time.getHour()+":"+time.getMinute()+":"+time.getSecond()+"] "+info+" \n";
    }

}
