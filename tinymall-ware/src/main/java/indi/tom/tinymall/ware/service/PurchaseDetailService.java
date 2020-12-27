package indi.tom.tinymall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import indi.tom.common.utils.PageUtils;
import indi.tom.tinymall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 14:55:15
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

