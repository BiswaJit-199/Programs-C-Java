/* Advanced 2: Command-line flag parser (simple) - supports -i <file> -o <file> -v
   Modern job skill: handling CLI args and options
*/
#include <stdio.h>
#include <string.h>

int main(int argc, char **argv) {
    const char *input = NULL, *output = NULL;
    int verbose = 0;
    for (int i = 1; i < argc; ++i) {
        if (strcmp(argv[i], "-i") == 0 && i+1 < argc) { input = argv[++i]; }
        else if (strcmp(argv[i], "-o") == 0 && i+1 < argc) { output = argv[++i]; }
        else if (strcmp(argv[i], "-v") == 0) { verbose = 1; }
        else { printf("Unknown arg: %s\n", argv[i]); }
    }
    printf("Input: %s\nOutput: %s\nVerbose: %d\n", input ? input : "(none)", output ? output : "(none)", verbose);
    return 0;
}
