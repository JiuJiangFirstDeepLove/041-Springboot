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


import com.dao.YouketongjiDao;
import com.entity.YouketongjiEntity;
import com.service.YouketongjiService;
import com.entity.vo.YouketongjiVO;
import com.entity.view.YouketongjiView;

@Service("youketongjiService")
public class YouketongjiServiceImpl extends ServiceImpl<YouketongjiDao, YouketongjiEntity> implements YouketongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouketongjiEntity> page = this.selectPage(
                new Query<YouketongjiEntity>(params).getPage(),
                new EntityWrapper<YouketongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouketongjiEntity> wrapper) {
		  Page<YouketongjiView> page =new Query<YouketongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouketongjiVO> selectListVO(Wrapper<YouketongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouketongjiVO selectVO(Wrapper<YouketongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouketongjiView> selectListView(Wrapper<YouketongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouketongjiView selectView(Wrapper<YouketongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
