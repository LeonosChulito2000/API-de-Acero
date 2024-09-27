/*
 * CLICK NBFS://NBHOST/SYSTEMFILESTEMPLATES/LICENSES/LICENSE-DEFAULT.TXT TO CHANGE THIS LICENSE
 * CLICK NBFS://NBHOST/SYSTEMFILESTEMPLATES/CLASSES/CLASS.JAVA TO EDIT THIS TEMPLATE
 */
package com.CL.acero.config;

// IMPORTACIÓN DE ANOTACIONES DE SPRING
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// IMPORTACIÓN DE CLASES DE SWAGGER
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

/**
 * CONFIGURACIÓN DE SWAGGER PARA LA DOCUMENTACIÓN DE LA API.
 *
 * @AUTHOR LEO
 * @AUTHOR CAYE
 */
@Configuration // ANOTACIÓN QUE INDICA QUE ESTA CLASE ES UNA CLASE DE CONFIGURACIÓN DE SPRING
public class SwaggerConfig {

    // MÉTODO QUE DEFINE UN BEAN PARA LA CONFIGURACIÓN DE SWAGGER
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI() // CREACIÓN DE UNA INSTANCIA DE OpenAPI
                .info(new Info() // CONFIGURACIÓN DE LA INFORMACIÓN DE LA API
                        .title("API DE ACERO") // TÍTULO DE LA API
                        .version("1.0.0") // VERSIÓN DE LA API
                        .description("DOCUMENTACIÓN DE LA API PARA EL PROYECTO ACERO")); // DESCRIPCIÓN DE LA API
    }
}
