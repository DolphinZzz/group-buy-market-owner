package com.market.infrastructure.dao;

import com.market.infrastructure.dao.po.GroupBuyOrderList;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: car
 * @create: 2026/11/17 16:05
 * @description: 用户拼单明细
 */
@Mapper
public interface IGroupBuyOrderListDao {
    void insert(GroupBuyOrderList groupBuyOrderListReq);

    GroupBuyOrderList queryGroupBuyOrderRecordByOutTradeNo(GroupBuyOrderList groupBuyOrderListReq);

}
