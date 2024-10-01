import beans.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p = context.getBean(Person.class);

        System.out.println("beans.Person's name: " + p.getName());
        System.out.println("beans.Person's parrot: " + p.getParrot());

    }

}
