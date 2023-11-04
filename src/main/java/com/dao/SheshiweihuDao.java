package com.dao;

import com.entity.SheshiweihuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SheshiweihuVO;
import com.entity.view.SheshiweihuView;


/**
 * 设施维护
 * 
 * @author 
 * @email 
 * @date 2023-04-04 12:56:28
 */
public interface SheshiweihuDao extends BaseMapper<SheshiweihuEntity> {
	
	List<SheshiweihuVO> selectListVO(@Param("ew") Wrapper<SheshiweihuEntity> wrapper);
	
	SheshiweihuVO selectVO(@Param("ew") Wrapper<SheshiweihuEntity> wrapper);
	
	List<SheshiweihuView> selectListView(@Param("ew") Wrapper<SheshiweihuEntity> wrapper);

	List<SheshiweihuView> selectListView(Pagination page,@Param("ew") Wrapper<SheshiweihuEntity> wrapper);
	
	SheshiweihuView selectView(@Param("ew") Wrapper<SheshiweihuEntity> wrapper);
	

}
