package indi.tom.tinymall.order.dao;

import indi.tom.tinymall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 14:47:59
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
