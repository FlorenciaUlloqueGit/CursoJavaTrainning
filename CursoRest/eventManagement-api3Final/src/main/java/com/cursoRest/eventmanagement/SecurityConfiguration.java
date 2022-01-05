package com.cursoRest.eventmanagement;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.util.AntPathMatcher;


@Configuration
@EnableGlobalMethodSecurity(prePostEnabled=true) //habilitamos la seguridad ambos antes y despues de invocar a un método
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception { //usa por debajo AuthenticationManagerBuilder que sirve para configurar roles, usuarios y contraseñas .

		auth.inMemoryAuthentication().withUser("florencia").password("{noop}ulloque").roles("USER").and( //defino dos usuarios con su nombre, pass y rol
				).withUser("admin").password("{noop}12345").roles("ADMIN"); //indica como se van a configurar en principio. puede ser tambien jdbc based autentication, etc.
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception { //configurtación de autenticación y de autorización. se usa HTTPSecurity 
		http.httpBasic().and().authorizeRequests().antMatchers(HttpMethod.POST,"/events").hasRole("ADMIN").antMatchers(HttpMethod.PUT, "/events/**").hasRole("ADMIN")
		.antMatchers(HttpMethod.PATCH, "/events/**").hasRole("ADMIN").and().csrf().disable();
		
		//clasificacion de referencia de sittios cruzados es uyna configuracion de spring security que habilita nuestras aplicaciones a ser seguras de secuencias de comandos de sitios cruzados que el cliente puede usar. 
		//es bueno para apps webs pero no para apps restful ya que no ocurre practicamente en el mundo restful, por lo que para deshabilitarlo usamos el metodo acá. en este segundo método tenemos que hacer una llamada adicional
	}
}


//con las ultimas versiones de springboot la contraseña no puede ser almacenada como texto sin formato, para esay que agregar {noop} adelante de la contra