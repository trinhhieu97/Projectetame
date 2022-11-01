package org.example;

public class TernarySearch {
    public static void main(String[] args) {
        int[] arr = {10,14,19,26,27,31,33,35,42,44,45,71,81,87};
        int number = 81;
        int mid1;
        int mid2;
        int l = 0;
        int r = arr.length -1;
        for (int i = 0; i < arr.length; i++){
            mid1 = l+((l+r)/3);
            mid2 = r-((l+r)/3)*2;
            if (arr[mid1] == number){
                System.out.println("tìm thấy ở vòng if đầu và giá trị ở ô thứ "+mid1);
                break;
            }
            if (arr[mid2] == number){
                System.out.println("tìm thấy ở vòng if đầu và giá trị ở ô thứ "+mid2);
                break;
            }
            if (arr[mid1] > number){
                r = mid1 - 1;
            }
            if (arr[mid1] < number && number < arr[mid2]){
                r = mid2 - 1;
                l = mid1 + 1;
            }
            if (arr[mid2] < number){
                l = mid2 + 1;
            }
        }
    }
}
