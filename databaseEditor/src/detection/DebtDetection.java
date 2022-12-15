package detection;

import commonTools.Detection;
import commonTools.IDetection;
import preDetection.NumberDetection;

public class DebtDetection extends Detection implements IDetection
{

    private String debt;
    private static String errorMessage;

    protected DebtDetection(String debt)
    {
        super(errorMessage);
        this.debt = debt;
    }

    public boolean isValid()
    {
        NumberDetection numberDetection = new NumberDetection(debt);

        boolean isValid = numberDetection.floatDetection();

        if(!isValid) setErrorMessage("Debt has invalid character");

        return isValid;
    }

}
