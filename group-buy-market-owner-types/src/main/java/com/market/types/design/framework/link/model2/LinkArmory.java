package com.market.types.design.framework.link.model2;


import com.market.types.design.framework.link.model2.chain.BusinessLinkedList;
import com.market.types.design.framework.link.model2.handler.ILogicHandler;

/**
 * @author: car
 * @create: 2026/11/17 22:21
 * @description: 链路装配
 */
public class LinkArmory<T, D, R> {

    private final BusinessLinkedList<T, D, R> logicLink;

    @SafeVarargs
    public LinkArmory(String linkName, ILogicHandler<T, D, R>... logicHandlers) {
        logicLink = new BusinessLinkedList<>(linkName);
        for (ILogicHandler<T, D, R> logicHandler: logicHandlers){
            logicLink.add(logicHandler);
        }
    }

    public BusinessLinkedList<T, D, R> getLogicLink() {
        return logicLink;
    }

}
