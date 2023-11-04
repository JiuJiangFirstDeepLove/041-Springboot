package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SheshifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SheshifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SheshifenleiView;


/**
 * 设施分类
 *
 * @author 
 * @email 
 * @date 2023-04-04 12:56:28
 */
public interface SheshifenleiService extends IService<SheshifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SheshifenleiVO> selectListVO(Wrapper<SheshifenleiEntity> wrapper);
   	
   	SheshifenleiVO selectVO(@Param("ew") Wrapper<SheshifenleiEntity> wrapper);
   	
   	List<SheshifenleiView> selectListView(Wrapper<SheshifenleiEntity> wrapper);
   	
   	SheshifenleiView selectView(@Param("ew") Wrapper<SheshifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SheshifenleiEntity> wrapper);
   	

}

