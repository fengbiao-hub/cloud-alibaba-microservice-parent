package prev.fengb.cloud.commons.model;

import java.io.Serializable;

import lombok.Data;

/**
 * 订单是实体类
 *
 * @author fengb
 * @date 2020年11月10日 上午11:09:21
 */
@Data
public class Order implements Serializable {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 1L;
	/** ID */
	private String id;
	/** 用户ID */
	private String userId;
	/** 产品ID */
	private String productId;
	/** 个数 */
	private Integer count;
	/** 消费钱数 */
	private Double money;
	/** 订单状态，0表示未下单成功，1表示下单成功 */
	private Integer status;
}
