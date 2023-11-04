package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyouwanxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyouwanxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyouwanxiangmuView;


/**
 * 游玩项目评论表
 *
 * @author 
 * @email 
 * @date 2023-04-04 12:56:28
 */
public interface DiscussyouwanxiangmuService extends IService<DiscussyouwanxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyouwanxiangmuVO> selectListVO(Wrapper<DiscussyouwanxiangmuEntity> wrapper);
   	
   	DiscussyouwanxiangmuVO selectVO(@Param("ew") Wrapper<DiscussyouwanxiangmuEntity> wrapper);
   	
   	List<DiscussyouwanxiangmuView> selectListView(Wrapper<DiscussyouwanxiangmuEntity> wrapper);
   	
   	DiscussyouwanxiangmuView selectView(@Param("ew") Wrapper<DiscussyouwanxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyouwanxiangmuEntity> wrapper);
   	

}

