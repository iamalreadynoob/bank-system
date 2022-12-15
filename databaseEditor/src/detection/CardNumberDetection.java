package detection;

import commonTools.Detection;
import commonTools.IDetection;
import preDetection.NumberDetection;

public class CardNumberDetection extends Detection implements IDetection
{

    private String cardNumber;
    private static String errorMessage;

    protected CardNumberDetection(String cardNumber)
    {
        super(errorMessage);
        this.cardNumber = cardNumber;
    }

    public boolean isValid()
    {
        boolean isValid = true;
        String onlyNumbers = null;

        if (cardNumber.length() != 19)
        {
            isValid = false;
            setErrorMessage("Card Number is out of size");
        }

        else
        {
            for (int i = 0; i < 19; i++)
            {
                if ((i + 5) % 5 != 4)
                {
                    if (onlyNumbers == null) onlyNumbers = Character.toString(cardNumber.charAt(i));
                    else onlyNumbers += cardNumber.charAt(i);
                }
            }


            NumberDetection numDetect = new NumberDetection(onlyNumbers);
            if (!numDetect.areNumbers())
            {
                isValid = false;
                setErrorMessage("Card Number has invalid digits");
            }

            for (int i = 0; i < 19; i++)
            {
                if ((i + 5) % 5 == 4)
                {
                    if (cardNumber.charAt(i) != '-')
                    {
                        isValid = false;
                        setErrorMessage("Card Number has invalid character");
                        break;
                    }
                }
            }

        }

        return  isValid;
    }

}
