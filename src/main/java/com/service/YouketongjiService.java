package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouketongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouketongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouketongjiView;


/**
 * 游客统计
 *
 * @author 
 * @email 
 * @date 2023-04-04 12:56:28
 */
public interface YouketongjiService extends IService<YouketongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouketongjiVO> selectListVO(Wrapper<YouketongjiEntity> wrapper);
   	
   	YouketongjiVO selectVO(@Param("ew") Wrapper<YouketongjiEntity> wrapper);
   	
   	List<YouketongjiView> selectListView(Wrapper<YouketongjiEntity> wrapper);
   	
   	YouketongjiView selectView(@Param("ew") Wrapper<YouketongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouketongjiEntity> wrapper);
   	

}

