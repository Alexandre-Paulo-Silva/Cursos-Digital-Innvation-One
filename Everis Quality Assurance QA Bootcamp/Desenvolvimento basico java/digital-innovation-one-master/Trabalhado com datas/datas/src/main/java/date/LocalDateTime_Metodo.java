package date;

import java.time.LocalDateTime;

public class LocalDateTime_Metodo {

    public static void main (String[] args){

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);

        LocalDateTime futuro = agora.plusHours(1).minusDays(2).plusSeconds(12);
        System.out.println(futuro);
    }
}
