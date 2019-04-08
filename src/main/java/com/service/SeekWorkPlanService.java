package com.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pojo.WorkPlan;

/**
 * @author jack
 * @date 2019/4/3 16:08
 * 搜索给定条件的员工信息
 */
public interface SeekWorkPlanService extends IService<WorkPlan> {
    IPage<WorkPlan> getSeekWorkPlanMessage(String seekName,String startTime,String endTime,Long current,Long size);

}
