package preDetection;

public class NumberDetection
{
    private String onlyNumbers;
    private char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public NumberDetection(String onlyNumbers)
    {
        this.onlyNumbers = onlyNumbers;
    }

    public boolean areNumbers()
    {
        boolean areNumbers = true;

        try
        {

            int total = 0;

            for (int i = 0; i < onlyNumbers.length(); i ++)
            {

                total += Integer.parseInt(Character.toString(onlyNumbers.charAt(i)));

            }

        }
        catch (Exception e) { areNumbers = false; }

        return areNumbers;
    }

    public boolean floatDetection()
    {
        boolean isNumber = true;
        boolean isTherePoint = false;
        boolean isDigit = false;

        for (int i = 0; i < onlyNumbers.length(); i++)
        {
            isDigit = false;

            for(int j = 0; j < digits.length; j++)
            {
                if (onlyNumbers.charAt(i) == digits[j])
                {
                    isDigit = true;
                    break;
                }
            }

            if (!isDigit)
            {
                if (onlyNumbers.charAt(i) == '.')
                {
                    if (!isTherePoint)
                    {
                        isTherePoint = true;
                    }

                    else
                    {
                        isNumber = false;
                        break;
                    }
                }
                else
                {
                    isNumber = false;
                    break;
                }
            }

        }

        return isNumber;
    }
}
