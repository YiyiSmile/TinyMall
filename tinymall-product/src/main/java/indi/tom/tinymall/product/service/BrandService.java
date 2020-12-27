package indi.tom.tinymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import indi.tom.common.utils.PageUtils;
import indi.tom.tinymall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-23 13:36:18
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

