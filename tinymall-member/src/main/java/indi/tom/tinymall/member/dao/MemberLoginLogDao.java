package indi.tom.tinymall.member.dao;

import indi.tom.tinymall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 14:23:43
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
