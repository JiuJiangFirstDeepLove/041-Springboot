package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GongyuansheshiDao;
import com.entity.GongyuansheshiEntity;
import com.service.GongyuansheshiService;
import com.entity.vo.GongyuansheshiVO;
import com.entity.view.GongyuansheshiView;

@Service("gongyuansheshiService")
public class GongyuansheshiServiceImpl extends ServiceImpl<GongyuansheshiDao, GongyuansheshiEntity> implements GongyuansheshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongyuansheshiEntity> page = this.selectPage(
                new Query<GongyuansheshiEntity>(params).getPage(),
                new EntityWrapper<GongyuansheshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongyuansheshiEntity> wrapper) {
		  Page<GongyuansheshiView> page =new Query<GongyuansheshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongyuansheshiVO> selectListVO(Wrapper<GongyuansheshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongyuansheshiVO selectVO(Wrapper<GongyuansheshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongyuansheshiView> selectListView(Wrapper<GongyuansheshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongyuansheshiView selectView(Wrapper<GongyuansheshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
