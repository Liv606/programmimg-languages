#include <stdlib.h>
#include <string.h>
#include <stdio.h>

void main() {
    char pal[1000];
    memset(pal, 0, 1000);
    pal[0] = 'H';
    pal[1] = 'e';
    pal[2] = 'l';
    pal[3] = 'l';
    pal[4] = 'o';
    printf("%u\n", sizeof(pal));
    printf("%s\n", pal);
    printf("%c\n", pal[1]);

}
