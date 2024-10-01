package services;

import model.Comment;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

public class CommentService {

    // store = repository
    private final CommentRepository commentRepository;

    // send = proxy
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishCommend(Comment comment) {
        this.commentRepository.storeComment(comment);
        this.commentNotificationProxy.sendComment(comment);
    }
}
