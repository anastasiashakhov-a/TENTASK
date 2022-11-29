package ru.vsu.cs.course1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void test1(){
        int[][] arr = {{1, 5, 6}, {6, 6, 7}, {1, 1, 1}, {1, 2, 3}};
        int[][] expectedArr = {{1, 5, 6}, {6, 6, 7}, {1, 1, 1}, {6, 6, 7}, {1, 2, 3}, {6, 6, 7}};
//        System.out.println(ArrayUtils.toString(Task.createNew(arr)));
//        System.out.println(" ");
//        System.out.println(ArrayUtils.toString(Task.createNew(expectedArr)));
        Assertions.assertArrayEquals(expectedArr, Task.checkSizes(arr), "Array must be...");
    }

    @Test
    public void test2(){
        int[][] arr = {{6, 8, 7}, {7, 5, 6}};
        int[][] expectedArr = {{5, 6, 7}, {6, 7, 8}};
//        System.out.println(ArrayUtils.toString(Task.createNew(arr)));
//        System.out.println(" ");
//        System.out.println(ArrayUtils.toString(Task.createNew(expectedArr)));
        Assertions.assertArrayEquals(expectedArr, Task.checkSizes(arr), "Array must be...");
    }

    @Test
    public void test3(){
        int[][] arr = {{ 36, 48, 24}, {2, 3, 4}, {44, 24, 14}, {99, 99, 100}};
        int[][] expectedArr = { {24, 36, 48},
                                {99, 99, 100},
                                {2, 3, 4},
                                {24, 36, 48},
                                {2, 3, 4},
                                {14, 24, 44},
                                {2, 3, 4},
                                {99, 99, 100},
                                {14, 24, 44},
                                {24, 36, 48},
                                {14, 24, 44},
                                {99, 99, 100}};
//        System.out.println(ArrayUtils.toString(Task.createNew(arr)));
//        System.out.println(" ");
//        System.out.println(ArrayUtils.toString(Task.createNew(expectedArr)));
        Assertions.assertArrayEquals(expectedArr, Task.checkSizes(arr), "Array must be...");
    }
    @Test
    public void test4(){
        int[][] arr = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        int[][] expectedArr =  {{1, 2, 3},
                                {2, 3, 4},
                                {1, 2, 3},
                                {3, 4, 5},
                                {2, 3, 4},
                                {3, 4, 5}};
//        System.out.println(ArrayUtils.toString(Task.createNew(arr)));
//        System.out.println(" ");
//        System.out.println(ArrayUtils.toString(Task.createNew(expectedArr)));
        Assertions.assertArrayEquals(expectedArr, Task.checkSizes(arr), "Array must be...");
    }

    @Test
    public void test5(){
        int[][] arr = {{1, 1, 1}, {4, 4, 4}, {1, 2, 2}};
        int[][] expectedArr = {{1, 1, 1}, {4, 4, 4}, {1, 2, 2}, {4, 4, 4}};
//        System.out.println(ArrayUtils.toString(Task.createNew(arr)));
//        System.out.println(" ");
//        System.out.println(ArrayUtils.toString(Task.createNew(expectedArr)));
        Assertions.assertArrayEquals(expectedArr, Task.checkSizes(arr), "Array must be...");
    }


}