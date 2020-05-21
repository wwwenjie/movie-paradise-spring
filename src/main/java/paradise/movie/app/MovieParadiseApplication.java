package paradise.movie.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"paradise.movie.app.dao"})
public class MovieParadiseApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieParadiseApplication.class, args);
    }

}
