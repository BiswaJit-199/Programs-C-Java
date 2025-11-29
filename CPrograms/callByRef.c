/* Medium 1: Swap two numbers using a function (pass-by-value vs pass-by-reference)
*/
#include <stdio.h>

void swap(int *x, int *y) {
    int tmp = *x;
    *x = *y;
    *y = tmp;
}

int main(void) {
    int a = 5, b = 10;
    printf("Before swap: a=%d b=%d\n", a, b);
    swap(&a, &b);
    printf("After swap:  a=%d b=%d\n", a, b);
    return 0;
}
