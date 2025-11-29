/* Advanced: KMP (Knuth-Morris-Pratt) string matching
*/
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void build_lps(const char *pat, int m, int *lps) {
    int len = 0; lps[0] = 0; int i = 1;
    while (i < m) {
        if (pat[i] == pat[len]) { lps[i++] = ++len; }
        else if (len != 0) len = lps[len-1];
        else lps[i++] = 0;
    }
}

int kmp_search(const char *txt, const char *pat) {
    int n = strlen(txt), m = strlen(pat);
    if (m == 0) return 0;
    int *lps = malloc(m * sizeof(int));
    build_lps(pat, m, lps);
    int i = 0, j = 0;
    while (i < n) {
        if (pat[j] == txt[i]) { ++i; ++j; if (j == m) { free(lps); return i-j; } }
        else if (j != 0) j = lps[j-1]; else ++i;
    }
    free(lps); return -1;
}

int main(void) {
    char txt[512], pat[256];
    printf("Text: "); fgets(txt, sizeof(txt), stdin); if (txt[strlen(txt)-1]=='\n') txt[strlen(txt)-1]='\0';
    printf("Pattern: "); fgets(pat, sizeof(pat), stdin); if (pat[strlen(pat)-1]=='\n') pat[strlen(pat)-1]='\0';
    printf("Index = %d\n", kmp_search(txt, pat));
    return 0;
}
