package indi.tom.tinymall.member.dao;

import indi.tom.tinymall.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 14:23:43
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {
	
}
