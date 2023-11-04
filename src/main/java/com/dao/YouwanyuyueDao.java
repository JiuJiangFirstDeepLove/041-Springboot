package com.dao;

import com.entity.YouwanyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouwanyuyueVO;
import com.entity.view.YouwanyuyueView;


/**
 * 游玩预约
 * 
 * @author 
 * @email 
 * @date 2023-04-04 12:56:28
 */
public interface YouwanyuyueDao extends BaseMapper<YouwanyuyueEntity> {
	
	List<YouwanyuyueVO> selectListVO(@Param("ew") Wrapper<YouwanyuyueEntity> wrapper);
	
	YouwanyuyueVO selectVO(@Param("ew") Wrapper<YouwanyuyueEntity> wrapper);
	
	List<YouwanyuyueView> selectListView(@Param("ew") Wrapper<YouwanyuyueEntity> wrapper);

	List<YouwanyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<YouwanyuyueEntity> wrapper);
	
	YouwanyuyueView selectView(@Param("ew") Wrapper<YouwanyuyueEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YouwanyuyueEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YouwanyuyueEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YouwanyuyueEntity> wrapper);



}
