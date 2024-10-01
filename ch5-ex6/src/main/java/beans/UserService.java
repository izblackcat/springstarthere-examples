package beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private CommentRepository repository;


    public CommentRepository getRepository() {
        return repository;
    }
}
