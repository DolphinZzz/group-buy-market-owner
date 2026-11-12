package com.market.infrastructure.dao;

import com.market.infrastructure.dao.po.GroupBuyActivity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: car
 * @create: 2026/11/12 15:59
 * @description: 拼团活动Dao
 */
@Mapper
public interface IGroupBuyActivityDao {
    List<GroupBuyActivity> queryGroupBuyActivityList();

}
