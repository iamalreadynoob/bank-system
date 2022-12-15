package detection;

import commonTools.Detection;
import commonTools.IDetection;
import constants.NamePlacement;
import preDetection.WordDetection;

public class NameDetection extends Detection implements IDetection
{

    private String name;
    private NamePlacement placement;
    private static String errorMessage;

    protected NameDetection(String name, NamePlacement placement)
    {
        super(errorMessage);

        this.name = name;
        this.placement = placement;
    }

    public boolean isValid()
    {
        boolean isValid;

        WordDetection wordDetection = new WordDetection(name);

        isValid = wordDetection.isName();

        if (!isValid)
        {
            switch (placement)
            {
                case FIRST:
                    setErrorMessage("First name has invalid character");
                    break;
                case LAST:
                    setErrorMessage("Last name has invalid character");
                    break;
            }
        }

        return isValid;
    }

}
