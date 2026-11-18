package com.market.domain.trade.adapter.repository;

import com.market.domain.trade.model.aggregate.GroupBuyOrderAggregate;
import com.market.domain.trade.model.entity.GroupBuyActivityEntity;
import com.market.domain.trade.model.entity.MarketPayOrderEntity;
import com.market.domain.trade.model.valobj.GroupBuyProgressVO;

/**
 * @author: car
 * @create: 2026/11/17 16:55
 * @description:
 */
public interface ITradeRepository {
    MarketPayOrderEntity queryMarketPayOrderEntityByOutTradeNo(String userId, String outTradeNo);

    MarketPayOrderEntity lockMarketPayOrder(GroupBuyOrderAggregate groupBuyOrderAggregate);

    GroupBuyProgressVO queryGroupBuyProgress(String teamId);

    GroupBuyActivityEntity queryGroupBuyActivityEntityByActivityId(Long activityId);

    Integer queryOrderCountByActivityId(Long activityId, String userId);

}
