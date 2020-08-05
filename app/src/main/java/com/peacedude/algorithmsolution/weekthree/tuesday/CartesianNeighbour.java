package com.peacedude.algorithmsolution.weekthree.tuesday;

//Task
//        A Cartesian coordinate system is a coordinate system that specifies each point uniquely in a plane by a pair of numerical
//        coordinates, which are the signed distances to the point from two fixed perpendicular directed lines,
//        measured in the same unit of length.
//
//        The сoordinates of a point in the grid are written as (x, y). Each point in a coordinate system has eight neighboring points.
//        It is provided that the grid step = 1.
//
//        Your task is to write a function that takes a coordinate on the x-axis and y-axis and returns a list of
//        all the neighboring points. Points inside your result list don't have to be sorted--any ordering is valid.


public class CartesianNeighbour {
    public static int[][] cartesianNeighbor(int x, int y){
        int[][] res = new int[8][];
        int count = 0;
        int[] d = {0, 1, -1};
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                if (!(x + d[i] == x && y + d[j] == y)) {
                    int[] m = {x + d[i], y + d[j]};
                    res[count++] = m;
                }
            }
        }
        return res;
    }
}