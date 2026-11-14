package com.market.types.design.framework.tree;


import lombok.Getter;
import lombok.Setter;

/**
 * @author: car
 * @create: 2026/11/14 16:51
 * @description:
 */
public abstract class AbstractStrategyRouter<T,D,R> implements StrategyHandler<T,D,R>,StrategyMapper<T,D,R>{

    @Getter
    @Setter
    protected StrategyHandler defaultStrategyHandler = StrategyHandler.DEFAULT;

    public R router(T requestParameter,D dynamicContext) throws Exception{
        StrategyHandler<T, D, R> strategyHandler = get(requestParameter, dynamicContext);
        if(null!=strategyHandler) return strategyHandler.apply(requestParameter, dynamicContext);
        return (R) defaultStrategyHandler.apply(requestParameter, dynamicContext);
    }
}
