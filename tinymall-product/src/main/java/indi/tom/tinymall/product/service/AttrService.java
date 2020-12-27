package indi.tom.tinymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import indi.tom.common.utils.PageUtils;
import indi.tom.tinymall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-23 13:36:19
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

