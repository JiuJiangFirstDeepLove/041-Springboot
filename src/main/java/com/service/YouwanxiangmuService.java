package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouwanxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouwanxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouwanxiangmuView;


/**
 * 游玩项目
 *
 * @author 
 * @email 
 * @date 2023-04-04 12:56:28
 */
public interface YouwanxiangmuService extends IService<YouwanxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouwanxiangmuVO> selectListVO(Wrapper<YouwanxiangmuEntity> wrapper);
   	
   	YouwanxiangmuVO selectVO(@Param("ew") Wrapper<YouwanxiangmuEntity> wrapper);
   	
   	List<YouwanxiangmuView> selectListView(Wrapper<YouwanxiangmuEntity> wrapper);
   	
   	YouwanxiangmuView selectView(@Param("ew") Wrapper<YouwanxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouwanxiangmuEntity> wrapper);
   	

}

