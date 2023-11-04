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


import com.dao.SheshiweihuDao;
import com.entity.SheshiweihuEntity;
import com.service.SheshiweihuService;
import com.entity.vo.SheshiweihuVO;
import com.entity.view.SheshiweihuView;

@Service("sheshiweihuService")
public class SheshiweihuServiceImpl extends ServiceImpl<SheshiweihuDao, SheshiweihuEntity> implements SheshiweihuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SheshiweihuEntity> page = this.selectPage(
                new Query<SheshiweihuEntity>(params).getPage(),
                new EntityWrapper<SheshiweihuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SheshiweihuEntity> wrapper) {
		  Page<SheshiweihuView> page =new Query<SheshiweihuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SheshiweihuVO> selectListVO(Wrapper<SheshiweihuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SheshiweihuVO selectVO(Wrapper<SheshiweihuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SheshiweihuView> selectListView(Wrapper<SheshiweihuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SheshiweihuView selectView(Wrapper<SheshiweihuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
