package indi.tom.tinymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import indi.tom.common.utils.PageUtils;
import indi.tom.tinymall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 14:23:42
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

