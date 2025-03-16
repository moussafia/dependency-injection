package ma.enset.media.presentation;

import ma.enset.media.dao.IDao;
import ma.enset.media.metier.Imetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class PresDynamic {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        System.out.println("Instanciation dynamique");
        Scanner scanner = new Scanner(new File("src/config.txt"));
        String daoClassName = scanner.nextLine();
        Class cdao = Class.forName(daoClassName);
        IDao d = (IDao) cdao.newInstance();

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        Imetier imetier = (Imetier) cMetier.getConstructor(IDao.class).newInstance(d);

        System.out.println("Resultat : " + imetier.calcule());

    }
}
