import beans.CommentService;
import beans.UserService;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var userService = context.getBean(UserService.class);

        var commentService = context.getBean(CommentService.class);
        
        boolean b = userService.getRepository() == commentService.getRepository();

        System.out.println(b);

    }
}
