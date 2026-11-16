package com.market.domain.activity.service.trial.thread;


import com.market.domain.activity.adapter.repository.IActivityRepository;
import com.market.domain.activity.model.valobj.SkuVO;

import java.util.concurrent.Callable;

/**
 * @author: car
 * @create: 2026/11/14 21:40
 * @description: 查询商品信息任务
 */
public class QuerySkuVOFromDBThreadTask implements Callable<SkuVO> {

    private final String goodsId;

    private final IActivityRepository activityRepository;

    public QuerySkuVOFromDBThreadTask(String goodsId, IActivityRepository activityRepository) {
        this.goodsId = goodsId;
        this.activityRepository = activityRepository;
    }

    @Override
    public SkuVO call() throws Exception {
        return activityRepository.querySkuByGoodsId(goodsId);
    }

}
