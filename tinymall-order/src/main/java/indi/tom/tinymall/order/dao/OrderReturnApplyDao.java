package indi.tom.tinymall.order.dao;

import indi.tom.tinymall.order.entity.OrderReturnApplyEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单退货申请
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 14:47:58
 */
@Mapper
public interface OrderReturnApplyDao extends BaseMapper<OrderReturnApplyEntity> {
	
}
