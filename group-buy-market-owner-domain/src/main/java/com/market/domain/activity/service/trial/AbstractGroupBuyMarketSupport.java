package com.market.domain.activity.service.trial;


import com.market.domain.activity.adapter.repository.IActivityRepository;
import com.market.domain.activity.model.entity.MarketProductEntity;
import com.market.domain.activity.model.entity.TrialBalanceEntity;
import com.market.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import com.market.types.design.framework.tree.AbstractMultiThreadStrategyRouter;

import javax.annotation.Resource;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/**
 * @author: car
 * @create: 2026/11/14 17:53
 * @description: 抽象的拼团营销支撑类
 */
public abstract class AbstractGroupBuyMarketSupport extends AbstractMultiThreadStrategyRouter<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> {

    protected long timeout = 500;

    @Resource
    protected IActivityRepository repository;

    @Override
    protected void multiThread(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws ExecutionException, InterruptedException, TimeoutException {

    }
}
