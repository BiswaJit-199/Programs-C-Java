/* Medium: Naive substring search (find first occurrence)
*/
#include <stdio.h>
#include <string.h>

int find_sub(const char *text, const char *pat) {
    size_t n = strlen(text), m = strlen(pat);
    for (size_t i = 0; i + m <= n; ++i) {
        size_t j; for (j = 0; j < m; ++j) if (text[i+j] != pat[j]) break;
        if (j == m) return (int)i;
    }
    return -1;
}

int main(void) {
    char t[256], p[256];
    printf("Text: "); fgets(t, sizeof(t), stdin); if (t[strlen(t)-1]=='\n') t[strlen(t)-1]='\0';
    printf("Pattern: "); fgets(p, sizeof(p), stdin); if (p[strlen(p)-1]=='\n') p[strlen(p)-1]='\0';
    int idx = find_sub(t, p);
    printf("Index = %d\n", idx);
    return 0;
}
