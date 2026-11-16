package com.market.domain.tag.adapter.repository;

import com.market.domain.tag.model.entity.CrowdTagsJobEntity;

/**
 * @author: car
 * @create: 2026/11/16 14:25
 * @description: 人群标签仓储接口
 */
public interface ITagRepository {
    CrowdTagsJobEntity queryCrowdTagsJobEntity(String tagId, String batchId);

    void addCrowdTagsUserId(String tagId, String userId);

    void updateCrowdTagsStatistics(String tagId, int count);
}
