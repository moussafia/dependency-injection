package ma.enset.media.metier;

import ma.enset.media.dao.IDao;

public class MetierImpl implements Imetier {
    private IDao iDao;

    public MetierImpl(IDao iDao) {
        this.iDao = iDao;
    }

    @Override
    public double calcule() {
        double t = iDao.getData();
        double result = t + Math.random()*10 + 2*Math.PI;
        return result;
    }
}
