package com.market.types.design.framework.link.model1;

/**
 * @author: car
 * @create: 2026/11/17 21:59
 * @description: 略规则责任链接口
 */
public interface ILogicLink<T, D, R> extends ILogicChainArmory<T, D, R> {
    R apply(T requestParameter, D dynamicContext) throws Exception;
}
