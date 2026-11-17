package com.market.domain.activity.adapter.repository;

import com.market.domain.activity.model.valobj.GroupBuyActivityDiscountVO;
import com.market.domain.activity.model.valobj.SCSkuActivityVO;
import com.market.domain.activity.model.valobj.SkuVO;

/**
 * @author: car
 * @create: 2026/11/14 21:09
 * @description: 活动仓储
 */
public interface IActivityRepository {
    GroupBuyActivityDiscountVO queryGroupBuyActivityDiscountVO(Long ActivityId);

    SkuVO querySkuByGoodsId(String goodsId);

    SCSkuActivityVO querySCSkuActivityBySCGoodsId(String source, String channel, String goodsId);

    boolean isTagCrowdRange(String tagId, String userId);

    boolean downgradeSwitch();

    boolean cutRange(String userId);
}
