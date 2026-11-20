package com.market.api;

import com.market.dto.GoodsMarketRequestDTO;
import com.market.dto.GoodsMarketResponseDTO;
import com.market.response.Response;

/**
 * @author: car
 * @description: 营销首页服务接口
 */
public interface IMarketIndexService {

    /**
     * 查询拼团营销配置
     *
     * @param goodsMarketRequestDTO 营销商品信息
     * @return 营销配置信息
     */
    Response<GoodsMarketResponseDTO> queryGroupBuyMarketConfig(GoodsMarketRequestDTO goodsMarketRequestDTO);

}
