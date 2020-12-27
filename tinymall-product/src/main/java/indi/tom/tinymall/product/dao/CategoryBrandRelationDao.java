package indi.tom.tinymall.product.dao;

import indi.tom.tinymall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-23 13:36:17
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
