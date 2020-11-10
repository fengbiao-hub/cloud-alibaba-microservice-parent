package prev.fengb.cloud.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import prev.fengb.cloud.account.service.AccountService;
import prev.fengb.cloud.commons.model.Account;
import prev.fengb.cloud.commons.model.BaseResponse;

/**
 * 账户信息Controller层
 *
 * @author fengb
 * @date 2020年11月10日 下午2:50:14
 */
@Slf4j
@RequestMapping("account")
@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	/**
	 * 列表查询所有的账户信息
	 * 
	 * @return
	 */
	@GetMapping("list")
	public BaseResponse list() {
		List<Account> accounts = accountService.list();
		return new BaseResponse(200, "OK", accounts);
	}

	/**
	 * 根据用户ID查询单个账户信息
	 * 
	 * @param userId
	 * @return
	 */
	@GetMapping("get/{id}")
	public BaseResponse get(@PathVariable("id") String userId) {
		Account account = accountService.getByUserId(userId);
		return new BaseResponse(200, "OK", account);
	}

	/**
	 * 增加账户信息
	 * 
	 * @param account
	 * @return
	 */
	@PostMapping("add")
	public BaseResponse add(@RequestBody Account account) {
		int result = accountService.add(account);
		return new BaseResponse(200, "OK", result);
	}

	/**
	 * 删除账户信息
	 * 
	 * @param userId
	 * @return
	 */
	@PostMapping("delete/{id}")
	public BaseResponse delete(@PathVariable("id") String userId) {
		int result = accountService.delete(userId);
		return new BaseResponse(200, "OK", result);
	}

	/**
	 * 更新账户信息
	 * 
	 * @param account
	 * @return
	 */
	@PostMapping("update")
	public BaseResponse update(@RequestBody Account account) {
		int result = accountService.update(account);
		return new BaseResponse(200, "OK", result);
	}

	/**
	 * 根据用户ID更新账户金额
	 * 
	 * @param userId
	 * @param money
	 * @return
	 */
	@GetMapping("update")
	public BaseResponse updateByUserId(String userId, Double money) {
		int result = 0;
		try {
			result = accountService.updateByUserId(userId, money);
		} catch (Exception e) {
			log.error(e.getMessage());
			return new BaseResponse(500, "FAILED", e.getMessage());
		}
		return new BaseResponse(200, "OK", result);
	}
}
