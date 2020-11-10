package prev.fengb.cloud.commons.model;

import java.io.Serializable;

import lombok.Data;

/**
 * 账户实体类
 *
 * @author fengb
 * @date 2020年11月10日 上午11:22:17
 */
@Data
public class Account implements Serializable {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 1L;
	/** ID */
	private String Id;
	/** 用户ID */
	private String userId;
	/** 账户余额 */
	private Double total;
}
