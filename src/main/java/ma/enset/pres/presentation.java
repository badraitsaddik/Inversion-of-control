package ma.enset.pres;

import ma.enset.Dao.DaoImpl;
import ma.enset.IMetier.MetierImpl;

public class presentation {
    public static void main(String[] args) {

        /*Injection des dependances par instanciation statique*/

        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
