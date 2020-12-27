package indi.tom.tinymall.coupon.dao;

import indi.tom.tinymall.coupon.entity.SeckillSkuNoticeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀商品通知订阅
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 12:45:28
 */
@Mapper
public interface SeckillSkuNoticeDao extends BaseMapper<SeckillSkuNoticeEntity> {
	
}
