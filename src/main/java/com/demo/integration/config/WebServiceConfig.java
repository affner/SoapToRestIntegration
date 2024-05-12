package com.demo.integration.config;

import com.demo.integration.controller.ConsultingServicesEndpoint;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
        MessageDispatcherServlet messagerDispatcherServlet = new MessageDispatcherServlet();
        messagerDispatcherServlet.setApplicationContext(context);
        messagerDispatcherServlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(messagerDispatcherServlet, "/ws/*");
    }

    @Bean(name = "integrationPlay")
    public Wsdl11Definition defaultWsdl11Definition() {
        SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
        wsdl11Definition.setWsdl(new ClassPathResource("/wsdl/consultatitularidadServices.wsdl"));
        return wsdl11Definition;
    }

    // se puede tomar este wsdl de prueba para declarar el de nuevos servicios
    @Bean(name = "demoWsdl")
    public Wsdl11Definition demoWsdl() {
        SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
        wsdl11Definition.setWsdl(new ClassPathResource("/wsdl/consultatitularidadServices.wsdl"));
        return wsdl11Definition;
    }

    @Bean
    ConsultingServicesEndpoint consultingServicesEndpoint() {
        return new ConsultingServicesEndpoint();
    }





}
