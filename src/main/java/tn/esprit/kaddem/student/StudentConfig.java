package tn.esprit.kaddem.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "mariam",LocalDate.of(2000, Month.JANUARY,5),"mariam.jamal@gmail.com"
            );
            Student alex = new Student(
                    "alex", LocalDate.of(1999, Month.JANUARY,11),"alex.jamal@gmail.com"
            );
            Student kaa = new Student(
                    "hssan", LocalDate.of(1996, Month.DECEMBER,11),"thekaa.22@gmail.com"
            );
        repository.saveAll(
                List.of(mariam,alex,kaa)
        );
        };
    }
}
