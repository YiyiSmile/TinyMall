package indi.tom.tinymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import indi.tom.common.utils.PageUtils;
import indi.tom.tinymall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 14:48:00
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

