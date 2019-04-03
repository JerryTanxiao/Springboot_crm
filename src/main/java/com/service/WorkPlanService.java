package com.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pojo.WorkPlan;

import java.util.List;

/**
 * @author jack
 * @date 2019/4/2 18:41
 * 工作计划service接口
 */
public interface WorkPlanService extends IService<WorkPlan> {
    IPage<WorkPlan> getWorkMessage();
}
