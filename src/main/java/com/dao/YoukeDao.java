package com.dao;

import com.entity.YoukeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YoukeVO;
import com.entity.view.YoukeView;


/**
 * 游客
 * 
 * @author 
 * @email 
 * @date 2023-04-04 12:56:27
 */
public interface YoukeDao extends BaseMapper<YoukeEntity> {
	
	List<YoukeVO> selectListVO(@Param("ew") Wrapper<YoukeEntity> wrapper);
	
	YoukeVO selectVO(@Param("ew") Wrapper<YoukeEntity> wrapper);
	
	List<YoukeView> selectListView(@Param("ew") Wrapper<YoukeEntity> wrapper);

	List<YoukeView> selectListView(Pagination page,@Param("ew") Wrapper<YoukeEntity> wrapper);
	
	YoukeView selectView(@Param("ew") Wrapper<YoukeEntity> wrapper);
	

}
