package com.wei.gulimall_ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.wei.gulimall_ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author wei
 * @email wei@gmail.com
 * @date 2023-02-26 20:18:08
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

