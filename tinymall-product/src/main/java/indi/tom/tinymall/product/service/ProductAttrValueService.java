package indi.tom.tinymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import indi.tom.common.utils.PageUtils;
import indi.tom.tinymall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-23 13:36:16
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

