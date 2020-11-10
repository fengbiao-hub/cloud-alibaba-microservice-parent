package prev.fengb.cloud.order.mapper;

import java.util.List;

import prev.fengb.cloud.commons.model.Order;

/**
 * 订单信息Mapper接口层
 *
 * @author fengb
 * @date 2020年11月10日 下午4:02:52
 */
public interface OrderMapper {

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
