package daily;
/*
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class demo104 {
    public int minNumberInRotateArray(int [] array) {
        if (array.length <= 0) return 0;
        int min = array[0];
        for(int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }
}
