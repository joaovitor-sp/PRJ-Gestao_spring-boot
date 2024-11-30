package com.example.prjgestao.corsConfig; // Coloque o pacote adequado ao seu projeto

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Permitir CORS para todos os endpoints
                        .allowedOrigins("*") // Origem permitida (seu frontend)
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // Métodos permitidos
                        .allowedHeaders("*") // Cabeçalhos permitidos
                        .allowCredentials(false); // Se precisar enviar cookies/sessões
            }
        };
    }
}
