package indi.tom.tinymall.ware.dao;

import indi.tom.tinymall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 14:55:15
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
