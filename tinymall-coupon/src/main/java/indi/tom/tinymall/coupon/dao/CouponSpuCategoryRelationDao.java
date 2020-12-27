package indi.tom.tinymall.coupon.dao;

import indi.tom.tinymall.coupon.entity.CouponSpuCategoryRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券分类关联
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 12:45:32
 */
@Mapper
public interface CouponSpuCategoryRelationDao extends BaseMapper<CouponSpuCategoryRelationEntity> {
	
}
