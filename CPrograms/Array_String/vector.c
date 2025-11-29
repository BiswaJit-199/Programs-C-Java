/* Advanced: Dynamic vector (resizable array) implementation
*/
#include <stdio.h>
#include <stdlib.h>

typedef struct { int *data; size_t size, cap; } ivector;

void iv_init(ivector *v) { v->size = 0; v->cap = 4; v->data = malloc(v->cap * sizeof(int)); }
void iv_push(ivector *v, int x) { if (v->size == v->cap) { v->cap *= 2; v->data = realloc(v->data, v->cap * sizeof(int)); } v->data[v->size++] = x; }
void iv_free(ivector *v) { free(v->data); v->data = NULL; v->size = v->cap = 0; }

int main(void) {
    ivector v; iv_init(&v);
    for (int i = 1; i <= 10; ++i) iv_push(&v, i*i);
    for (size_t i = 0; i < v.size; ++i) printf("%d ", v.data[i]); printf("\n");
    iv_free(&v);
    return 0;
}
