package com.sean.pattern.abstractfactory;

/**
 * @Author: sean
 * @Email: jun-long.guo@hpe.com
 * @Date: 2016/12/19.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }

}
