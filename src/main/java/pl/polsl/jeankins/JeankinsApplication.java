package pl.polsl.jeankins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JeankinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JeankinsApplication.class, args);
    }

    public int added(int a, int b){
        return a + b;
    }

}
