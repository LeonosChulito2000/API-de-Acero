package com.CL.acero;

// IMPORTACIÓN DE CLASES NECESARIAS DE SPRING BOOT
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// ANOTACIÓN QUE INDICA QUE ESTA CLASE ES UNA APLICACIÓN SPRING
@SpringBootApplication
public class AceroApplication {

    // MÉTODO PRINCIPAL QUE INICIA LA APLICACIÓN
    public static void main(String[] args) {
        // INICIA LA APLICACIÓN SPRING
        SpringApplication.run(AceroApplication.class, args);
    }
}
