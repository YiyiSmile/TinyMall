package indi.tom.tinymall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import indi.tom.common.utils.PageUtils;
import indi.tom.common.utils.Query;

import indi.tom.tinymall.product.dao.CategoryDao;
import indi.tom.tinymall.product.entity.CategoryEntity;
import indi.tom.tinymall.product.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		IPage<CategoryEntity> page = this.page(new Query<CategoryEntity>().getPage(params),
				new QueryWrapper<CategoryEntity>());

		return new PageUtils(page);
	}

	/**
	 * get the category result(navigator menu on the home page of the website) and construct a tree(represented through 
	 * a list of Category which has a child filed which points to a list of EntityCategory).
	 */
	@Override
	public List<CategoryEntity> listWithTree() {

		// baseMapper is located in parent class which is a object of CategoryDao, so
		// you don't need to define an additional CategoryDao
		// field which is autowired.
		List<CategoryEntity> entities = baseMapper.selectList(null);
		List<CategoryEntity> level1Menu = entities.stream().filter(entity -> entity.getParentCid() == 0).map(entity -> {
			entity.setChilds(getChildList(entity, entities));
			return entity;
		}).sorted((entity1, entity2) -> entity1.getSort() - entity2.getSort()).collect(Collectors.toList());

		return level1Menu;
	}

	private List<CategoryEntity> getChildList(CategoryEntity current, List<CategoryEntity> entities) {

		List<CategoryEntity> list = entities.stream().filter(entity -> entity.getParentCid() == current.getCatId())
				.map(entity -> {
					entity.setChilds(getChildList(entity, entities));
					return entity;
				}).sorted((entity1, entity2) -> {
					return (entity1.getSort() == null ? 0 : entity1.getSort())
							- (entity2.getSort() == null ? 0 : entity2.getSort());
				}).collect(Collectors.toList());

		return list;

	}

}