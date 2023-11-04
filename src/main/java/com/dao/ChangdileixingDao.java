package com.dao;

import com.entity.ChangdileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChangdileixingVO;
import com.entity.view.ChangdileixingView;


/**
 * 场地类型
 */
public interface ChangdileixingDao extends BaseMapper<ChangdileixingEntity> {
	
	List<ChangdileixingVO> selectListVO(@Param("ew") Wrapper<ChangdileixingEntity> wrapper);
	
	ChangdileixingVO selectVO(@Param("ew") Wrapper<ChangdileixingEntity> wrapper);

	/*查询所条数据selectList方法
	 *selectList方法可以查询全部数据，也可通过条件查询多条数据。
	 * 看下方源码可知：当设置条件时会进行条件查询，不设置条件时参数可填null。
	 * 最后的返回结果是一个List集合，里面存的是每一条数据信息。
	 */
	List<ChangdileixingView> selectListView(@Param("ew") Wrapper<ChangdileixingEntity> wrapper);

	List<ChangdileixingView> selectListView(Pagination page,@Param("ew") Wrapper<ChangdileixingEntity> wrapper);
	
	ChangdileixingView selectView(@Param("ew") Wrapper<ChangdileixingEntity> wrapper);
	

}
