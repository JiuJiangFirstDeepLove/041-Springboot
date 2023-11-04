package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SheshiweihuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SheshiweihuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SheshiweihuView;


/**
 * 设施维护
 *
 * @author 
 * @email 
 * @date 2023-04-04 12:56:28
 */
public interface SheshiweihuService extends IService<SheshiweihuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SheshiweihuVO> selectListVO(Wrapper<SheshiweihuEntity> wrapper);
   	
   	SheshiweihuVO selectVO(@Param("ew") Wrapper<SheshiweihuEntity> wrapper);
   	
   	List<SheshiweihuView> selectListView(Wrapper<SheshiweihuEntity> wrapper);
   	
   	SheshiweihuView selectView(@Param("ew") Wrapper<SheshiweihuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SheshiweihuEntity> wrapper);
   	

}

