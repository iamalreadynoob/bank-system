package detection;

import commonTools.Detection;
import commonTools.IDetection;
import constants.IbanCountryCodes;
import preDetection.NumberDetection;

public class IbanDetection extends Detection implements IDetection
{

    private String iban;
    private static String errorMessage;
    protected IbanDetection(String iban)
    {
        super(errorMessage);
        this.iban = iban;
    }

    public boolean isValid()
    {
        boolean isValid = true;

        if(iban.length() != 29)
        {
            isValid = false;
            setErrorMessage("IBAN is out of size");
        }

        else
        {
            String onlyNumbers = null;
            String countryCode = null;

            for (int i = 0; i < 29; i++)
            {
                if(i != 0 && i != 1 && i != 4 && i != 10 && i != 12)
                {
                    if (onlyNumbers == null) onlyNumbers = Character.toString(iban.charAt(i));
                    else onlyNumbers += iban.charAt(i);
                }
            }

            NumberDetection numberDetection = new NumberDetection(onlyNumbers);

            if (!numberDetection.areNumbers())
            {
                isValid = false;
                setErrorMessage("IBAN has invalid digit");
            }

            countryCode = Character.toString(iban.charAt(0)) + Character.toString(iban.charAt(1));
            IbanCountryCodes ibanCountryCodes = new IbanCountryCodes();

            if (!ibanCountryCodes.isIBAN(countryCode))
            {
                isValid = false;
                setErrorMessage("IBAN has invalid country code");
            }

            if (iban.charAt(4) != '-' && iban.charAt(10) != '-' && iban.charAt(12) != '-')
            {
                isValid =false;
                setErrorMessage("IBAN has invalid character");
            }

        }

        return isValid;
    }

}
