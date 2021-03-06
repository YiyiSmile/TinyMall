package indi.tom.tinymall.coupon.dao;

import indi.tom.tinymall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 12:45:29
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
