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


import com.dao.DiscussgongyuansheshiDao;
import com.entity.DiscussgongyuansheshiEntity;
import com.service.DiscussgongyuansheshiService;
import com.entity.vo.DiscussgongyuansheshiVO;
import com.entity.view.DiscussgongyuansheshiView;

@Service("discussgongyuansheshiService")
public class DiscussgongyuansheshiServiceImpl extends ServiceImpl<DiscussgongyuansheshiDao, DiscussgongyuansheshiEntity> implements DiscussgongyuansheshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussgongyuansheshiEntity> page = this.selectPage(
                new Query<DiscussgongyuansheshiEntity>(params).getPage(),
                new EntityWrapper<DiscussgongyuansheshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussgongyuansheshiEntity> wrapper) {
		  Page<DiscussgongyuansheshiView> page =new Query<DiscussgongyuansheshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussgongyuansheshiVO> selectListVO(Wrapper<DiscussgongyuansheshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussgongyuansheshiVO selectVO(Wrapper<DiscussgongyuansheshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussgongyuansheshiView> selectListView(Wrapper<DiscussgongyuansheshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussgongyuansheshiView selectView(Wrapper<DiscussgongyuansheshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
