import beans.Parrot;
import beans.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {

    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Kikio");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Kagome");
        return p;
    }


//    @Bean
//    public Person person(@Qualifier("parrot2") Parrot parrot1) {
//        Person p = new Person();
//        p.setName("Luke");
//        p.setParrot(parrot1);
//        return p;
//    }

}
