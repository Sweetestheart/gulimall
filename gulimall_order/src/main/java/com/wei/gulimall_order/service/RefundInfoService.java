package com.wei.gulimall_order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.wei.gulimall_order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author wei
 * @email wei@gmail.com
 * @date 2023-02-26 20:14:33
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

