package br.com.rd.gestaoTransporte.configuration;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import io.swagger.models.auth.In;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurationSupport {
	
	
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
		registry.addResourceHandler("/**").addResourceLocations("classpath:/META-INF/resources/","classpath:/resources/", "classpath:/static/");
	}

	

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("br.com.rd.gestaoTransporte"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(metaData())
				.globalResponseMessage(RequestMethod.GET, Arrays.asList(m400, m403, m404, m422, m500))
				.globalResponseMessage(RequestMethod.POST, Arrays.asList(m201, m400, m401,m403, m404, m422, m500))
				.globalResponseMessage(RequestMethod.PUT, Arrays.asList(m202, m400, m403, m404, m422, m500))
				.globalResponseMessage(RequestMethod.DELETE, Arrays.asList(m400, m404, m403, m500))
				.securitySchemes(Arrays.asList(new ApiKey("Token Access", HttpHeaders.AUTHORIZATION, In.HEADER.name())));
				//.securityContexts(Arrays.asList(securityContext()));
	}
	
	private ApiInfo metaData() {
		return new ApiInfoBuilder()
				.title("Gest�o Transporte")
				.description("\"Spring Boot REST API\"")
				.version("1.0.0")
				.license("Apache License Version 2.0")
				.licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
				.build();
	}


	private final ResponseMessage m201 = simpleMessage(201, "Recurso criado");
	private final ResponseMessage m202 = simpleMessage(204, "Atualização OK");
	private final ResponseMessage m400 = simpleMessage(400, "Erro inesperado");
	private final ResponseMessage m401 = simpleMessage(401, "Não autorizado");
	private final ResponseMessage m403 = simpleMessage(403, "Acesso Negado");
	private final ResponseMessage m404 = simpleMessage(404, "Não encontrado");
	private final ResponseMessage m422 = simpleMessage(422, "Erro de validação");
	private final ResponseMessage m500 = simpleMessage(500, "Erro do Servidor Interno");

	private ResponseMessage simpleMessage(int code, String msg) {
		return new ResponseMessageBuilder()
				.code(code)
				.message(msg)
				.build();
	}
/*
	private List<SecurityReference> defaultAuth() {
		AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
		AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
		authorizationScopes[0] = authorizationScope;
		return Arrays.asList(new SecurityReference("apiKey", authorizationScopes));
	}

	
	private SecurityContext securityContext() {
		return SecurityContext.builder()
				.securityReferences(defaultAuth())
				.forPaths(PathSelectors.ant("/service/**"))
				.build();
	} */
}