package com.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.SheShiyuyueDao;
import com.entity.SheShiyuyueEntity;
import com.entity.view.ChangdiyuyueView;
import com.entity.vo.ChangdiyuyueVO;
import com.service.ChangdiyuyueService;
import com.service.SheShiyuyueService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("sheshiyuyueService")
public class SheShiyuyueServiceImpl extends ServiceImpl<SheShiyuyueDao, SheShiyuyueEntity> implements SheShiyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SheShiyuyueEntity> page = this.selectPage(
                new Query<SheShiyuyueEntity>(params).getPage(),
                new EntityWrapper<SheShiyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SheShiyuyueEntity> wrapper) {
		  Page<ChangdiyuyueView> page =new Query<ChangdiyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChangdiyuyueVO> selectListVO(Wrapper<SheShiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChangdiyuyueVO selectVO(Wrapper<SheShiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChangdiyuyueView> selectListView(Wrapper<SheShiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChangdiyuyueView selectView(Wrapper<SheShiyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
