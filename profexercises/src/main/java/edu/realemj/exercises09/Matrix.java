package edu.realemj.exercises09;

import java.util.*;
public class Matrix {
    private double [][] m;
    //private int rowCnt;
    //private int colCnt;

    public Matrix(int rows, int cols) {
        m = new double[rows][cols];
        //rowCnt = rows;
        //colCnt = cols;
    }

    public Matrix(double [][] data) {
        m = new double[data.length][data[0].length];
        //rowCnt = data.length;
        //if(data.length > 0) {
        //    colCnt = data[0].length;
        //}

        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                m[i][j] = data[i][j];
            }
        }
    }

    public Matrix(Matrix other) {
        //m = new double[other.m.length][other.m[0].length];
        m = new double[other.getRowCnt()][other.getColCnt()];
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                m[i][j] = other.m[i][j];
            }
        }
    }

    public int getRowCnt() {
        return m.length;
        //return rowCnt;
    }

    public int getColCnt() {
        return m[0].length;
        //return colCnt;
    }

    public boolean isValidPosition(int row, int col) {
        return (row < getRowCnt()
                && col < getColCnt()
                && row >= 0
                && col >= 0);
    }

    public double get(int row, int col) {
        if(isValidPosition(row, col)) {
            return m[row][col];
        }

        return 0;
    }

    public void set(int row, int col, double val) {
        if(isValidPosition(row, col)) {
            m[row][col] = val;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(double [] row: m) {
            for(double v: row) {
                sb.append(v);
                sb.append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public Matrix multiply(Matrix other) {
        Matrix result = new Matrix(this.getRowCnt(), other.getColCnt());
        for(int i = 0; i < this.getRowCnt(); i++) {
            for(int j = 0; j < other.getColCnt(); j++) {
                for(int k = 0; k < this.getColCnt(); k++) {
                    result.m[i][j] += this.m[i][k]*other.m[k][j];
                }
            }
        }
        return result;
    }

    public String toPoint2DString() {
        return "(" + m[0][0] + "," + m[1][0] + ")";
    }

    public static Matrix makeIdentity(int size) {
        Matrix M = new Matrix(size, size);
        for(int i = 0; i < size; i++) {
            M.set(i,i,1);
        }
        return M;
    }

    public static Matrix makePoint2D(double x, double y) {
        Matrix v = new Matrix(3, 1);
        v.set(0,0, x);
        v.set(1, 0, y);
        v.set(2, 0, 1);
        return v;
    }

    public static Matrix makeTranslation2D(double offx, double offy) {
        Matrix T = makeIdentity(3);
        T.set(0,2,offx);
        T.set(1,2,offy);
        return T;
    }
}
