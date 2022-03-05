package bronze.b5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class no10699 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        System.out.println(simpleDateFormat.format(date));
    }
}
