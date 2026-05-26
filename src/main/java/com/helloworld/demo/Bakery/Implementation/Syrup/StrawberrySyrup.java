package com.helloworld.demo.Bakery.Implementation.Syrup;

import com.helloworld.demo.Bakery.IFrosting;
import com.helloworld.demo.Bakery.ISyrup;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="syrup.type",havingValue = "strawberry")
public class StrawberrySyrup implements ISyrup {

    @Override
    public String getSyrupType() {
        return "Strawberry syrup";
    }
}
