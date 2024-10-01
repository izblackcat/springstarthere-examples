package services;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;


@Service
public class CommentService {

    // store = repository
    private final CommentRepository commentRepository;

    // send = proxy
    private final CommentNotificationProxy commentNotificationProxy;



    @Autowired //optional
    public CommentService(CommentRepository commentRepository, @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishCommend(Comment comment) {
        this.commentRepository.storeComment(comment);
        this.commentNotificationProxy.sendComment(comment);
    }
}
