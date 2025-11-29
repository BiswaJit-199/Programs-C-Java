/* Easy: Print primes up to N
*/
#include <stdio.h>
#include <math.h>

int main(void) {
    int N;
    printf("Enter N: ");
    scanf("%d", &N);
    for(int i = 2; i <= N; i++) {
        int isPrime = 0;
        for(int j = 1; j <= i; j++) {
            if(i % j == 0) {
                isPrime += 1;
            }
        }
        if(isPrime == 2) {
            printf("%d is prime.\n", i);
        }
    }
    return 0;
}
