package ma.enset.IMetier;
import ma.enset.Dao.DaoImpl;
import ma.enset.Dao.IDao;
public class MetierImpl implements IMetier{
    private IDao dao;

    public MetierImpl() {
        dao = new DaoImpl();
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
    //Injecter dans la variable dao un objet qui implimente l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
