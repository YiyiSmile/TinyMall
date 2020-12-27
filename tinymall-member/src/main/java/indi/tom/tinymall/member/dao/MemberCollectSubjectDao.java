package indi.tom.tinymall.member.dao;

import indi.tom.tinymall.member.entity.MemberCollectSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员收藏的专题活动
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 14:23:44
 */
@Mapper
public interface MemberCollectSubjectDao extends BaseMapper<MemberCollectSubjectEntity> {
	
}
