package com.wei.gulimall_product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.wei.gulimall_product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author wei
 * @email wei@gmail.com
 * @date 2023-02-25 22:16:31
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

