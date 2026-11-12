package com.market.infrastructure.dao;

import com.market.infrastructure.dao.po.GroupBuyDiscount;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: car
 * @create: 2026/11/12 15:58
 * @description: 折扣配置Dao
 */
@Mapper
public interface IGroupBuyDiscountDao {
    List<GroupBuyDiscount> queryGroupBuyDiscountList();
}
