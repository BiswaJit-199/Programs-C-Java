/* Advanced: Quicksort (recursive)
*/
#include <stdio.h>

void quicksort(int a[], int l, int r) {
    if (l >= r) return;
    int pivot = a[(l + r) / 2];
    int i = l, j = r;
    while (i <= j) {
        while (a[i] < pivot) i++;
        while (a[j] > pivot) j--;
        if (i <= j) { int t = a[i]; a[i] = a[j]; a[j] = t; i++; j--; }
    }
    if (l < j) quicksort(a, l, j);
    if (i < r) quicksort(a, i, r);
}

int main(void) {
    int a[] = {9,4,7,3,2,8,5,1,6};
    int n = sizeof(a)/sizeof(a[0]);
    quicksort(a, 0, n-1);
    for (int i = 0; i < n; ++i) printf("%d ", a[i]); printf("\n");
    return 0;
}
