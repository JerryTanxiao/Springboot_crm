package com.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dao.SeekWorkPlanMapper;
import com.pojo.WorkPlan;
import com.service.SeekWorkPlanService;
import org.springframework.stereotype.Service;

/**
 * @author jack
 * @date 2019/4/3 16:14
 */
@Service
public class SeekWorkPlanServiceImpl extends ServiceImpl<SeekWorkPlanMapper, WorkPlan> implements SeekWorkPlanService {
    @Override
    public IPage<WorkPlan> getSeekWorkPlanMessage(String seekName, String startTime, String endTime, Long current, Long size) {
        if(current==null)
            current=1L;
        if(size==null)
            size=5L;
        Page<WorkPlan> page = new Page<>();
        page.setSize(size);
        page.setCurrent(current);
        return baseMapper.getSeekWorkPlanMessage(page,seekName,startTime,endTime);
    }
}
