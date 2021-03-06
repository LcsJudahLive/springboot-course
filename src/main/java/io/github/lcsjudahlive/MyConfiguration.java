package io.github.lcsjudahlive;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MyConfiguration {

    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistema de Vendas";
    }

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("Rodando config de desenvolvimento");
        };
    }

}
