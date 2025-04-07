package edu.realemj.exercises13;
import edu.realemj.exercises09.*;
import java.util.*;
import java.io.*;
public class OBJModel {
    private ArrayList<Matrix> vertices = new ArrayList<>();
    private ArrayList<Integer> indices = new ArrayList<>();

    public void clear() {
        vertices.clear();
        indices.clear();
    }

    public void load(String filename) throws OBJFileException {
        try (
               Scanner input = new Scanner(new File(filename));
                ) {
            clear();

            while(input.hasNextLine()) {
                String line = input.nextLine();
                line = line.trim();
                if(!line.isEmpty()) {
                    Scanner lineParse = new Scanner(line);
                    // v x y z
                    // f 0 1 2
                    String token = lineParse.next();
                    if(token.equals("v")) {
                        // Vertex
                        double x = lineParse.nextDouble();
                        double y = lineParse.nextDouble();
                        double z = lineParse.nextDouble();
                        Matrix point = Matrix.makePoint3D(x,y,z);
                        vertices.add(point);
                    }
                    else if(token.equals("f")) {
                        // Face
                        int i0 = lineParse.nextInt();
                        int i1 = lineParse.nextInt();
                        int i2 = lineParse.nextInt();
                        indices.add(i0);
                        indices.add(i1);
                        indices.add(i2);
                    }
                }
            }
        }
        catch(IOException e) {
            clear();
            throw new OBJFileException("Could not load 3D file", e);
        }
        catch(InputMismatchException e) {
            clear();
            throw new OBJFileException("Bad OBJ file format", e);
        }
        catch(Exception e) {
            clear();
            throw new OBJFileException("Unknown error", e);
        }
    }

    public void save(String filename) throws OBJFileException {
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
        catch(IOException e) {
            throw new OBJFileException("Could not save OBJ file", e);
        }
        catch(Exception e) {
            throw new OBJFileException("Unknown error", e);
        }
    }

    public void applyTransform(Matrix T) {
        for(int i = 0; i < vertices.size(); i++) {
            Matrix v = vertices.get(i);
            v = T.multiply(v);
            vertices.set(i, v);
        }
    }
}
