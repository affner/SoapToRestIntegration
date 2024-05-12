package com.demo.integration;


import jakarta.security.auth.message.config.AuthConfigFactory;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.authenticator.jaspic.AuthConfigFactoryImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;



@SpringBootApplication
@ConfigurationPropertiesScan("com")
@Slf4j
@ComponentScan(basePackages = {"com"})
public class IntegrationSoapToRest implements CommandLineRunner {


    /**
     * Main method to initialize the application via spring boot instead of war.
     *
     * @param args
     */
    public static void main(String[] args) {
        log.info("***************************INICIANDO APLICACION***************************");
        if (AuthConfigFactory.getFactory() == null) {
            AuthConfigFactory.setFactory(new AuthConfigFactoryImpl());
        }
        SpringApplication.run(IntegrationSoapToRest.class);
        log.info("***************************APLICACION INICIADA***************************");
    }

    @Override
    public void run(String... args) {
        log.info("EJECUTANDO : command line runner");

        for (int i = 0; i < args.length; ++i) {
            log.info("args[{}]: {}", i, args[i]);
        }
    }

    /**
     * Method that allows us to read from a properties.
     *
     * @return
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }



}
