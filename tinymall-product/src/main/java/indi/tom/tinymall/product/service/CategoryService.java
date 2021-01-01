package indi.tom.tinymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import indi.tom.common.utils.PageUtils;
import indi.tom.tinymall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-23 13:36:17
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

	List<CategoryEntity> listWithTree();

	void removeCategoryByIds(List<Long> asList);
}

