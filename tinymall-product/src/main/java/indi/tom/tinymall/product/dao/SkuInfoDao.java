package indi.tom.tinymall.product.dao;

import indi.tom.tinymall.product.entity.SkuInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * sku信息
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-23 13:36:15
 */
@Mapper
public interface SkuInfoDao extends BaseMapper<SkuInfoEntity> {
	
}
