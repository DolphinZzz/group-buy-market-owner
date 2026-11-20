package com.market.domain.activity.service;

import com.market.domain.activity.model.entity.MarketProductEntity;
import com.market.domain.activity.model.entity.TrialBalanceEntity;
import com.market.domain.activity.model.entity.UserGroupBuyOrderDetailEntity;
import com.market.domain.activity.model.valobj.TeamStatisticVO;

import java.util.List;

/**
 * @author: car
 * @create: 2026/11/14 21:57
 * @description: 首页营销服务接口
 */
public interface IIndexGroupBuyMarketService {

    TrialBalanceEntity indexMarketTrial(MarketProductEntity marketProductEntity) throws Exception;

    /**
     * 查询进行中的拼团订单
     *
     * @param activityId  活动ID
     * @param userId      用户ID
     * @param ownerCount  个人数量
     * @param randomCount 随机数量
     * @return 用户拼团明细数据
     */
    List<UserGroupBuyOrderDetailEntity> queryInProgressUserGroupBuyOrderDetailList(Long activityId, String userId, Integer ownerCount, Integer randomCount);

    /**
     * 活动拼团队伍总结
     *
     * @param activityId 活动ID
     * @return 队伍统计
     */
    TeamStatisticVO queryTeamStatisticByActivityId(Long activityId);

}