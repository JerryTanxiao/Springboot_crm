package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pojo.WorkPlan;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author jack
 * @date 2019/4/2 18:30
 * 用户工作进度查询分页
 */
public interface WorkPlanMapper extends BaseMapper<WorkPlan> {
    IPage<WorkPlan> getWorkMessage(Page page);
}
