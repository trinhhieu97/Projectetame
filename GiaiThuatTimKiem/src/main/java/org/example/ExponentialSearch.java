package org.example;

public class ExponentialSearch {
    public static void main(String[] args) {
        int[] arr = {10, 14, 19, 26, 27, 31, 33, 35, 42, 44, 48, 54, 32, 85, 91};
        int number = 26;
        int size = (int) Math.sqrt(arr.length - 1);
        int jump;
        int l = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            jump = l + size;
            if (jump >= arr.length - 1) {
                jump = arr.length - 1;
            }
            if (arr[jump] == number) {
                System.out.println("Số cần tìm ở chỉ mục số: " + jump);
                break;
            }
            if (arr[jump] < number) {
                l = jump;
            }
            if (arr[jump] >= number) {
                for (int count = l; count <= jump; count++) {
                    if (arr[count] == number) {
                        System.out.println("Số cần tìm ở chỉ mục số: " + count);
                        break;
                    }
                }
                break;
            }
        }
    }
}