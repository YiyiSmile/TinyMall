package indi.tom.tinymall.order.dao;

import indi.tom.tinymall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 14:47:56
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
