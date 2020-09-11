package quickSortLast;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n - 1);

        // * 스트링 빌더:
        // 이 객체를 사용하면 문자열을 저장해놨다가 한 번에 출력할 수 있습니다.
        // 한줄 한줄 sout 으로 출력하는 것보다 훨씬 빠릅니다.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
    }

    public static void quickSort(int[] arr, int begin, int end) {
        // if : because of index 'end' out of range ( -1 )
        if (begin < end) {
            int index = partition(arr, begin, end); // 1, 4, 3, 5 ==> 3

            quickSort(arr, begin, index - 1);
            quickSort(arr, index + 1, end);
        }
        // * else 가 없는 이유
        // partition 후 재귀 quickSort 를 실행하다보면,
        // 한쪽이 원소가 1개가 되는 경우가 있습니다. 이럴 경우 begin 과 end 가 같아집니다.
        // 1개는 그 자체로 정렬이 된 것이기 때문에 정렬을 할 필요가 없습니다.
    }

    // * partition 함수는 실행후 pivot 값보다 작은건 왼쪽, 큰건 오른쪽으로 보낸 후, 최종적으로 pivot 값이 들어간 위치를 반환합니다.
    public static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];                       // * 피벗값
        int smallerIdx = begin - 1;                 // 피벗보다 작은 게 발견되면 하나씩 늘립니다.

        for (int me = begin; me <= end - 1; me++) { // * pivot 이 있는 마지막 인덱스(end)는 건드리지 않습니다. 그 이유는,
            if (arr[me] < pivot) {
                smallerIdx++;
                swap(arr, smallerIdx, me);
            }
        }
//        [ ... 1, 4, 3, 5, ...]

        int pivotIndex = smallerIdx + 1; // smallerIdx 다음 원소가 pivot 값보다 큰 값중 하나기 때문에 이것과 교체하면 간단하기 때문입니다!
        swap(arr, end, pivotIndex);

        return pivotIndex; // 그 결과 pivotIndex 의 위치가 정해지고(정렬되고),그보다 작은 것들은 왼쪽, 큰것들은 오른쪽으로 가게 됩니다.(이 두 집합들은 정렬된게 아닙니다! 피벗만 정렬됐습니다!)
    }

    public static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
