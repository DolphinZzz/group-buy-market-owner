package com.market.test.infrastructure.dao;


import com.alibaba.fastjson.JSON;
import com.market.infrastructure.dao.ISkuDao;
import com.market.infrastructure.dao.po.Sku;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author: car
 * @create: 2026/11/14 20:34
 * @description:
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SkuDaoTest {
    @Resource
    private ISkuDao iSkuDao;

    @Test
    public void test_querySkuList() {
        Sku sku = iSkuDao.querySkuByGoodsId("9890001");
        log.info("测试结果:{}", JSON.toJSONString(sku));
    }
}
