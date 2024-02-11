import java.util.Date;
import java.util.Calendar;

public class java2 {
    public static void main(String[] args) {
        Calendar date1 = Calendar.getInstance();
        Date k = date1.getTime();   
        System.out.println("hien gioi la: "+k);

        System.out.println();

        System.out.println(date1.get(Calendar.DAY_OF_MONTH));
        System.out.println(date1.get(Calendar.MONTH));
        System.out.println(date1.get(Calendar.YEAR));

        System.out.println(Calendar.HOUR);
        System.out.println(date1.get(Calendar.MONTH));
        System.out.println(date1.get(Calendar.YEAR));
    }
}
