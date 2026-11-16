package com.market.domain.tag.service;

/**
 * @author: car
 * @create: 2026/11/16 14:35
 * @description: 人群标签服务接口
 */
public interface ITagService {
    /**
     * 执行人群标签批次任务
     *
     * @param tagId   人群ID
     * @param batchId 批次ID
     */
    void execTagBatchJob(String tagId, String batchId);

}
