package com.market.domain.activity.service.discount;

import com.market.domain.activity.model.valobj.GroupBuyActivityDiscountVO;

import java.math.BigDecimal;

/**
 * @author: car
 * @create: 2026/11/15 23:49
 * @description: 折扣计算
 */
public interface IDiscountCalculateService {
    /**
     *
     * @param userId           用户ID
     * @param originalPrice    商品原始价格
     * @return 商品优惠价格
     */
    BigDecimal calculate(String userId, BigDecimal originalPrice, GroupBuyActivityDiscountVO.GroupBuyDiscount groupBuyDiscount);
}
