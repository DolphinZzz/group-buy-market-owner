package com.market.types.design.framework.tree;

/**
 * @author: car
 * @create: 2026/11/14 16:50
 * @description: 策略映射器
 */
public interface StrategyMapper<T, D, R> {

    /**
     * 获取待执行策略
     * @param requestParameter
     * @param dynamicContext
     * @return 返回参数
     */
    StrategyHandler<T, D, R> get(T requestParameter, D dynamicContext) throws Exception;

}
