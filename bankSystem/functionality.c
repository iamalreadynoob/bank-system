#include <stdio.h>
#include <stdbool.h>
#include "databaseConnectivity.h"

#define MAX_MONEY_ON_ACCOUNT 100000

void checkBalance(int accountID)
{
    char *balance;
    balance = read(accountID * 9 + 7, 10);

    printf("balance (dollars): %s\n", balance);

}

void withdraw(int accountID)
{

    char *balance, sRequested[10];
    float fBalance, fRequested;

    printf("how much money do you want? ");
    scanf("%s", sRequested);

    balance = read(accountID * 9 + 7, 10);
    fBalance = atof(balance);
    fRequested = atof(sRequested);

    if(fRequested <= fBalance && fRequested > 0)
    {

        fBalance -= fRequested;

        char currentMoney[sizeof fBalance];
        gcvt(fBalance, sizeof fBalance, currentMoney);
        printf("balance: %s\n", currentMoney);
        write(accountID * 9 + 7, currentMoney);

    }
    else printf("you do not have money as you want...\n");

}

void cashDeposits(int accountID)
{

    char *sBalance, sIncome[5];
    float fBalance, fIncome;

    printf("how much money do you have? ");
    scanf("%s", sIncome);

    sBalance = read(accountID * 9 + 7, 10);
    fBalance = atof(sBalance);
    fIncome = atof(sIncome);

    if(fBalance + fIncome <= MAX_MONEY_ON_ACCOUNT && fIncome > 0)
    {

        fBalance += fIncome;

        char currentMoney[sizeof fBalance];
        gcvt(fBalance, sizeof fBalance, currentMoney);
        printf("balance: %s\n", currentMoney);
        write(accountID * 9 + 7, currentMoney);

    }
    else printf("you cannot store this money on your bank account...");

}

void transfer(int accountID)
{
    int sentAccountID;
    char sentIban[31];

    printf("what IBAN do you want to send your money? ");
    scanf("%s", sentIban);

    FILE *database;

    database = fopen("database.txt", "r");

    if(database != NULL)
    {
        char buffer[31];
        int currentLine = 0;
        bool isFinished = false;

        do
        {

        fgets(buffer, sizeof buffer, database);

        if(currentLine >= 9 && currentLine % 9 == 2)
        {
            bool areTheySame = true;

            for(int i = 0; i < 29; i++)
            {

                if(buffer[i] != sentIban[i]) areTheySame = false;

            }


            if(areTheySame)
            {

                char sSentMoney[10], *sExistMoney, *currentMoney, *sReceiverBalance, *receiverCurrentMoney;
                float fSentMoney, fExistMoney, fReceiverBalance;

                isFinished = true;
                sentAccountID = currentLine / 9;

                printf("how much money do you want to send? ");
                scanf("%s", sSentMoney);

                fSentMoney = atof(sSentMoney);
                sExistMoney = read(accountID * 9 + 7, 10);
                currentMoney = sExistMoney;
                fExistMoney = atof(sExistMoney);

                if(fExistMoney >= fSentMoney)
                {

                    fExistMoney -= fSentMoney;
                    gcvt(fExistMoney, sizeof fExistMoney, currentMoney);
                    write(accountID * 9 + 7, currentMoney);

                    sReceiverBalance = read(sentAccountID * 9 + 7, 10);
                    receiverCurrentMoney = sReceiverBalance;
                    fReceiverBalance = atof(sReceiverBalance);
                    fReceiverBalance += fSentMoney;
                    gcvt(fReceiverBalance, sizeof fReceiverBalance, receiverCurrentMoney);
                    write(sentAccountID * 9 + 7, receiverCurrentMoney);

                    printf("money transfer has been completed successfully...\n");

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

    else printf("IBAN is not right...\n");

}

void debtOffering(int accountID)
{
    char *score;
    score = read(accountID * 9 + 8, 3);

    printf("your credit score is: %s\nto get much more information please go to any SIGMA BANK branches\n", score);

}

void payBack(int accountID)
{
    char *sDebt;
    float fDebt;
    int payBackAnswer;

    sDebt = read(accountID * 9 + 9, 10);
    fDebt = atof(sDebt);

    printf("you need to pay this money (dollars): %s\nwould you like to pay back?[1/0] ", sDebt);
    scanf("%i", &payBackAnswer);

    if(payBackAnswer == 1)
    {
        char sMoney[7], *sBalance;
        float fMoney, fBalance;

        printf("how much money will you pay back? ");
        scanf("%s", sMoney);

        fMoney = atof(sMoney);

        sBalance = read(accountID * 9 + 7, 10);
        fBalance = atof(sBalance);

        if(fMoney <= fBalance && fMoney > 0 && fMoney <= fDebt)
        {

            fBalance -= fMoney;
            fDebt -= fMoney;

            char newBalance[sizeof fBalance], newDebt[sizeof fDebt];

            gcvt(fBalance, sizeof fBalance, newBalance);
            gcvt(fDebt, sizeof fDebt, newDebt);

            write(accountID * 9 + 7, newBalance);
            write(accountID * 9 + 9, newDebt);

            printf("current balance: %s\ncurrent debt: %s\n", newBalance, newDebt);

        }

        else printf("this is not possible...\n");
    }

}

void changePIN(int accountID)
{

    char *existPIN, newPIN[5];
    int tryChance = 3;
    bool isAccessSafe = true;

    existPIN = read(accountID * 9 + 2, 4);

    while(tryChance != 0)
    {

        printf("Before changing, please enter your PIN that already exist: ");
        scanf("%s", newPIN);

        for(int i = 0; i < 4; i++) if(existPIN[i] != newPIN[i]) {isAccessSafe = false; break;}

        if(isAccessSafe) break;
        else
        {

            tryChance--;
            if(tryChance != 0) isAccessSafe = true;
            printf("wrong PIN, please try once again... you have still %i try chance...\n", tryChance);

        }
    }

    if(isAccessSafe)
    {

        printf("please choose your new PIN: ");
        scanf("%s", newPIN);

        int pin = atoi(newPIN);

        if(pin <= 9999 && pin >= 1000)
        {

            printf("your PIN has been changed successfully!\n");
            write(accountID * 9 + 2, newPIN);

        }

        else printf("you have tried to define an unvalid PIN\n");

    }
    else printf("you do not have permission to change your PIN right now...\n");

}

void showUserData(int accountID)
{

    char *firstName, *lastName, *gender, *iban;

    firstName = read(accountID * 9 + 4, 30);
    lastName = read(accountID * 9 + 5, 30);
    gender = read(accountID * 9 + 6, 6);
    iban = read(accountID * 9 + 3, 30);

    printf("\nfirst name: %s\nlast name: %s\ngender: %s\nIBAN: %s\n", firstName, lastName, gender, iban);

}
