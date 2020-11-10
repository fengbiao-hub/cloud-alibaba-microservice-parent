package prev.fengb.cloud.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 账单微服务
 *
 * @author fengb
 * @date 2020年11月10日 上午11:32:46
 */
@SpringBootApplication
@MapperScan(basePackages = "prev.fengb.cloud.account.mapper") // 扫描Mapper接口
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("                        启动成功                                               ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
}
