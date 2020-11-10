package prev.fengb.cloud.account.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hutool.core.util.IdUtil;
import lombok.extern.slf4j.Slf4j;
import prev.fengb.cloud.account.mapper.AccountMapper;
import prev.fengb.cloud.account.service.AccountService;
import prev.fengb.cloud.commons.model.Account;
import prev.fengb.cloud.commons.util.MathUtils;

/**
 * 账户信息Service接口实现
 *
 * @author fengb
 * @date 2020年11月10日 下午1:51:47
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountMapper accountMapper;

	@Override
	public List<Account> list() {
		return accountMapper.list();
	}

	@Override
	public Account getByUserId(String userId) {
		log.info("查询客户【" + userId + "】的账户信息");
		return accountMapper.getByUserId(userId);
	}

	@Override
	public int add(Account account) {
		account.setId(IdUtil.fastSimpleUUID());
		log.info("客户【" + account.getUserId() + "】开户，账户ID为" + account.getId());
		return accountMapper.add(account);
	}

	@Override
	public int update(Account account) {
		return accountMapper.update(account);
	}

	@Override
	public int updateByUserId(String userId, Double money) {
		Account account = accountMapper.getByUserId(userId);
		if (account == null) {
			throw new RuntimeException("ID为" + userId + "的客户不存在！");
		}
		Double total = account.getTotal();
		if (MathUtils.compareDouble(total, money) == -1) {
			throw new RuntimeException("ID为" + userId + "的客户账户余额不足，请充值后再试！");
		}
		account.setTotal(MathUtils.addDouble(total, money));
		return accountMapper.updateByUserId(account);
	}

	@Override
	public int delete(String userId) {
		log.info("客户【" + userId + "】销户！");
		return accountMapper.delete(userId);
	}

}
