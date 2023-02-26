package com.wei.gulimall_order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.wei.gulimall_order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author wei
 * @email wei@gmail.com
 * @date 2023-02-26 20:14:33
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

