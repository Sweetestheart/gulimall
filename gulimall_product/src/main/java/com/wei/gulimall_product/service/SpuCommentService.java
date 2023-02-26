package com.wei.gulimall_product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.wei.gulimall_product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author wei
 * @email wei@gmail.com
 * @date 2023-02-25 22:16:31
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

