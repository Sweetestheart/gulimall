package com.wei.gulimall_order.dao;

import com.wei.gulimall_order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author wei
 * @email wei@gmail.com
 * @date 2023-02-26 20:14:33
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
