#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

int identificationRequest()
{
    char cardNumber[31];
    int returnValue = 0;
    printf("Please tell us your card number: ");
    scanf("%s", cardNumber);

    FILE *database;

    database = fopen("database.txt", "r");

    if(database != NULL)
    {
        char buffer[31];
        int currentLine = 0;
        char pinNumber[5];
        bool isFinished = false;

        do
        {

        fgets(buffer, sizeof buffer, database);

        if(currentLine >= 9 && currentLine % 9 == 0)
        {
            bool areTheySame = true;

            for(int i = 0; i < 19; i++)
            {

                if(buffer[i] != cardNumber[i]) areTheySame = false;

            }


            if(areTheySame)
            {

                printf("Please tell us your pin: ");
                scanf("%s", pinNumber);
                fgets(buffer, sizeof buffer, database);

                for(int i = 0; i < 4; i++)
                {
                    if(buffer[i] != pinNumber[i]) areTheySame = false;
                }

                if(areTheySame)
                {
                    isFinished = true;
                    returnValue = currentLine / 9;
                }

            }


        }

        else if(feof(database))
        {
            isFinished = true;
        }

        currentLine++;


        }while(!isFinished);

    }

    else printf("Database is unaccessable right now");

    fclose(database);

    return returnValue;
}
