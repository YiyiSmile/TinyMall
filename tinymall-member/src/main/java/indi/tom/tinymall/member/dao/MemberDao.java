package indi.tom.tinymall.member.dao;

import indi.tom.tinymall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 14:23:45
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
