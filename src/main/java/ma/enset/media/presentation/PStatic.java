package ma.enset.media.presentation;

import ma.enset.media.dao.IDao;
import ma.enset.media.dao.IDaoImpl;
import ma.enset.media.metier.Imetier;
import ma.enset.media.metier.MetierImpl;

public class PStatic {
    public static void main(String[] args) {
        System.out.println("**************** instanciation statique ****************");
        IDao iDao = new IDaoImpl(); // instanciation statique
        Imetier imetier = new MetierImpl(iDao);
        System.out.println("Result de calcule : " + imetier.calcule());
    }
}
