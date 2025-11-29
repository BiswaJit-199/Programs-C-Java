/// Easy 1: Hello + read name + demonstrate tokens (keywords, identifiers, constants)
#include <stdio.h>

int main(void) {
    const int VERSION = 1; /* constant token */
    char name[64]; /* identifier + keyword */
    printf("C Basics demo (v%d)\nEnter your name: ", VERSION);
    if (fgets(name, sizeof(name), stdin)) {
        /* remove trailing newline */
        for (int i = 0; name[i]; ++i) if (name[i] == '\n') { name[i] = '\0'; break; }
        printf("Hello, %s!\n", name);
    }
    return 0;
}
