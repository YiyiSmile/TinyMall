package indi.tom.tinymall.ware.dao;

import indi.tom.tinymall.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 14:55:14
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
