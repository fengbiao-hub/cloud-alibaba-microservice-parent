package prev.fengb.cloud.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;
import prev.fengb.cloud.commons.model.Account;
import prev.fengb.cloud.commons.model.BaseResponse;

@RestController
@RequestMapping("account")
@Slf4j
public class AccountController {

	public static final String URL_ACCOUNT_PREFIX = "http://localhost:8001/account";

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("list")
	public BaseResponse list() {
		return restTemplate.getForObject(URL_ACCOUNT_PREFIX + "/list", BaseResponse.class);
	}

	@GetMapping("add")
	public BaseResponse add(Account account) {
		return restTemplate.postForObject(URL_ACCOUNT_PREFIX + "/add", account, BaseResponse.class);
	}

	@GetMapping("update")
	public BaseResponse update(Account account) {
		return restTemplate.postForObject(URL_ACCOUNT_PREFIX + "/update", account, BaseResponse.class);
	}

	@GetMapping("delete/{id}")
	public BaseResponse delete(@PathVariable("id") String id) {
		return restTemplate.postForObject(URL_ACCOUNT_PREFIX + "/delete/" + id, null, BaseResponse.class);
	}
}
