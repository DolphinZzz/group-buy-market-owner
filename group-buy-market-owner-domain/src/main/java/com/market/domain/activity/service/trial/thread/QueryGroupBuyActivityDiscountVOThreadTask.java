package com.market.domain.activity.service.trial.thread;


import com.market.domain.activity.adapter.repository.IActivityRepository;
import com.market.domain.activity.model.valobj.GroupBuyActivityDiscountVO;

import java.util.concurrent.Callable;

/**
 * @author: car
 * @create: 2026/11/14 21:34
 * @description: 查询营销配置任务
 */
public class QueryGroupBuyActivityDiscountVOThreadTask implements Callable<GroupBuyActivityDiscountVO> {

    // 来源
    private final String source;
    // 渠道
    private final String channel;
    // 活动仓储
    private final IActivityRepository activityRepository;

    public QueryGroupBuyActivityDiscountVOThreadTask(String source, String channel, IActivityRepository repository) {
        this.source = source;
        this.channel = channel;
        this.activityRepository = repository;
    }

    @Override
    public GroupBuyActivityDiscountVO call() throws Exception {
        return activityRepository.queryGroupBuyActivityDiscountVO(source,channel);
    }
}
