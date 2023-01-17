import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;

public class Main{
    public static void main(String[] args){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
        System.out.println(sdf.format(date));
    }
}