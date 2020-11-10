package prev.fengb.cloud.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hutool.core.util.IdUtil;
import lombok.extern.slf4j.Slf4j;
import prev.fengb.cloud.commons.model.Order;
import prev.fengb.cloud.order.mapper.OrderMapper;
import prev.fengb.cloud.order.service.OrderService;

/**
 * 订单信息Service层实现
 *
 * @author fengb
 * @date 2020年11月10日 下午4:18:43
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper orderMapper;

	@Override
	public List<Order> list() {
		return orderMapper.list();
	}

	@Override
	public Order getById(String id) {
		return orderMapper.getById(id);
	}

	@Override
	public int add(Order order) {
		order.setId(IdUtil.fastSimpleUUID());
		log.info("创建订单【" + order.getId() + "】");
		return orderMapper.add(order);
	}

	@Override
	public int update(Order order) {
		return orderMapper.update(order);
	}

	@Override
	public int delete(String id) {
		log.info("删除订单【" + id + "】");
		return orderMapper.delete(id);
	}

}
