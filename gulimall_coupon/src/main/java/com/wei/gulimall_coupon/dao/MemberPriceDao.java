package com.wei.gulimall_coupon.dao;

import com.wei.gulimall_coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author wei
 * @email wei@gmail.com
 * @date 2023-02-26 19:59:40
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
