package com.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dao.WorkPlanMapper;
import com.pojo.WorkPlan;
import com.service.WorkPlanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jack
 * @date 2019/4/2 18:43
 */
@Service
public class WorkPlanServiceImpl extends ServiceImpl<WorkPlanMapper, WorkPlan> implements WorkPlanService {
    @Override
    public IPage<WorkPlan> getWorkMessage(Long current,Long size) {
        if(current==null)
            current=1L;
        if(size==null)
            size=5L;
        Page<WorkPlan> page = new Page<WorkPlan>();
        page.setCurrent(current);
        page.setSize(size);
        return baseMapper.getWorkMessage(page);
    }
}
