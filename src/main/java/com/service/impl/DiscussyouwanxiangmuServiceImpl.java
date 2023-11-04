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


import com.dao.DiscussyouwanxiangmuDao;
import com.entity.DiscussyouwanxiangmuEntity;
import com.service.DiscussyouwanxiangmuService;
import com.entity.vo.DiscussyouwanxiangmuVO;
import com.entity.view.DiscussyouwanxiangmuView;

@Service("discussyouwanxiangmuService")
public class DiscussyouwanxiangmuServiceImpl extends ServiceImpl<DiscussyouwanxiangmuDao, DiscussyouwanxiangmuEntity> implements DiscussyouwanxiangmuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyouwanxiangmuEntity> page = this.selectPage(
                new Query<DiscussyouwanxiangmuEntity>(params).getPage(),
                new EntityWrapper<DiscussyouwanxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyouwanxiangmuEntity> wrapper) {
		  Page<DiscussyouwanxiangmuView> page =new Query<DiscussyouwanxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyouwanxiangmuVO> selectListVO(Wrapper<DiscussyouwanxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyouwanxiangmuVO selectVO(Wrapper<DiscussyouwanxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyouwanxiangmuView> selectListView(Wrapper<DiscussyouwanxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyouwanxiangmuView selectView(Wrapper<DiscussyouwanxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
