/* Medium: Binary search (array must be sorted)
*/
#include <stdio.h>

int binary_search(int a[], int n, int key) {
    int lo = 0, hi = n - 1;
    while (lo <= hi) {
        int mid = (lo + hi) / 2;
        if (a[mid] == key) return mid;
        else if (a[mid] < key) lo = mid + 1;
        else hi = mid - 1;
    }
    return -1;
}

int main(void) {
    int a[] = {1,3,5,7,9,11};
    int key = 11;
    int idx = binary_search(a, sizeof(a)/sizeof(a[0]), key);
    printf("Key %d %s at index %d\n", key, idx==-1?"not found":"found", idx);
    return 0;
}
