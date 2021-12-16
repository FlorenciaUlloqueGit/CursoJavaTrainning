package com.bolsadeideas.springboot.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;


@Configuration // para terminar de inyectar los textos en los html
@PropertySources({
	@PropertySource("classpath:textos.properties")
})
public class TextoPropertiesConfig {

}
