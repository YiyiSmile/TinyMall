package indi.tom.tinymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import indi.tom.common.utils.PageUtils;
import indi.tom.tinymall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 14:23:45
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

