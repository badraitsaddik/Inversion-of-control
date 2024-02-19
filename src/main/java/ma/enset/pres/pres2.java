package ma.enset.pres;

import ma.enset.Dao.IDao;
import ma.enset.IMetier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws Exception {

/*Injection des dependances par instanciation dynamique*/

        Scanner sc = new Scanner(new File("config.txt"));
        String daoClassName = sc.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();
        System.out.println(dao.getData());

        String metierClassName = sc.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();
        Method m = cMetier.getMethod("setDao", IDao.class);
        m.invoke(metier, dao);
        System.out.println(metier.calcul());
    }
}
