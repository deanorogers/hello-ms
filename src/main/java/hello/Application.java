package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.Integer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@RestController
public class Application {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public Article home() {
        logger.debug("About to issue greeting");
        Article article = new Article();
        article.setTitle("Paradise Postponed");
        // article.setId(new Integer(1).shortValue());
        article.setId((short)1);
        return article;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
