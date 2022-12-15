package detection;

import commonTools.Detection;
import commonTools.IDetection;
import preDetection.NumberDetection;

public class BalanceDetection extends Detection implements IDetection
{

    private String balance;
    private static String errorMessage;

    protected BalanceDetection(String balance)
    {
        super(errorMessage);
        this.balance = balance;
    }

    public boolean isValid()
    {
        NumberDetection numberDetection = new NumberDetection(balance);

        boolean isValid = numberDetection.floatDetection();

        if(!isValid) setErrorMessage("Balance has invalid character");

        return isValid;
    }

}
