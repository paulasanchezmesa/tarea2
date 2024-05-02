package eviden;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("eviden")
@PropertySource("classpath:datosDocumento.propiedades")
public class DocumentoConfig {

}
