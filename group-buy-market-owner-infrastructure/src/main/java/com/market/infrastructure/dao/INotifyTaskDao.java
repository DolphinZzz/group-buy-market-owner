package com.market.infrastructure.dao;

import com.market.infrastructure.dao.po.NotifyTask;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: car
 * @create: 2026/11/18 18:37
 * @description: 回掉任务
 */
@Mapper
public interface INotifyTaskDao {

    void insert(NotifyTask notifyTask);

}