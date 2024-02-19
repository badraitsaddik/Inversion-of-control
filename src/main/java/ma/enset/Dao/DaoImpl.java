package ma.enset.Dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {

        /*Se connecter a la base de données*/
        System.out.println("Version de la base de données");
        double temp = Math.random()*40;
        return temp;
    }
}
