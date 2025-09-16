# D题问题1 答案 (Solution)

## Python Solution / Python解决方案

```python
# 读取数组长度
n = int(input())

# 读取数组元素
arr = list(map(int, input().split()))

# 计算数组元素的和
total_sum = sum(arr)

# 输出结果
print(total_sum)
```

## Alternative Python Solution / 替代Python解决方案

```python
# 读取数组长度
n = int(input())

# 读取数组元素
arr = list(map(int, input().split()))

# 使用循环计算和
total_sum = 0
for num in arr:
    total_sum += num

# 输出结果
print(total_sum)
```

## Java Solution / Java解决方案

```java
import java.util.Scanner;

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
```

## C++ Solution / C++解决方案

```cpp
#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n;
    cin >> n;
    
    vector<int> arr(n);
    int sum = 0;
    
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
        sum += arr[i];
    }
    
    cout << sum << endl;
    
    return 0;
}
```

## Algorithm Explanation / 算法说明

这个问题的解决方案非常直接：
1. 读取数组的长度 n
2. 读取数组的 n 个元素
3. 遍历数组，将所有元素相加
4. 输出总和

The solution to this problem is very straightforward:
1. Read the length n of the array
2. Read the n elements of the array  
3. Iterate through the array and sum all elements
4. Output the total sum

## Time Complexity / 时间复杂度
O(n) - 需要遍历数组一次

O(n) - Need to traverse the array once

## Space Complexity / 空间复杂度  
O(n) - 需要存储数组元素

O(n) - Need to store the array elements