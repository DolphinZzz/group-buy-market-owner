package com.market.domain.activity.model.valobj;


import lombok.*;

/**
 * @author: car
 * @create: 2026/11/16 19:09
 * @description: 渠道商品活动配置值对象
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SCSkuActivityVO {
    /** 渠道 */
    private String source;
    /** 来源 */
    private String chanel;
    /** 活动ID */
    private Long activityId;
    /** 商品ID */
    private String goodsId;

}
