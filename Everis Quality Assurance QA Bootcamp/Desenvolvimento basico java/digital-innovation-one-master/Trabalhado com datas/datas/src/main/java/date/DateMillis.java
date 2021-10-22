package date;

import java.util.Date;

public class DateMillis {

    public static void main(String[] args){

        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        Date novaData = new Date(currentTimeMillis);
        System.out.println(novaData);
    }
}
