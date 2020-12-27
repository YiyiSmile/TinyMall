package indi.tom.tinymall.coupon.dao;

import indi.tom.tinymall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 12:45:31
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
