import beans.CommentService;
import beans.UserService;
import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("iz");
        comment.setText("My test comment!");
        comment.setValidated(false);
        comment.setProcessed(false);

        commentService.sendComment(comment);

    }
}
