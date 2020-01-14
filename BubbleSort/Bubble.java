import java.util.Arrays;

/**
 * Created by yemin on 2020/1/14.
 */
public class Bubble {

    /**
     * 冒泡排序：自小到大
     * @param toSort 待排列数组（会改动参数）
     */
    private static void bubbleSort(int[] toSort) {
        int length = toSort.length;
        //如果长度是0和1 无需排序
        if (length <= 1) {
            System.out.println("already sorted");
            return;
        }

        for (int i = 1; i < length; i++) {
            boolean isChanged = false;
            for (int j = 0; j < length - i; j++) {
                int e1 = toSort[j];
                int e2 = toSort[j+1];
                if (e1 > e2) {
                    toSort[j] = e2;
                    toSort[j+1] = e1;
                    isChanged = true;
                }
            }
            if (!isChanged) {
                break;
            }
        }


    }

    public static void main(String[] args) {
        int[] test = new int[]{1,5,3,2,9,11};
        Bubble.bubbleSort(test);
        System.out.println(Arrays.toString(test));
    }
}
