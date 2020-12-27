package indi.tom.tinymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import indi.tom.common.utils.PageUtils;
import indi.tom.tinymall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 14:47:59
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

