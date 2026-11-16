package com.market.infrastructure.dao;

import com.market.infrastructure.dao.po.CrowdTags;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: car
 * @create: 2026/11/16 13:48
 * @description: 人群标签
 */
@Mapper
public interface ICrowdTagsDao {
    void updateCrowdTagsStatistics(CrowdTags crowdTagsReq);

}
