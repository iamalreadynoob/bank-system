#include <stdio.h>
#include "announcement.h"
#include "identify.h"
#include "buttonPanel.h"
#include <stdbool.h>
#include <stdlib.h>

int main()
{
    int functionID, accountID;

    welcomer();

    accountID = identificationRequest();

    if(accountID != 0)
    {

    do
    {

    functionsPresentation();

    scanf("%i", &functionID);

    buttonPanel(functionID, accountID);


    }while(functionID != 8);

    }

    return 0;
}
