package com.wei.gulimall_member.dao;

import com.wei.gulimall_member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wei
 * @email wei@gmail.com
 * @date 2023-02-26 20:07:10
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
