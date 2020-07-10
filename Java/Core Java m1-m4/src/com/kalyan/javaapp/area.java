package com.kalyan.javaapp;

import static java.lang.StrictMath.PI;

public class area implements perimeter {
    public float length;
    public float breadth;
    public float side;
    public float radius;

    public float areaRectable()
    {
        return (length*breadth);
    }
    public float areaSquare()
    {
        return (side*side);
    }
    public float areaCircle()
    {
        return (float) (2*PI*radius);
    }

    /**
     * @return
     */
    @Override
    public float calPerimeter() {
        float v = 2 * (length + breadth);
        return v;
    }
}
