package daily;
/*
请写出一个高效的在m*n矩阵中判断目标值是否存在的算法，矩阵具有如下特征：
每一行的数字都从左到右排序
每一行的第一个数字都比上一行最后一个数字大
例如：
对于下面的矩阵：
[
    [1,   3,  5,  9],
    [10, 11, 12, 30],
    [230, 300, 350, 500]
]
要搜索的目标值为3，返回true；
 */
public class demo27 {    /**
 *
 * @param matrix int整型二维数组
 * @param target int整型
 * @return bool布尔型
 */
public boolean searchMatrix (int[][] matrix, int target) {
    // write code here
    if (matrix.length == 0) return false;
    // write code here
    int m = matrix.length;
    int n = matrix[0].length;
    for (int i = 0;i < m; i++) {
        if (target == matrix[i][n - 1]) {
            return true;
        } else if (target > matrix[i][n - 1]) {
          continue;
        } else if (target < matrix[i][n - 1]) {
            for (int j = n - 1;j >= 0;j--) {
                if (target == matrix[i][j]) return true;
            }
        }
    }
//
//    int m = matrix.length;
//    int n = matrix[0].length;
//    int i = 0, j = n - 1;
//    while (i < m && j >= 0) {
//        if (matrix[i][j] == target) {
//            return true;
//        } else if (matrix[i][j] > target) {
//            j--;
//        } else {
//            i++;
//        }
//    }
    return false;
}

}
