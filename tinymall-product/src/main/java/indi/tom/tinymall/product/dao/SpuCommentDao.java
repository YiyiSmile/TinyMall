package indi.tom.tinymall.product.dao;

import indi.tom.tinymall.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-23 13:36:13
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
