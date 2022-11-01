package org.example;

public class InterpolationSearch {
    public static void main(String[] args) {
        int[] arr = {10,14,19,26,27,31,33,35,42,44};
        int number = 44;
        int search;
        int l = 0;
        int r = arr.length -1;
        for (int i = 0; i < arr.length; i++){
            search = l+((number - arr[l])*(r - l))/(arr[r]-arr[l]);
            if (arr[search] == number){
                System.out.println("tìm thấy ở vòng if đầu và giá trị ở ô thứ "+search);
                break;
            }
            if (arr[search] < number){
                l = search + 1;
            }
            if (arr[search] > number){
                r = search - 1;
            }
        }
    }
}