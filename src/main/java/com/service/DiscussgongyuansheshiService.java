package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussgongyuansheshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussgongyuansheshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussgongyuansheshiView;


/**
 * 公园设施评论表
 *
 * @author 
 * @email 
 * @date 2023-04-04 12:56:28
 */
public interface DiscussgongyuansheshiService extends IService<DiscussgongyuansheshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussgongyuansheshiVO> selectListVO(Wrapper<DiscussgongyuansheshiEntity> wrapper);
   	
   	DiscussgongyuansheshiVO selectVO(@Param("ew") Wrapper<DiscussgongyuansheshiEntity> wrapper);
   	
   	List<DiscussgongyuansheshiView> selectListView(Wrapper<DiscussgongyuansheshiEntity> wrapper);
   	
   	DiscussgongyuansheshiView selectView(@Param("ew") Wrapper<DiscussgongyuansheshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussgongyuansheshiEntity> wrapper);
   	

}

