#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

#define MAX_CHAR_PER_LINE 31

char* read(int requestedLine, int requestedDataSize);
void write(int changedLine, char newData[]);

