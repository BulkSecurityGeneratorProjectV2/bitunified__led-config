package com.bitunified.ledconfig;

import com.bitunified.ledconfig.domain.product.PCB.LedStrip;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;


public class PriceCalculatorTest {

    @Test
    public void test(){
        PriceCalculator calculator=new PriceCalculator();
        String[] args=new String[]{"CAGDR11102000500b"};
        LedConfig ledConfig=new LedConfig();
        ConfigResult result=ledConfig.rules(args);

        BigDecimal total=calculator.calculate(result);
        System.out.println(total);
    }
}