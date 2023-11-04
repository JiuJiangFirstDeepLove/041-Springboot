package com.dao;

import com.entity.SheshifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SheshifenleiVO;
import com.entity.view.SheshifenleiView;


/**
 * 设施分类
 * 
 * @author 
 * @email 
 * @date 2023-04-04 12:56:28
 */
public interface SheshifenleiDao extends BaseMapper<SheshifenleiEntity> {
	
	List<SheshifenleiVO> selectListVO(@Param("ew") Wrapper<SheshifenleiEntity> wrapper);
	
	SheshifenleiVO selectVO(@Param("ew") Wrapper<SheshifenleiEntity> wrapper);
	
	List<SheshifenleiView> selectListView(@Param("ew") Wrapper<SheshifenleiEntity> wrapper);

	List<SheshifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<SheshifenleiEntity> wrapper);
	
	SheshifenleiView selectView(@Param("ew") Wrapper<SheshifenleiEntity> wrapper);
	

}
