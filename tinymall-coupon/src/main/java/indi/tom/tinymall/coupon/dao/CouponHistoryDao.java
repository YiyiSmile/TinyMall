package indi.tom.tinymall.coupon.dao;

import indi.tom.tinymall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 12:45:32
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
