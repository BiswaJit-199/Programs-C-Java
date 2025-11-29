/* Easy 2: Sum of two integers (shows tokens: literals, operators)
*/
#include <stdio.h>

int main(void) {
    int a, b;
    printf("Enter two integers: ");
    if (scanf("%d %d", &a, &b) == 2) {
        printf("%d + %d = %d\n", a, b, a + b);
    }
    return 0;
}
