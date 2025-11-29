/* Easy: Reverse a string in-place
*/
#include <stdio.h>
#include <string.h>

int main(void) {
    char s[256];
    printf("Enter a string: ");
    if (!fgets(s, sizeof(s), stdin)) return 0;
    size_t n = strlen(s); if (n && s[n-1] == '\n') s[--n] = '\0';
    for (size_t i = 0; i < n/2; ++i) { char t = s[i]; s[i] = s[n-1-i]; s[n-1-i] = t; }
    printf("Reversed: %s\n", s);
    return 0;
}
