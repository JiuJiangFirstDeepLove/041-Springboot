package com.dao;

import com.entity.DiscussgongyuansheshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussgongyuansheshiVO;
import com.entity.view.DiscussgongyuansheshiView;


/**
 * 公园设施评论表
 * 
 * @author 
 * @email 
 * @date 2023-04-04 12:56:28
 */
public interface DiscussgongyuansheshiDao extends BaseMapper<DiscussgongyuansheshiEntity> {
	
	List<DiscussgongyuansheshiVO> selectListVO(@Param("ew") Wrapper<DiscussgongyuansheshiEntity> wrapper);
	
	DiscussgongyuansheshiVO selectVO(@Param("ew") Wrapper<DiscussgongyuansheshiEntity> wrapper);
	
	List<DiscussgongyuansheshiView> selectListView(@Param("ew") Wrapper<DiscussgongyuansheshiEntity> wrapper);

	List<DiscussgongyuansheshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussgongyuansheshiEntity> wrapper);
	
	DiscussgongyuansheshiView selectView(@Param("ew") Wrapper<DiscussgongyuansheshiEntity> wrapper);
	

}
