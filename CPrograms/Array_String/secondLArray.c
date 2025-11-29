/* Easy: Second largest element in array
*/
#include <stdio.h>
#include <limits.h>

int main(void) {
    int a[] = {5,9,1,3,9,7};
    int n = sizeof(a)/sizeof(a[0]);
    int largest = INT_MIN, second = INT_MIN;
    for (int i = 0; i < n; ++i) {
        if (a[i] > largest) { second = largest; largest = a[i]; }
        else if (a[i] > second && a[i] < largest) second = a[i];
    }
    printf("Largest=%d Second=%d\n", largest, second);
    return 0;
}
