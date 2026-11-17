package com.market.api;

import com.market.response.Response;

/**
 * @author: car
 * @create: 2026/11/17 00:17
 * @description: DCC 动态配置中心
 */
public interface IDCCService {
    Response<Boolean> updateConfig(String key, String value);

}
