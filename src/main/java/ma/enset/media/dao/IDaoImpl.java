package ma.enset.media.dao;

public class IDaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capture");
        double t = 34;
        return t;
    }
}
