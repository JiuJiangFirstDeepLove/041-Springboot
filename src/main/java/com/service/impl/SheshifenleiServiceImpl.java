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


import com.dao.SheshifenleiDao;
import com.entity.SheshifenleiEntity;
import com.service.SheshifenleiService;
import com.entity.vo.SheshifenleiVO;
import com.entity.view.SheshifenleiView;

@Service("sheshifenleiService")
public class SheshifenleiServiceImpl extends ServiceImpl<SheshifenleiDao, SheshifenleiEntity> implements SheshifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SheshifenleiEntity> page = this.selectPage(
                new Query<SheshifenleiEntity>(params).getPage(),
                new EntityWrapper<SheshifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SheshifenleiEntity> wrapper) {
		  Page<SheshifenleiView> page =new Query<SheshifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SheshifenleiVO> selectListVO(Wrapper<SheshifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SheshifenleiVO selectVO(Wrapper<SheshifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SheshifenleiView> selectListView(Wrapper<SheshifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SheshifenleiView selectView(Wrapper<SheshifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
