package prev.fengb.cloud.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Rest组件相关配置类
 *
 * @author fengb
 * @date 2020年11月10日 下午4:48:45
 */
@Configuration
public class RestConfig {

	/**
	 * 向容器中注入RestTemplate组件
	 * 
	 * @return
	 */
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
