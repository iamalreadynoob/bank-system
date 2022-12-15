package detection;

import commonTools.Detection;
import commonTools.IDetection;
import preDetection.NumberDetection;

public class PinDetection extends Detection implements IDetection
{

    private String pin;
    private static String errorMessage;

    protected PinDetection(String pin)
    {
        super(errorMessage);
        this.pin = pin;
    }

    public boolean isValid()
    {
        boolean isPinValid = true;

        if (pin.length() != 4)
        {
            isPinValid = false;
            setErrorMessage("Pin is out of size");
        }
        else
        {
            NumberDetection numberDetection = new NumberDetection(pin);
            if (!numberDetection.areNumbers())
            {
                isPinValid = false;
                setErrorMessage("Pin has invalid digit");
            }
        }

        return isPinValid;
    }

}
