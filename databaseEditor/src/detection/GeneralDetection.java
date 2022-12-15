package detection;

import commonTools.Detection;
import constants.NamePlacement;

public class GeneralDetection extends Detection
{
    private String cardNumber, pin, iban, firstName, lastName, gender, balance, creditScore, debt;
    private static String errorMessage;

    public GeneralDetection(String cardNumber, String pin, String iban, String firstName,
                            String lastName, String gender, String balance, String creditScore,
                            String debt)
    {
        super(errorMessage);

        this.cardNumber = cardNumber;
        this.pin = pin;
        this.iban = iban;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.balance = balance;
        this.creditScore = creditScore;
        this.debt = debt;
    }

    public boolean isEverythingOkay()
    {
        boolean isEverythingOkay = true;

        CardNumberDetection cardNumberDetection = new CardNumberDetection(cardNumber);
        PinDetection pinDetection = new PinDetection(pin);
        IbanDetection ibanDetection = new IbanDetection(iban);
        NameDetection firstNameDetection = new NameDetection(firstName, NamePlacement.FIRST);
        NameDetection lastNameDetection = new NameDetection(lastName, NamePlacement.LAST);
        GenderDetection genderDetection = new GenderDetection(gender);
        BalanceDetection balanceDetection = new BalanceDetection(balance);
        CreditScoreDetection creditScoreDetection = new CreditScoreDetection(creditScore);
        DebtDetection debtDetection = new DebtDetection(debt);

        if (!cardNumberDetection.isValid())
        {
            isEverythingOkay = false;
            setErrorMessage(cardNumberDetection.getErrorMessage());
        }

        if (!pinDetection.isValid())
        {
            isEverythingOkay = false;
            setErrorMessage(pinDetection.getErrorMessage());
        }

        if (!ibanDetection.isValid())
        {
            isEverythingOkay = false;
            setErrorMessage(ibanDetection.getErrorMessage());
        }

        if (!firstNameDetection.isValid())
        {
            isEverythingOkay = false;
            setErrorMessage(firstNameDetection.getErrorMessage());
        }

        if (!lastNameDetection.isValid())
        {
            isEverythingOkay = false;
            setErrorMessage(lastNameDetection.getErrorMessage());
        }

        if(!genderDetection.isValid())
        {
            isEverythingOkay = false;
            setErrorMessage(genderDetection.getErrorMessage());
        }

        if ((!balanceDetection.isValid()))
        {
            isEverythingOkay = false;
            setErrorMessage(balanceDetection.getErrorMessage());
        }

        if (!creditScoreDetection.isValid())
        {
            isEverythingOkay = false;
            setErrorMessage(creditScoreDetection.getErrorMessage());
        }

        if (!debtDetection.isValid())
        {
            isEverythingOkay = false;
            setErrorMessage(debtDetection.getErrorMessage());
        }

        return  isEverythingOkay;
    }

}
