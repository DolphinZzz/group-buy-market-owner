package com.market.infrastructure.dao;

import com.market.infrastructure.dao.po.Sku;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: car
 * @create: 2026/11/14 20:29
 * @description: Sku配置Dao
 */
@Mapper
public interface ISkuDao {
    Sku querySkuByGoodsId(String goodsId);
}
