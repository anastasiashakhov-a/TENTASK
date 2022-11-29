package ru.vsu.cs.course1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
    public static void Process(int[][] arr2) {
        for (int r = 0; r < arr2.length; r++) {
            for (int c = 0; c < arr2[r].length; c++) {
                arr2[r][c]++;
            }
        }
    }

    public static int[][] Process2(int[][] arr2) {
        int[][] res = new int[2][2];
        for (int r = 0; r < Math.min(arr2.length, 2); r++) {
            for (int c = 0; c < Math.min(arr2[0].length, 2); c++) {
                res[r][c] = arr2[r][c];
            }
        }
        return res;
    }

    public static int[][] checkSizes(int [][] NewArray){
        // сортируем параметры коробки по возрастанию
        int [][] Array = sortArray(NewArray);
        // список для конечного результата
        List <List> FinalList = new ArrayList<>();
        // создаем список объектов
        List <Box> boxes = new ArrayList<>();
        // присваеваем значения к элементам списка
        for (int i = 0; i < Array.length; i++){
            boxes.add(new Box(Array[i][0], Array[i][1], Array[i][2]));
        }


        for (int i = 0; i < boxes.size(); i++){
            for (int j = 0; j < boxes.size(); j++){
                int a1 = boxes.get(i).getLength();
                int b1 = boxes.get(i).getWidth();
                int c1 = boxes.get(i).getHeight();

                int a2 = boxes.get(j).getLength();
                int b2 = boxes.get(j).getWidth();
                int c2 = boxes.get(j).getHeight();
                if (a1 < a2 && b1 < b2 && c1 < c2){

                    List <Integer> list1 = new ArrayList<>();
                    list1.add(a1);
                    list1.add(b1);
                    list1.add(c1);

                    List <Integer> list2 = new ArrayList<>();
                    list2.add(a2);
                    list2.add(b2);
                    list2.add(c2);

                    FinalList.add(list1);
                    FinalList.add(list2);
                }
            }
        }
        return (toArray(FinalList));
    }
//    public static int[][] toEnumerate(int [][] arr){
//        int [][] array = new int[arr.length][4];
//        int i = 0;
//        while (i < arr.length){
//            array[i][0] = 1;
//            array[i][1] = arr[i][0];
//            array[i][2] = arr[i][1];
//            array[i][3] = arr[i][2];
//
//            array[i+1][0] = 2;
//            array[i+1][1] = arr[i+1][0];
//            array[i+1][2] = arr[i+1][1];
//            array[i+1][3] = arr[i+1][2];
//
//            i = i+2;
//        }
//
//        return array;
//    }

    // конвертировать список в массив
    public static int[][] toArray(List <List> allList){
        int [][] FinalArray = new int[allList.size()][3];
        for (int i = 0; i < allList.size(); i++){
            List <Integer> list = allList.get(i);
            FinalArray[i][0] = list.get(0);
            FinalArray[i][1] = list.get(1);
            FinalArray[i][2] = list.get(2);

        }
        return (FinalArray);
    }
    public static class Box{
        int length;
        int width;
        int height;
        Box (int length, int width, int height){
            this.length = length;
            this.width = width;
            this.height = height;
        }
        public int getLength(){
            return length;
        }
        public int getWidth(){
            return width;
        }
        public int getHeight(){
            return height;
        }


    }
    // сортировка параметров коробки (по возрастанию)
    public static int[][] sortArray(int[][] array){
        int [][] arr = new int[array.length][3];
        for (int i = 0; i < array.length; i++){
            int a = array[i][0];
            int b = array[i][1];
            int c = array[i][2];

            if (a <= b && a <= c){
                arr[i][0] = a;
                if (b <= c){
                    arr[i][1] = b;
                    arr[i][2] = c;
                }
                else{
                    arr[i][1] = c;
                    arr[i][2] = b;
                }
            } else if (b <= a && b <= c) {
                arr[i][0] = b;
                if (a <= c){
                    arr[i][1] = a;
                    arr[i][2] = c;
                }
                else{
                    arr[i][1] = c;
                    arr[i][2] = a;
                }
            } else{
                arr[i][0] = c;
                if (a <= b){
                    arr[i][1] = a;
                    arr[i][2] = b;
                }
                else{
                    arr[i][1] = b;
                    arr[i][2] = a;
                }
            }
        }
        return arr;
    }
}
