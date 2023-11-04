package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongyuansheshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongyuansheshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongyuansheshiView;


/**
 * 公园设施
 *
 * @author 
 * @email 
 * @date 2023-04-04 12:56:28
 */
public interface GongyuansheshiService extends IService<GongyuansheshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongyuansheshiVO> selectListVO(Wrapper<GongyuansheshiEntity> wrapper);
   	
   	GongyuansheshiVO selectVO(@Param("ew") Wrapper<GongyuansheshiEntity> wrapper);
   	
   	List<GongyuansheshiView> selectListView(Wrapper<GongyuansheshiEntity> wrapper);
   	
   	GongyuansheshiView selectView(@Param("ew") Wrapper<GongyuansheshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongyuansheshiEntity> wrapper);
   	

}

