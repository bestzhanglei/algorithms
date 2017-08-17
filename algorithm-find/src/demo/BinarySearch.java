package demo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: zhangl
 * Date: 2017/8/17
 * Description: 二分查找算法
 * Project: algorithms
 */
public class BinarySearch {

    public static void main(String[] args) {
        //输入：输入第一个数n为数组长度，第二个数key为要查找的数，接下来n个数为数组元素
        //输出：如果存在，输出对应下标，否则输出-1
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int key = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        //将数组排序为升序数字顺序
        Arrays.sort(arr);

        //基础算法输出
        System.out.println(find(key, arr));
        //递归实现输出
        System.out.println(find1(key, arr));

        //Arrays内二分查找方法
        System.out.println(Arrays.binarySearch(arr, key));

    }

    //基础实现
    public static int find(int key, int[] a) {
        //必须是有序数组
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            //被查找的键要么不存在，要么必然存在于a[start..end]之中
            int mid = start + (end - start) / 2;
            if (key < a[mid]) end = mid - 1;
            else if (key > a[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }

    //二分查找的递归实现
    public static int find1(int key, int[] a) {
        return find1(key, a, 0, a.length - 1);
    }

    public static int find1(int key, int[] a, int start, int end) {
        if (start > end) return -1;
        int mid = start + (start - end) / 2;
        if (key < a[mid]) return find1(key, a, start, mid - 1);
        else if (key > a[mid]) return find1(key, a, mid + 1, end);
        else return mid;
    }

}
