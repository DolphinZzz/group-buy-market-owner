package com.market.types.design.framework.tree;

/**
 * @author: car
 * @create: 2026/11/14 16:49
 * @description: 策略受理器
 */
public interface StrategyHandler<T, D, R> {
    StrategyHandler DEFAULT = (T, D) -> null;

    R apply(T requestParameter, D dynamicContext) throws Exception;
}
