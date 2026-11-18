package com.market.domain.trade.model.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: car
 * @create: 2026/11/18 14:36
 * @description: 拼团交易命令实体
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TradeRuleCommandEntity {

    /** 用户ID */
    private String userId;
    /** 活动ID */
    private Long activityId;

}
