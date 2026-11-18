package com.market.types.design.framework.link.model1;

/**
 * @author: car
 * @create: 2026/11/17 22:00
 * @description: 责任链装配
 */
public interface ILogicChainArmory<T, D, R> {

    ILogicLink<T, D, R> next();

    ILogicLink<T, D, R> appendNext(ILogicLink<T, D, R> next);
}
