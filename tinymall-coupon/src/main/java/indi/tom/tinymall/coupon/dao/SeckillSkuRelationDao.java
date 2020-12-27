package indi.tom.tinymall.coupon.dao;

import indi.tom.tinymall.coupon.entity.SeckillSkuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 12:45:27
 */
@Mapper
public interface SeckillSkuRelationDao extends BaseMapper<SeckillSkuRelationEntity> {
	
}
