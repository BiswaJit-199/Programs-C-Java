/* Advanced 1: Simple tokenizer - reads a line and prints tokens (identifier, number, operator)
   Demonstrates lexical tokenization useful for compilers or static analysis.
*/
#include <stdio.h>
#include <ctype.h>
#include <string.h>

void print_token(const char *s, size_t len) {
    char buf[128];
    size_t n = len < sizeof(buf)-1 ? len : sizeof(buf)-1;
    memcpy(buf, s, n);
    buf[n] = '\0';

    /* simple classification */
    int is_num = 1, is_ident = 1;
    for (size_t i = 0; i < n; ++i) {
        if (!isdigit((unsigned char)buf[i])) is_num = 0;
        if (!(isalnum((unsigned char)buf[i]) || buf[i] == '_')) is_ident = 0;
    }
    if (is_num) printf("NUMBER(%s) ", buf);
    else if (is_ident && isalpha((unsigned char)buf[0])) printf("IDENT(%s) ", buf);
    else printf("SYMBOL(%s) ", buf);
}

int main(void) {
    char line[512];
    printf("Enter a line to tokenize: \n");
    if (!fgets(line, sizeof(line), stdin)) return 0;
    size_t i = 0, L = strlen(line);
    while (i < L) {
        if (isspace((unsigned char)line[i])) { ++i; continue; }
        if (isalpha((unsigned char)line[i]) || line[i] == '_') {
            size_t j = i+1; while (j < L && (isalnum((unsigned char)line[j]) || line[j]=='_')) ++j;
            print_token(line + i, j - i); i = j; continue;
        }
        if (isdigit((unsigned char)line[i])) {
            size_t j = i+1; while (j < L && isdigit((unsigned char)line[j])) ++j;
            print_token(line + i, j - i); i = j; continue;
        }
        /* operator/symbol */
        print_token(line + i, 1); ++i;
    }
    printf("\n");
    return 0;
}
