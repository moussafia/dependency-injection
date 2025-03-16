package ma.enset.media.dao;

import org.springframework.stereotype.Repository;

@Repository("d")
public class IDaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capture");
        double t = 34;
        return t;
    }
}
