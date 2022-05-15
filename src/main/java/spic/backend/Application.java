package spic.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spic.backend.icd.Category;
import spic.backend.repository.CategoryRepository;

import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(CategoryRepository.class, args);

    }

}
