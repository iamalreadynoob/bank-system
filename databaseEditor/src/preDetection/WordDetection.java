package preDetection;

import constants.NonNameCharacters;

public class WordDetection
{

    private String word;

    public WordDetection(String word)
    {
        this.word = word;
    }

    public boolean isName()
    {
        boolean isName = true;
        NonNameCharacters nonNameCharacters = new NonNameCharacters();

        for (int i = 0; i < word.length(); i++)
        {
            for (int j = 0; j < nonNameCharacters.getNonNameCharacters().length; j++)
            {

                if (word.charAt(i) == nonNameCharacters.getNonNameCharacters()[j])
                {
                    isName = false;
                    break;
                }

            }

            if(!isName) break;
        }

        return isName;
    }

}
