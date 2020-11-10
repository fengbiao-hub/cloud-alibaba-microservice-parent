package prev.fengb.cloud.account.mapper;

import java.util.List;

import prev.fengb.cloud.commons.model.Account;

/**
 * 账户Mapper层接口
 *
 * @author fengb
 * @date 2020年11月10日 上午11:56:14
 */
public interface AccountMapper {

	/**
	 * 列表查询所有用户账户信息
	 * 
	 * @return
	 */
	List<Account> list();

	/**
	 * 根据用户ID查询账户信息
	 * 
	 * @param userId
	 * @return
	 */
	Account getByUserId(String userId);

	/**
	 * 创建账户
	 * 
	 * @param account
	 * @return
	 */
	int add(Account account);

	/**
	 * 更新账户信息
	 * 
	 * @param account
	 * @return
	 */
	int update(Account account);

	/**
	 * 根据用户ID更新账户信息
	 * 
	 * @param account
	 * @return
	 */
	int updateByUserId(Account account);

	/**
	 * 根据用户ID删除账户信息
	 * 
	 * @param userId
	 * @return
	 */
	int delete(String userId);

}
