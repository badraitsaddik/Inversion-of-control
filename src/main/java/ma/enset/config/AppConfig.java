package ma.enset.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ma.enset.Dao", "ma.enset.IMetier"})
public class AppConfig {
    // Aucun besoin de contenu ici si vous ne le souhaitez pas
}

