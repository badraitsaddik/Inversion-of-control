package ma.enset.pres;

import ma.enset.IMetier.IMetier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("Dao","IMetier"); //scan les class dans ces packages , quand il trouve :l'annotation Component crée une instanciation de cette classe , autowired fait l injection des dependances
        IMetier metier=context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}

