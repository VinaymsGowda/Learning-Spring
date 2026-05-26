package com.helloworld.demo.Bakery.Implementation.Frosting;

import com.helloworld.demo.Bakery.IFrosting;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="frosting.type",havingValue = "chocolate")
public class ChocolateFrosting implements IFrosting {

    @Override
    public String getFrostingType() {
        return "Chocolate Frosting";
    }
}
