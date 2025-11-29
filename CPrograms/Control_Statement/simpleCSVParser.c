/* Advanced: Simple CSV parser using a finite-state approach (handles quoted fields)
*/
#include <stdio.h>
#include <string.h>

#define MAXF 64

void parse_csv_line(const char *line) {
    char field[MAXF]; int fi = 0;
    int in_quotes = 0;
    for (size_t i = 0; i <= strlen(line); ++i) {
        char c = line[i];
        if (in_quotes) {
            if (c == '"') {
                if (line[i+1] == '"') { field[fi++] = '"'; ++i; }
                else in_quotes = 0;
            } else if (c == '\0' || fi >= MAXF-1) break;
            else field[fi++] = c;
        } else {
            if (c == '"') in_quotes = 1;
            else if (c == ',' || c == '\0' || c == '\n') {
                field[fi] = '\0';
                printf("[%s] ", field);
                fi = 0;
            } else {
                if (fi < MAXF-1) field[fi++] = c;
            }
        }
    }
    printf("\n");
}

int main(void) {
    char buf[512];
    printf("Enter CSV line: \n");
    if (fgets(buf, sizeof(buf), stdin)) parse_csv_line(buf);
    return 0;
}
