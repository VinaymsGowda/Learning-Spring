package com.helloworld.demo.Bakery;

import org.springframework.stereotype.Component;


/*
* • Create a class called CakeBaker, that is dependent on two other
classes called Frosting and Syrup. This class has a function
called bakeCake().
• Create two interfaces of type Frosting and Syrup with a
function called getFrostingType and getSyrupType respectively.
• Create two implementations of these two interfaces (so total 4
classes) for Chocolate and Strawberry flavors.
• Use Dependency injection to inject the Frosting and Syrup
dependencies into CakeBaker and also to call the bakeCake
function of the CakeBaker class.
* */
@Component
public class CakeBakery {

    public void bakeCake(ICake cake){
        System.out.println("Preparing cake with "+cake.getFrostingType()+" And "+cake.getSyrupType());
    }
}
