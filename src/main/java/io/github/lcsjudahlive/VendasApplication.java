package io.github.lcsjudahlive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/*
    Already scanned by Spring, but it can be done using component scan
    to get repositories and services
*/
/*@ComponentScan(basePackages = {
    "io.github.lcsjudahlive.repository",
    "io.github.lcsjudahlive.service"
})*/
@SpringBootApplication
@RestController
public class VendasApplication {

    //Using Bean Configuration
    /*@Autowired
    @Qualifier("applicationName")
    private String applicationName;*/

    @Value("${application.name}")
    private String applicationName;

    //@Autowired
    //@Qualifier("gato")
    @Gato
    private Animal animal;

    @Bean(name = "executarAnimal")
    public CommandLineRunner executar(){
        return args -> {
            this.animal.fazerBarulho();
        };
    }

    @GetMapping("/hello")
    public String helloWorld(){
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
