package com.wei.gulimall_coupon.dao;

import com.wei.gulimall_coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wei
 * @email wei@gmail.com
 * @date 2023-02-26 19:59:41
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
