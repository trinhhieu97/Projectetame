package org.example;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 14, 19, 26, 27, 31, 33, 35, 42, 44};
        int number = 40;
        boolean h = true;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == number){
                System.out.println("Sô cần tìm ở vị trí thứ "+i);
                h = false;
            }
        }
        if (h == true){
            System.out.println("Không có số cần tìm ");
        }
    }
}