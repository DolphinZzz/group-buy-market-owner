package com.market.infrastructure.dao;

import com.market.infrastructure.dao.po.SCSkuActivity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: car
 * @create: 2026/11/16 18:50
 * @description: 渠道商品活动配置关联表Dao
 */
@Mapper
public interface ISCSkuActivityDao {
    SCSkuActivity querySCSkuActivityBySCGoodsId(SCSkuActivity scSkuActivity);

}
