#include <stdio.h>
#include "databaseConnectivity.h"

#define MAX_MONEY_ON_ACCOUNT 100000

void checkBalance(int accountID);
void withdraw(int accountID);
void cashDeposits(int accountID);
void transfer(int accountID);
void debtOffering(int accountID);
void payBack(int accountID);
void changePIN(int accountID);
void showUserData(int accountID);
