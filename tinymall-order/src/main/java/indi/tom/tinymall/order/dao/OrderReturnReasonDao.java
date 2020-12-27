package indi.tom.tinymall.order.dao;

import indi.tom.tinymall.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 14:47:58
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
