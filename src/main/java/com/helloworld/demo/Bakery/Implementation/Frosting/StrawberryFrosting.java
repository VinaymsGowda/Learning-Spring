package com.helloworld.demo.Bakery.Implementation.Frosting;


import com.helloworld.demo.Bakery.IFrosting;
import com.helloworld.demo.Bakery.ISyrup;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="frosting.type",havingValue = "strawberry")
public class StrawberryFrosting implements IFrosting {

    @Override
    public String getFrostingType() {
        return "Strawberry Frosting";
    }
}
