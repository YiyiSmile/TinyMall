package indi.tom.tinymall.order.dao;

import indi.tom.tinymall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 14:48:00
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
