package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.EmailCommentNotificationProxy;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentServiceBean = context.getBean(CommentService.class);

        var comment = new Comment();
        comment.setAuthor("Zarkaoui");
        comment.setText("Test comment!");

        commentServiceBean.publishCommend(comment);
    }
}
