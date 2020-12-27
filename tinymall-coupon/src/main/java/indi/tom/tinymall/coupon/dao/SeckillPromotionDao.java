package indi.tom.tinymall.coupon.dao;

import indi.tom.tinymall.coupon.entity.SeckillPromotionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 12:45:29
 */
@Mapper
public interface SeckillPromotionDao extends BaseMapper<SeckillPromotionEntity> {
	
}
