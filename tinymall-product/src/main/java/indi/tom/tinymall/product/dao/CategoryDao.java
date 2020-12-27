package indi.tom.tinymall.product.dao;

import indi.tom.tinymall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-23 13:36:17
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
