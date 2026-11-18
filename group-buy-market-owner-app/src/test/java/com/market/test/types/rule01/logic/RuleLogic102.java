package com.market.test.types.rule01.logic;


import com.market.test.types.rule01.factory.Rule01TradeRuleFactory;
import com.market.test.types.rule02.factory.Rule02TradeRuleFactory;
import com.market.types.design.framework.link.model1.AbstractLogicLink;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author: car
 * @create: 2026/11/17 22:16
 * @description:
 */
@Slf4j
@Service
public class RuleLogic102 extends AbstractLogicLink<String, Rule01TradeRuleFactory.DynamicContext, String> {
    @Override
    public String apply(String requestParameter, Rule01TradeRuleFactory.DynamicContext dynamicContext) throws Exception{

        log.info("link model01 RuleLogic102");

        return "link model01 单实例链";
    }

}
