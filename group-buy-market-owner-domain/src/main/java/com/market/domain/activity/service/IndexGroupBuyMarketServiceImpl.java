package com.market.domain.activity.service;


import com.market.domain.activity.model.entity.MarketProductEntity;
import com.market.domain.activity.model.entity.TrialBalanceEntity;
import com.market.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import com.market.types.design.framework.tree.StrategyHandler;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: car
 * @create: 2026/11/14 21:57
 * @description: 首页营销服务
 */
@Service
public class IndexGroupBuyMarketServiceImpl implements IIndexGroupBuyMarketService{
    @Resource
    private DefaultActivityStrategyFactory defaultActivityStrategyFactory;

    @Override
    public TrialBalanceEntity indexMarketTrial(MarketProductEntity marketProductEntity) throws Exception {

        StrategyHandler<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> strategyHandler = defaultActivityStrategyFactory.strategyHandler();

        TrialBalanceEntity trialBalanceEntity = strategyHandler.apply(marketProductEntity, new DefaultActivityStrategyFactory.DynamicContext());

        return trialBalanceEntity;
    }
}
