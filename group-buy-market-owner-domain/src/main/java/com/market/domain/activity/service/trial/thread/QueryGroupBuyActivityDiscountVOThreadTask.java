package com.market.domain.activity.service.trial.thread;


import com.market.domain.activity.adapter.repository.IActivityRepository;
import com.market.domain.activity.model.valobj.GroupBuyActivityDiscountVO;
import com.market.domain.activity.model.valobj.SCSkuActivityVO;

import java.util.concurrent.Callable;

/**
 * @author: car
 * @create: 2026/11/14 21:34
 * @description: 查询营销配置任务
 */
public class QueryGroupBuyActivityDiscountVOThreadTask implements Callable<GroupBuyActivityDiscountVO> {

    // 活动ID
    private final Long activityId;
    // 来源
    private final String source;
    // 渠道
    private final String channel;
    // 商品id
    private final String goodsId;
    // 活动仓储
    private final IActivityRepository activityRepository;

    public QueryGroupBuyActivityDiscountVOThreadTask(String source, String channel, String goodsId, IActivityRepository repository) {
        this(null, source, channel, goodsId, repository);
    }

    public QueryGroupBuyActivityDiscountVOThreadTask(Long activityId, String source, String channel, String goodsId, IActivityRepository repository) {
        this.activityId = activityId;
        this.source = source;
        this.channel = channel;
        this.goodsId = goodsId;
        this.activityRepository = repository;
    }

    @Override
    public GroupBuyActivityDiscountVO call() throws Exception {
        // 判断是否存在可用的活动ID
        Long availableActivityId = this.activityId;
        if (null == this.activityId) {
            SCSkuActivityVO scSkuActivityVO = activityRepository.querySCSkuActivityBySCGoodsId(source, channel, goodsId);
            if (null == scSkuActivityVO) return null;
            availableActivityId = scSkuActivityVO.getActivityId();
        }
        // 查询活动信息
        return activityRepository.queryGroupBuyActivityDiscountVO(availableActivityId);
    }
}
