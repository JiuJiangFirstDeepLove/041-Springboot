package com.dao;

import com.entity.DiscussyouwanxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyouwanxiangmuVO;
import com.entity.view.DiscussyouwanxiangmuView;


/**
 * 游玩项目评论表
 * 
 * @author 
 * @email 
 * @date 2023-04-04 12:56:28
 */
public interface DiscussyouwanxiangmuDao extends BaseMapper<DiscussyouwanxiangmuEntity> {
	
	List<DiscussyouwanxiangmuVO> selectListVO(@Param("ew") Wrapper<DiscussyouwanxiangmuEntity> wrapper);
	
	DiscussyouwanxiangmuVO selectVO(@Param("ew") Wrapper<DiscussyouwanxiangmuEntity> wrapper);
	
	List<DiscussyouwanxiangmuView> selectListView(@Param("ew") Wrapper<DiscussyouwanxiangmuEntity> wrapper);

	List<DiscussyouwanxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyouwanxiangmuEntity> wrapper);
	
	DiscussyouwanxiangmuView selectView(@Param("ew") Wrapper<DiscussyouwanxiangmuEntity> wrapper);
	

}
