package com.market.api;

import com.market.dto.LockMarketPayOrderRequestDTO;
import com.market.dto.LockMarketPayOrderResponseDTO;
import com.market.response.Response;

/**
 * @author: car
 * @create: 2026/11/17 17:23
 * @description: 营销交易服务接口
 */
public interface IMarketTradeService {
    Response<LockMarketPayOrderResponseDTO> lockMarketPayOrder(LockMarketPayOrderRequestDTO lockMarketPayOrderRequestDTO);

}
