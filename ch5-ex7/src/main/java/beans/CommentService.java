package beans;


import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private ApplicationContext context;

    public void sendComment(Comment comment) {

        CommentProcessor processor = context.getBean(CommentProcessor.class);

        processor.setComment(comment);
        processor.processComment();
        processor.validateComment();

        comment = processor.getComment();
        System.out.println("SendComment : " + comment);
    }
}
