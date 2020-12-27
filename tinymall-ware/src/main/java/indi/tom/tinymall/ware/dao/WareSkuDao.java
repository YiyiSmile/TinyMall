package indi.tom.tinymall.ware.dao;

import indi.tom.tinymall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 14:55:13
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
