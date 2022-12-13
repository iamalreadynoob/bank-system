#include <stdio.h>

void createLine(int length)
{

for(int i = 0; i < length; i++)
{

    printf("*");

}

printf("\n");

}

void welcomer()
{

    createLine(20);

    printf("welcome SIGMA BANK\n");

    createLine(20);

}

void functionsPresentation()
{

    createLine(20);
    printf("Please choose what you want to do:\npress 0 to CHECK BALANCE\npress 1 to WITHDRAW CASH\npress 2 to CASH DEPOSITS\npress 3 to TRANSFER MONEY\npress 4 for DEBT OFFERING\npress 5 to PAY BACK\npress 6 to CHANGE PIN\npress 7 for USER DATA\npress 8 to QUIT\n");

}
