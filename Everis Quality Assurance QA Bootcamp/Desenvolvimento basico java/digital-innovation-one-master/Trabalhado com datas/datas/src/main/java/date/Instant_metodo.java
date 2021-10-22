package date;

import java.time.Instant;
import java.util.Date;
public class Instant_metodo {

    public static void main(String[] args) {

        Date dataInicio = new Date(1513124807691l);

        System.out.println(dataInicio);

        Instant istant = dataInicio.toInstant();

        System.out.println(istant);
    }

}
