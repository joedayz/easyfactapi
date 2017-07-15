package pe.joedayz.easyfact.config;

import javax.sql.DataSource;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class EasyFactConfig {

	@Bean
	@Primary
	@ConfigurationProperties(prefix = "spring.dataSource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("/messages");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}

	@Bean(name = "org.dozer.Mapper")
	public DozerBeanMapper dozerBean() {
		return new DozerBeanMapper();
	}

}
