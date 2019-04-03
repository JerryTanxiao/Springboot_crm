package com.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.service.WorkPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jack
 * @date 2019/4/2 15:04
 */
@RestController
public class WorkPlan {
    @Autowired
    private WorkPlanService work;

    @RequestMapping("/get")
    public IPage get() {
        IPage<com.pojo.WorkPlan> workMessage = work.getWorkMessage();
        return workMessage;

    }

}