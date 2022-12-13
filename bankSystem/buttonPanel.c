#include <stdio.h>
#include "functionality.h"

void buttonPanel(int functionID, int accountID)
{

    switch(functionID)
    {

        case 0:  checkBalance(accountID); break;
        case 1:  withdraw(accountID); break;
        case 2:  cashDeposits(accountID); break;
        case 3:  transfer(accountID); break;
        case 4:  debtOffering(accountID); break;
        case 5:  payBack(accountID); break;
        case 6:  changePIN(accountID); break;
        case 7:  showUserData(accountID); break;
        case 8:  printf("bye bye...\n"); break;
        default: printf("please select a valid function...\n"); break;

    }

}
