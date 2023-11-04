package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.ChangdiyuyueEntity;
import com.entity.SheShiyuyueEntity;
import com.entity.view.ChangdiyuyueView;
import com.entity.vo.ChangdiyuyueVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 场地预约
 *
 * @author 
 * @email 
 * @date 2023-04-04 12:56:28
 */
public interface SheShiyuyueService extends IService<SheShiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChangdiyuyueVO> selectListVO(Wrapper<SheShiyuyueEntity> wrapper);
   	
   	ChangdiyuyueVO selectVO(@Param("ew") Wrapper<SheShiyuyueEntity> wrapper);
   	
   	List<ChangdiyuyueView> selectListView(Wrapper<SheShiyuyueEntity> wrapper);
   	
   	ChangdiyuyueView selectView(@Param("ew") Wrapper<SheShiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SheShiyuyueEntity> wrapper);
   	

}

