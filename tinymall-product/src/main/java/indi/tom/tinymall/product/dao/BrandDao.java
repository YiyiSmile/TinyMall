package indi.tom.tinymall.product.dao;

import indi.tom.tinymall.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-23 13:36:18
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
