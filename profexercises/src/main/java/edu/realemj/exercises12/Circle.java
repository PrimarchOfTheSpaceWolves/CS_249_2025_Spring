package edu.realemj.exercises12;

import edu.realemj.exercises09.Matrix;
import edu.realemj.exercises13.InvalidRadiusException;

import java.lang.module.InvalidModuleDescriptorException;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
        // super();
    }
    public Circle(double radius) throws InvalidRadiusException {
        setRadius(radius);
    }

    public Circle(double radius, Matrix pos, boolean filled)
        throws InvalidRadiusException {

        super(pos, filled);
        setRadius(radius);
        //setPos(pos);
        //setFilled(filled);
        //this.filled = filled;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) throws InvalidRadiusException {
        if(radius < 0.0) {
            throw new InvalidRadiusException("Bad radius: " + radius);
        }

        this.radius = radius;
    }

    @Override
    public String toString() {

        return "[(Circle) radius=" + radius + " " + super.toString() + "]";
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Circle cother) {
            return Math.abs(this.radius - cother.radius) < 1e-6;
        }
        else {
            return false;
        }
    }
}
