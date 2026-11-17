package com.market.infrastructure.dao;

import com.market.infrastructure.dao.po.GroupBuyOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: car
 * @create: 2026/11/17 15:58
 * @description: 用户拼单
 */
@Mapper
public interface IGroupBuyOrderDao {
    void insert(GroupBuyOrder groupBuyOrder);

    int updateAddLockCount(String teamId);

    int updateSubtractionLockCount(String teamId);

    GroupBuyOrder queryGroupBuyProgress(String teamId);
}
