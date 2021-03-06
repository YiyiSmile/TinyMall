package indi.tom.tinymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import indi.tom.common.utils.PageUtils;
import indi.tom.tinymall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-23 13:36:17
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

