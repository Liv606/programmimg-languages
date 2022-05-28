package aula10;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Aula10 {

    public static void main(String[] args) {

        Qualquer q = new Qualquer();
        try {
            q.pegaNome();
        } catch (IOException ex) {
            Logger.getLogger(Aula10.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Aula10.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(q.retornaValor());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
