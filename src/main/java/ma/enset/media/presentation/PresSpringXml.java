package ma.enset.media.presentation;

import ma.enset.media.metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXml {
    public static void main(String[] args) {
        System.out.println("version xml");
        ApplicationContext springContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Imetier imetier = (Imetier) springContext.getBean("metier");
        System.out.println("Result de calcule : " + imetier.calcule());

    }
}
