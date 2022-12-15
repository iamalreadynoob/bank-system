package constants;

public class NonNameCharacters
{

    private static final char[] invalidCharactersForName = {'0', '1', '2', '3', '4', '5', '6', '7',
    '8', '9', '!', 'é', '#', '^', '+', '$', '%', '&', '/', '{', '(', '[', ')', '£', ']', '=', '}', '*',
    '?', '-', '|', '_', '<', '>', '.', ':', ',', ';'};

    public char[] getNonNameCharacters()
    {
        return invalidCharactersForName;
    }

}
