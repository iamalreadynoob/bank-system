package constants;

public class GenderTypes
{

    private String[] genderTypes = {"Female", "Male", "Non-Binary"};

    public boolean isGender(String gender)
    {
        boolean isGender = false;

        for (int i = 0; i < genderTypes.length; i++)
        {
            if (gender.equals(genderTypes[i]))
            {
                isGender = true;
                break;
            }
        }

        return isGender;
    }

}
