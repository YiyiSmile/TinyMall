package indi.tom.tinymall.product.dao;

import indi.tom.tinymall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-23 13:36:16
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
