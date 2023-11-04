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


import com.dao.YouwanyuyueDao;
import com.entity.YouwanyuyueEntity;
import com.service.YouwanyuyueService;
import com.entity.vo.YouwanyuyueVO;
import com.entity.view.YouwanyuyueView;

@Service("youwanyuyueService")
public class YouwanyuyueServiceImpl extends ServiceImpl<YouwanyuyueDao, YouwanyuyueEntity> implements YouwanyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouwanyuyueEntity> page = this.selectPage(
                new Query<YouwanyuyueEntity>(params).getPage(),
                new EntityWrapper<YouwanyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouwanyuyueEntity> wrapper) {
		  Page<YouwanyuyueView> page =new Query<YouwanyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouwanyuyueVO> selectListVO(Wrapper<YouwanyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouwanyuyueVO selectVO(Wrapper<YouwanyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouwanyuyueView> selectListView(Wrapper<YouwanyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouwanyuyueView selectView(Wrapper<YouwanyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YouwanyuyueEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YouwanyuyueEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YouwanyuyueEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
