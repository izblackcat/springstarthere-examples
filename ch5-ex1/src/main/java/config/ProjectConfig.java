package config;

import beans.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public CommentService commentService() {
        return new CommentService();
    }

}
