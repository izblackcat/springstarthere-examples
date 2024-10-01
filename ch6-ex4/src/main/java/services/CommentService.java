package services;


import aspects.ToLog;
import model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publishing comment : " + comment.text());
    }

    @ToLog
    public void deleteComment(Comment comment) {
        logger.info("Deleting comment : " + comment.text());
    }

    public void editComment(Comment comment) {
        logger.info("Editing comment : " + comment.text());
    }
}
