package detection;

import commonTools.Detection;
import commonTools.IDetection;
import preDetection.NumberDetection;

public class CreditScoreDetection extends Detection implements IDetection
{

    private String creditScore;
    private static String errorMessage;

    protected CreditScoreDetection(String creditScore)
    {
        super(errorMessage);

        this.creditScore = creditScore;
    }

    public boolean isValid()
    {
        boolean isValid = true;

        if (creditScore.length() != 3)
        {
            isValid = false;
            setErrorMessage("Credit Score is out of size");
        }

        if (isValid)
        {
            NumberDetection numberDetection = new NumberDetection(creditScore);

            if (!numberDetection.areNumbers())
            {
                isValid = false;
                setErrorMessage("Credit Score has invalid digit");
            }

        }

        return isValid;
    }

}
