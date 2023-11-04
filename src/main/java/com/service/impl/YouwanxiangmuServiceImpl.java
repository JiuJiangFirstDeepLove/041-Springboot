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


import com.dao.YouwanxiangmuDao;
import com.entity.YouwanxiangmuEntity;
import com.service.YouwanxiangmuService;
import com.entity.vo.YouwanxiangmuVO;
import com.entity.view.YouwanxiangmuView;

@Service("youwanxiangmuService")
public class YouwanxiangmuServiceImpl extends ServiceImpl<YouwanxiangmuDao, YouwanxiangmuEntity> implements YouwanxiangmuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouwanxiangmuEntity> page = this.selectPage(
                new Query<YouwanxiangmuEntity>(params).getPage(),
                new EntityWrapper<YouwanxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouwanxiangmuEntity> wrapper) {
		  Page<YouwanxiangmuView> page =new Query<YouwanxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouwanxiangmuVO> selectListVO(Wrapper<YouwanxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouwanxiangmuVO selectVO(Wrapper<YouwanxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouwanxiangmuView> selectListView(Wrapper<YouwanxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouwanxiangmuView selectView(Wrapper<YouwanxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
