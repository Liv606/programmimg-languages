package aula10;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Qualquer {

    String nome;

    public Qualquer() {
        if (new GregorianCalendar().get(Calendar.HOUR_OF_DAY) > 7) {
            nome = null;
        } else {
            nome = "BATATON";
        }
    }

    public String pegaPrimeira() throws Exception {
        return nome.substring(0, 1);
    }

    public String retornaValor() throws Exception {
        return pegaPrimeira();
    }

    public String pegaNome() throws IOException, SQLException {
        if (nome == null) {
            throw new SQLException("Deu ruim");
        }

        FileWriter w = new FileWriter(nome);
        return ":D";
    }

}
