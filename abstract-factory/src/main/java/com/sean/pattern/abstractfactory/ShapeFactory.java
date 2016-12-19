package com.sean.pattern.abstractfactory;

/**
 * @Author: sean
 * @Email: jun-long.guo@hpe.com
 * @Date: 2016/12/19.
 */
public class ShapeFactory extends AbstractFactory {
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    public Color getColor(String colorType) {
        return null;
    }
}
