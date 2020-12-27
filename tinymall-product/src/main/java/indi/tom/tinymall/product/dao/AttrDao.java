package indi.tom.tinymall.product.dao;

import indi.tom.tinymall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-23 13:36:19
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
