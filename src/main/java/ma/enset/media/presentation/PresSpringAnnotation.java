package ma.enset.media.presentation;

import ma.enset.media.metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        System.out.println("version annotation");
        ApplicationContext context = new AnnotationConfigApplicationContext("ma.enset.media");
        Imetier imetier = context.getBean(Imetier.class);
        System.out.println("Result de calcule : " + imetier.calcule());

    }
}
