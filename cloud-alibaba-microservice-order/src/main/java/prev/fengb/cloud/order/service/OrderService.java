package prev.fengb.cloud.order.service;

import java.util.List;

import prev.fengb.cloud.commons.model.Order;

/**
 * 订单信息Service层接口
 *
 * @author fengb
 * @date 2020年11月10日 下午4:15:44
 */
public interface OrderService {

	/**
	 * 列表展示订单信息
	 * 
	 * @return
	 */
	List<Order> list();

	/**
	 * 根据ID获取订单信息
	 * 
	 * @return
	 */
	Order getById(String id);

	/**
	 * 创建订单信息
	 * 
	 * @param order
	 * @return
	 */
	int add(Order order);

	/**
	 * 更新订单信息
	 * 
	 * @param order
	 * @return
	 */
	int update(Order order);

	/**
	 * 根据ID删除订单信息
	 * 
	 * @param id
	 * @return
	 */
	int delete(String id);
}
