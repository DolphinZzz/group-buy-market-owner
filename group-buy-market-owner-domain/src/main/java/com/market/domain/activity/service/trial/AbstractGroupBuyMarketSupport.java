package com.market.domain.activity.service.trial;


import com.market.domain.activity.model.entity.MarketProductEntity;
import com.market.domain.activity.model.entity.TrialBalanceEntity;
import com.market.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import com.market.types.design.framework.tree.AbstractStrategyRouter;

/**
 * @author: car
 * @create: 2026/11/14 17:53
 * @description: 抽象的拼团营销支撑类
 */
public abstract class AbstractGroupBuyMarketSupport extends AbstractStrategyRouter<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> {
}
