package bubblesort;

/**
 * 자동정렬은 command option l
 * 자동개행은 command shift enter
 * <p>
 * 단어 건너뛰기 option  화살표
 * 단어 건너뛰기하면서 감싸기 option shift  화살표
 * 전체선택 command shift 화살표
 * 주석 -한줄일 때 command / (두번 누르면 주석 풀림)
 * 두줄이상 command shift /
 * 파일 만들기 command n
 * static  객체를 만들지 않고도 접근 가능하게 해준다.
 * import 할때 Arrays (s들어간다)
 * 배열을 출력할 때 Arrays.toString(arr)   s필수^^
 */
//
//class Util {
//    static double PI = 3.141592;
//}

import java.util.Arrays;
//import java.util.Collections;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 12, -5, 16};
//        swap(arr, 0, 2);
        bubbleSort(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int arr[], int a, int b) {
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // bubble sort
    // i = 0
    // int[] arr = {5, 1, 12, -5, 16}; j = 0
    // int[] arr = {1, 5, -12, 5, 16}; j = 4

    // i = 1
    // int[] arr = {1, 5, -12, 5, 16}; j = 0
    // int[] arr = {1, -12, 5, 5, 16}; j = 1
    // int[] arr = {1, -12, 5, 5, 16}; j = 4

    // i = 2
    // int[] arr = {1, -12, 5, 5, 16}; j = 0
    // int[] arr = {-12, 1, 5, 5, 16}; j = 4

    // i = 3
    // int[] arr = {-12, 1, 5, 5, 16}; j = 0
    static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // O(n^2), o(n^2), theta(n^2)
    // 1 byte = 8 bit
    // bit < byte <    kbyte    <     mbyte    <     gbyte
    //       8bit   2^10 * byte   2^10 * kbyte   2^10 * mbyte = 2^10 * 2^10 * 2^10 * 8 bit

    // 10^3 = 2^10 = k
    // 10^6 = 2^20 = m     N = 1000 => 1ms
    // 10^9 = 2^30 = g => 1억 => 1초 = 1000ms

    // 2만개 // 만개에다가 인풋을 받아 // 0~ 만개까지 읽으면서 // 1
}

