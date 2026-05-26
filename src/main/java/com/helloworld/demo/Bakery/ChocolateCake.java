package com.helloworld.demo.Bakery;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Qualifier("chocolate")
@Component
public class ChocolateCake implements ICake{


    @Override
    public String getFrostingType() {
        return "Chocolate frosting";
    }

    @Override
    public String getSyrupType() {
        return "Choco syrup";
    }
}
