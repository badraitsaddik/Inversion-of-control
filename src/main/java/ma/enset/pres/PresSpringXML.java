package ma.enset.pres;

import ma.enset.IMetier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = springContext.getBean("metier", IMetier.class); // utiliser le même nom que dans le fichier XML
        System.out.println(metier.calcul());
    }
}
