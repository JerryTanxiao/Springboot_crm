package com.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.service.SeekWorkPlanService;
import com.service.WorkPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author jack
 * @date 2019/4/2 15:04
 * 对工作进度进行查询
 */
@RestController
public class WorkPlan {
    @Autowired
    private WorkPlanService work;
    @Autowired
    private SeekWorkPlanService seekWork;

    /**
     * 搜索所有的员工信息
     * @param current  当前页数
     * @param size  页面展示条数
     * @return
     */
    @RequestMapping("/workPlan")
    public IPage getWorkPlan(@RequestParam("current")Long current,@RequestParam("size")Long size) {
        return work.getWorkMessage(current,size);
    }

    /**
     * 搜索给定条件的员工信息
     * @param seekName 模糊搜索的昵称
     * @param startTime 创建时间区间开始时间 格式应该为YYYY-MM-DD 或者YYYY:MM:DD
     * @param endTime 创建时间区间结束时间 格式应该为YYYY-MM-DD 或者YYYY:MM:DD
     * @param current  当前页数
     * @param size  页面展示条数
     * @return  分页实体类
     */
    @RequestMapping(value = "/seekWorkPlan",method = RequestMethod.GET)
    public  IPage seekWorkPlan(@RequestParam("seekName")String seekName,@RequestParam("startTime")String startTime,@RequestParam("endTime")String endTime,@RequestParam("current")Long current,@RequestParam("size")Long size){
        return seekWork.getSeekWorkPlanMessage(seekName,startTime,endTime,current,size);
    }

}