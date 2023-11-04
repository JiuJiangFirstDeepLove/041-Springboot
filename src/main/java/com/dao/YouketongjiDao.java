package com.dao;

import com.entity.YouketongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouketongjiVO;
import com.entity.view.YouketongjiView;


/**
 * 游客统计
 * 
 * @author 
 * @email 
 * @date 2023-04-04 12:56:28
 */
public interface YouketongjiDao extends BaseMapper<YouketongjiEntity> {
	
	List<YouketongjiVO> selectListVO(@Param("ew") Wrapper<YouketongjiEntity> wrapper);
	
	YouketongjiVO selectVO(@Param("ew") Wrapper<YouketongjiEntity> wrapper);
	
	List<YouketongjiView> selectListView(@Param("ew") Wrapper<YouketongjiEntity> wrapper);

	List<YouketongjiView> selectListView(Pagination page,@Param("ew") Wrapper<YouketongjiEntity> wrapper);
	
	YouketongjiView selectView(@Param("ew") Wrapper<YouketongjiEntity> wrapper);
	

}
