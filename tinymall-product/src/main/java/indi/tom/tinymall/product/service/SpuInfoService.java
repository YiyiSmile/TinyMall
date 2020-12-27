package indi.tom.tinymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import indi.tom.common.utils.PageUtils;
import indi.tom.tinymall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-23 13:36:12
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

