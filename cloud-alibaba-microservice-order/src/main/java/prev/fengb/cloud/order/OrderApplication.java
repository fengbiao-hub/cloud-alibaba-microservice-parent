package prev.fengb.cloud.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 订单微服务
 *
 * @author fengb
 * @date 2020年11月10日 下午3:54:32
 */
@SpringBootApplication
@MapperScan(basePackages = "prev.fengb.cloud.order.mapper")
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("                        启动成功                                               ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
}
