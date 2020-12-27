package indi.tom.tinymall.coupon.dao;

import indi.tom.tinymall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 12:45:33
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
