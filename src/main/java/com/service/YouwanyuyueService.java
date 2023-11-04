package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouwanyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouwanyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouwanyuyueView;


/**
 * 游玩预约
 *
 * @author 
 * @email 
 * @date 2023-04-04 12:56:28
 */
public interface YouwanyuyueService extends IService<YouwanyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouwanyuyueVO> selectListVO(Wrapper<YouwanyuyueEntity> wrapper);
   	
   	YouwanyuyueVO selectVO(@Param("ew") Wrapper<YouwanyuyueEntity> wrapper);
   	
   	List<YouwanyuyueView> selectListView(Wrapper<YouwanyuyueEntity> wrapper);
   	
   	YouwanyuyueView selectView(@Param("ew") Wrapper<YouwanyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouwanyuyueEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YouwanyuyueEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YouwanyuyueEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YouwanyuyueEntity> wrapper);



}

