#include <iostream>
#include <vector>
using namespace std;

/**
 * D题问题1 - 数组求和
 * Array Sum Solution
 */
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