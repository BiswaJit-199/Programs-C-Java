/* Medium: Menu-driven array operations: insert, delete, display
*/
#include <stdio.h>
#include <stdlib.h>

int main(void) {
    int n = 0, cap = 10;
    int *arr = malloc(cap * sizeof(int));
    int choice;
    do {
        printf("1:Insert\n2:Delete\n3:Display\n0:Exit\nChoice: ");
        if (scanf("%d", &choice) != 1) break;
        if (choice == 1) {
            int v; printf("Val: "); if (scanf("%d", &v) == 1) {
                if (n == cap) { cap *= 2; arr = realloc(arr, cap * sizeof(int)); }
                arr[n++] = v;
            }
        } else if (choice == 2) {
            if (n > 0) { --n; printf("Deleted last element\n"); } else printf("Empty\n");
        } else if (choice == 3) {
            for (int i = 0; i < n; ++i) printf("%d ", arr[i]); printf("\n\n");
        }
    } while (choice != 0);
    free(arr);
    return 0;
}
