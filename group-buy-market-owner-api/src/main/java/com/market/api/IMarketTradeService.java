package com.market.api;

import com.market.dto.LockMarketPayOrderRequestDTO;
import com.market.dto.LockMarketPayOrderResponseDTO;
import com.market.dto.SettlementMarketPayOrderRequestDTO;
import com.market.dto.SettlementMarketPayOrderResponseDTO;
import com.market.response.Response;

/**
 * @author: car
 * @create: 2026/11/17 17:23
 * @description: 营销交易服务接口
 */
public interface IMarketTradeService {

    /**
     * 营销锁单
     *
     * @param requestDTO 锁单商品信息
     * @return 锁单结果信息
     */
    Response<LockMarketPayOrderResponseDTO> lockMarketPayOrder(LockMarketPayOrderRequestDTO requestDTO);

    /**
     * 营销结算
     *
     * @param requestDTO 结算商品信息
     * @return 结算结果信息
     */
    Response<SettlementMarketPayOrderResponseDTO> settlementMarketPayOrder(SettlementMarketPayOrderRequestDTO requestDTO);

}
