/* Easy: Max of three numbers using if-else
*/
#include <stdio.h>

int main(void) {
    int a, b, c;
    printf("Enter three integers: ");
    if (scanf("%d %d %d", &a, &b, &c) == 3) {
        int m = a;
        if (b > m) m = b;
        if (c > m) m = c;
        printf("Maximum = %d\n", m);
    }
    return 0;
}
