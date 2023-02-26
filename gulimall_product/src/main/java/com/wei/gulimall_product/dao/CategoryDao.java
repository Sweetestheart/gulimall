package com.wei.gulimall_product.dao;

import com.wei.gulimall_product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wei
 * @email wei@gmail.com
 * @date 2023-02-25 22:16:31
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
