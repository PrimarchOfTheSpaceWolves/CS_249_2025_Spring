package edu.realemj.exercises13;

import edu.realemj.exercises09.Matrix;
public class ModelModifier {
    public static void main(String [] args) {
        try {
            OBJModel model = new OBJModel();
            model.load("bunny.obj");
            Matrix T = Matrix.makeScaling3D(1.0, 2.0, 1.0);
            model.applyTransform(T);
            model.save("bunnyTransformed.obj");
        }
        catch(Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }
}
