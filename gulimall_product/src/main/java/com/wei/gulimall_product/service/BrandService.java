package com.wei.gulimall_product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.wei.gulimall_product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author wei
 * @email wei@gmail.com
 * @date 2023-02-25 22:16:31
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

