package ma.enset.media.metier;

import ma.enset.media.dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements Imetier {
    private IDao iDao;

    public MetierImpl(@Qualifier("d") IDao iDao) {
        this.iDao = iDao;
    }

    @Override
    public double calcule() {
        double t = iDao.getData();
        double result = t + Math.random()*10 + 2*Math.PI;
        return result;
    }
}
