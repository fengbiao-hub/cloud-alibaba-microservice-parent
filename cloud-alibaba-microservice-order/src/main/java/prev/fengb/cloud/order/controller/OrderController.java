package prev.fengb.cloud.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import prev.fengb.cloud.commons.model.BaseResponse;
import prev.fengb.cloud.commons.model.Order;
import prev.fengb.cloud.order.service.OrderService;

/**
 * 订单信息Controller层
 *
 * @author fengb
 * @date 2020年11月10日 下午4:31:26
 */
@RestController
@RequestMapping("order")
@Slf4j
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("list")
	public BaseResponse list() {
		List<Order> orders = orderService.list();
		return new BaseResponse(200, "OK", orders);
	}

	@GetMapping("get/{id}")
	public BaseResponse get(@PathVariable("id") String id) {
		Order order = orderService.getById(id);
		return new BaseResponse(200, "OK", order);
	}

	@PostMapping("add")
	public BaseResponse add(@RequestBody Order order) {
		int result = orderService.add(order);
		return new BaseResponse(200, "OK", result);
	}

	@PostMapping("update")
	public BaseResponse update(@RequestBody Order order) {
		int result = orderService.update(order);
		return new BaseResponse(200, "OK", result);
	}

	@PostMapping("delete/{id}")
	public BaseResponse delete(@PathVariable("id") String id) {
		int result = orderService.delete(id);
		return new BaseResponse(200, "OK", result);
	}
}
