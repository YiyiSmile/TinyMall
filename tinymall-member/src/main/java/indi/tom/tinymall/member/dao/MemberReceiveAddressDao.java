package indi.tom.tinymall.member.dao;

import indi.tom.tinymall.member.entity.MemberReceiveAddressEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员收货地址
 * 
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 14:23:42
 */
@Mapper
public interface MemberReceiveAddressDao extends BaseMapper<MemberReceiveAddressEntity> {
	
}
