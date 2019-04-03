package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pojo.WorkPlan;
import org.apache.ibatis.annotations.Param;

/**
 * @author jack
 * @date 2019/4/3 15:15
 * 搜索给定条件的员工信息
 */
public interface SeekWorkPlanMapper extends BaseMapper<WorkPlan> {
    IPage<WorkPlan> getSeekWorkPlanMessage(Page page, @Param("seekName") String seekName,@Param("startTime") String starTime,@Param("endTime") String endTime);
}
