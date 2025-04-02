package edu.realemj.exercises13;
import edu.realemj.exercises09.*;
import java.util.*;
import java.io.*;
public class OBJModel {
    private ArrayList<Matrix> vertices;
    private ArrayList<Integer> indices;

    public void save(String filename) throws IOException {
        try (
                PrintWriter output = new PrintWriter(filename);
                ) {
            // v x y z
            // f 0 3 2
            for(Matrix v: vertices) {
                output.println("v " + v.get(0,0) + " "
                                + v.get(1,0) + " "
                                + v.get(2,0));
            }

            for(int i = 0; i < indices.size(); i+=3) {
                output.println("f " + indices.get(i) + " "
                                + indices.get(i+1) + " "
                                + indices.get(i+2));
            }
        }
    }
}
