package indi.tom.tinymall.order.dao;

import indi.tom.tinymall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 14:47:57
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
