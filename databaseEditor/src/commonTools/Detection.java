package commonTools;

public abstract class Detection
{

    private String errorMessage;

    public Detection(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }
    public void setErrorMessage(String message)
    {
        if(errorMessage == null) errorMessage = message;
        else errorMessage = errorMessage + ", " + message;
    }

    public String getErrorMessage()
    {
        return  errorMessage;
    }

}
