package date;

import  java.text.DateFormat;
import java.util.Date;
public class DateFormat_Metodo {

    public static  void main (String[] args){

        Date agora = new Date();

        String dateToStr = DateFormat.getDateInstance().format(agora);

        System.out.println(dateToStr);


        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);

        System.out.println(dateToStr);


    }

}
