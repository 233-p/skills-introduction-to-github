import java.util.Scanner;

/**
 * D题问题1 - 数组求和
 * Array Sum Solution
 */
public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 读取数组长度
        int n = scanner.nextInt();
        
        // 读取数组元素并计算和
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }
        
        // 输出结果
        System.out.println(sum);
        
        scanner.close();
    }
}