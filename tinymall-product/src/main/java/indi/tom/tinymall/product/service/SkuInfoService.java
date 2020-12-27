package indi.tom.tinymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import indi.tom.common.utils.PageUtils;
import indi.tom.tinymall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-23 13:36:15
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

