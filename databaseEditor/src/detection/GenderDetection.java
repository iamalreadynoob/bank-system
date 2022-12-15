package detection;

import commonTools.Detection;
import commonTools.IDetection;
import constants.GenderTypes;

public class GenderDetection extends Detection implements IDetection
{

    private String gender;
    private static String errorMessage;

    protected GenderDetection(String gender)
    {
        super(errorMessage);
        this.gender = gender;
    }

    public boolean isValid()
    {
        GenderTypes genderTypes = new GenderTypes();

        boolean isValid = genderTypes.isGender(gender);

        if (!isValid) setErrorMessage("Gender type is invalid");

        return isValid;
    }

}
