package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.ChangdiyuyueEntity;
import com.entity.SheShiyuyueEntity;
import com.entity.view.ChangdiyuyueView;
import com.entity.vo.ChangdiyuyueVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 场地预约
 * 
 * @author 
 * @email 
 * @date 2023-04-04 12:56:28
 */
public interface SheShiyuyueDao extends BaseMapper<SheShiyuyueEntity> {
	
	List<ChangdiyuyueVO> selectListVO(@Param("ew") Wrapper<SheShiyuyueEntity> wrapper);
	
	ChangdiyuyueVO selectVO(@Param("ew") Wrapper<SheShiyuyueEntity> wrapper);
	
	List<ChangdiyuyueView> selectListView(@Param("ew") Wrapper<SheShiyuyueEntity> wrapper);

	List<ChangdiyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<SheShiyuyueEntity> wrapper);
	
	ChangdiyuyueView selectView(@Param("ew") Wrapper<SheShiyuyueEntity> wrapper);
	

}
