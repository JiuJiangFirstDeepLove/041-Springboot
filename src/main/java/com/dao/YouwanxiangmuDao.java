package com.dao;

import com.entity.YouwanxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouwanxiangmuVO;
import com.entity.view.YouwanxiangmuView;


/**
 * 游玩项目
 * 
 * @author 
 * @email 
 * @date 2023-04-04 12:56:28
 */
public interface YouwanxiangmuDao extends BaseMapper<YouwanxiangmuEntity> {
	
	List<YouwanxiangmuVO> selectListVO(@Param("ew") Wrapper<YouwanxiangmuEntity> wrapper);
	
	YouwanxiangmuVO selectVO(@Param("ew") Wrapper<YouwanxiangmuEntity> wrapper);
	
	List<YouwanxiangmuView> selectListView(@Param("ew") Wrapper<YouwanxiangmuEntity> wrapper);

	List<YouwanxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<YouwanxiangmuEntity> wrapper);
	
	YouwanxiangmuView selectView(@Param("ew") Wrapper<YouwanxiangmuEntity> wrapper);
	

}
