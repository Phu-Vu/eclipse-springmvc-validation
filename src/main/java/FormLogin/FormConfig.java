package FormLogin;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration	//để spring biết rằng đây là file cấu hình của Spring
@EnableWebMvc	//cho phép mvc sử dụng các file cấu hình
@ComponentScan(basePackages = "FormLogin")		//spring sẽ quét hết tất cả package rồi cấu hình tương ứng
public class FormConfig extends WebMvcConfigurerAdapter{
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	@Bean
	public MessageSource messageSource() {	//load nội dung trong file messages.properties
		ReloadableResourceBundleMessageSource bundleMessageSource = new ReloadableResourceBundleMessageSource();
		bundleMessageSource.setBasename("classpath:messages");	//classpath là sẽ trỏ đến thư mục chính là src/main/java
		bundleMessageSource.setDefaultEncoding("utf-8");
		return bundleMessageSource;
	
	}
}
