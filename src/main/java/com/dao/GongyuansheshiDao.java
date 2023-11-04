package com.dao;

import com.entity.GongyuansheshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongyuansheshiVO;
import com.entity.view.GongyuansheshiView;


/**
 * 公园设施
 * 
 * @author 
 * @email 
 * @date 2023-04-04 12:56:28
 */
public interface GongyuansheshiDao extends BaseMapper<GongyuansheshiEntity> {
	
	List<GongyuansheshiVO> selectListVO(@Param("ew") Wrapper<GongyuansheshiEntity> wrapper);
	
	GongyuansheshiVO selectVO(@Param("ew") Wrapper<GongyuansheshiEntity> wrapper);
	
	List<GongyuansheshiView> selectListView(@Param("ew") Wrapper<GongyuansheshiEntity> wrapper);

	List<GongyuansheshiView> selectListView(Pagination page,@Param("ew") Wrapper<GongyuansheshiEntity> wrapper);
	
	GongyuansheshiView selectView(@Param("ew") Wrapper<GongyuansheshiEntity> wrapper);
	

}
