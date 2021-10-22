package date;

import java.util.Calendar;

public class Calendar_Metodo {

    public static void main(String[] args) {


        Calendar agora = Calendar.getInstance();
        System.out.println("A data correta e : "+agora.getTime());

        agora.add(Calendar.DATE, -15);
        System.out.println("15 Dias atrás:"+agora.getTime());

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois"+agora.getTime());

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 dois anos depois: "+agora.getTime());





    }
    }
