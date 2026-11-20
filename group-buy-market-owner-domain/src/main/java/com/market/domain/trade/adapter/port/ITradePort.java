package com.market.domain.trade.adapter.port;

import com.market.domain.trade.model.entity.NotifyTaskEntity;

/**
 * @author: car
 * @description: 交易接口服务接口
 */
public interface ITradePort {

    String groupBuyNotify(NotifyTaskEntity notifyTask) throws Exception;

}
