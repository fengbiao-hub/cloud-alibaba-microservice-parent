package prev.fengb.cloud.commons.model;

import java.io.Serializable;

import lombok.Data;

/**
 * 库存实体类
 *
 * @author fengb
 * @date 2020年11月10日 上午11:18:42
 */
@Data
public class Storage implements Serializable {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 1L;
	/** ID */
	private String id;
	/** 商品ID */
	private String productId;
	/** 库存总量 */
	private Integer total;
	/** 销量 */
	private Integer used;
	/** 剩余个数 */
	private Integer residue;
}
