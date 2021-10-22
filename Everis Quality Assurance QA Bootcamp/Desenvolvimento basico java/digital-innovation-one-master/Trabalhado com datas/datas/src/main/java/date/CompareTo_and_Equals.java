package date;

import java.util.Date;

public class CompareTo_and_Equals {

    public static void main(String[] args) {


        Date dataNoPassado = new Date(1513124807691L);

        Date dataNoFuturo = new Date(1613124807681L);

        Date mesmaDataNoFuturo = new Date(1613124807681L);

        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);

        System.out.println(isEquals);

        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo);
        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado);
        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo);

        System.out.println(compareCase1);
        System.out.println(compareCase2);
        System.out.println(compareCase3);



    }
    }
