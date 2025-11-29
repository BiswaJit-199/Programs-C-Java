/* Medium 2: Simple interactive calculator using switch (control flows + tokens)
*/
#include <stdio.h>

int main(void) {
    double x, y; char op;
    printf("Enter expression (e.g. 3.5 + 4.2): ");
    if (scanf("%lf %c %lf", &x, &op, &y) == 3) {
        switch (op) {
            case '+': printf("Result = %g\n", x + y); break;
            case '-': printf("Result = %g\n", x - y); break;
            case '*': printf("Result = %g\n", x * y); break;
            case '/': if (y != 0) printf("Result = %g\n", x / y); else printf("Divide by zero\n"); break;
            default: printf("Unknown operator '%c'\n", op);
        }
    }
    return 0;
}
