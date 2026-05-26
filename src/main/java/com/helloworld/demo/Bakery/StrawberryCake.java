package com.helloworld.demo.Bakery;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Qualifier("strawberry")
@Component
public class StrawberryCake implements ICake{
    @Override
    public String getFrostingType() {
        return "Strawberry frosting";
    }

    @Override
    public String getSyrupType() {
        return "Strawberry syrup";
    }
}
