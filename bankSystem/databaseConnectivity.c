#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

#define MAX_CHAR_PER_LINE 31

char* read(int requestedLine, int requestedDataSize)
{
    char *requestedData = malloc(requestedDataSize + 1);

    FILE *database;

    database = fopen("database.txt", "r");

    if(database != NULL)
    {
        char buffer[MAX_CHAR_PER_LINE];

        for(int i = 0; i < requestedLine; i++) fgets(buffer, sizeof buffer, database);

        for(int i = 0; i < requestedDataSize; i++) requestedData[i] = buffer[i];


    }


    return requestedData;
}

void write(int changedLine, char newData[])
{

    FILE *database, *temporary;

    database = fopen("database.txt", "r");
    temporary = fopen("temporary.txt", "w");

    if(database != NULL && temporary != NULL)
    {
        char buffer[MAX_CHAR_PER_LINE];
        int count = 0;

        while(fgets(buffer, sizeof buffer, database) != NULL)
        {
            count++;

            if(count == changedLine) fprintf(temporary, "%s\n", newData);
            else fputs(buffer, temporary);

        }

        fclose(database); fclose(temporary);
        remove("database.txt"); rename("temporary.txt", "database.txt");

    }



}
