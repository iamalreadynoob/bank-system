package mainPackage;

import javax.swing.JFrame;

public class Add
{

    protected Add(JFrame frame)
    {

        frame.add(Screen.cardNumberTitle);
        frame.add(Screen.pinTitle);
        frame.add(Screen.ibanTitle);
        frame.add(Screen.firstNameTitle);
        frame.add(Screen.lastNameTitle);
        frame.add(Screen.genderTitle);
        frame.add(Screen.balanceTitle);
        frame.add(Screen.creditScoreTitle);
        frame.add(Screen.debtTitle);

        frame.add(Screen.cardNumberText);
        frame.add(Screen.pinText);
        frame.add(Screen.ibanText);
        frame.add(Screen.firstNameText);
        frame.add(Screen.lastNameText);
        frame.add(Screen.genderText);
        frame.add(Screen.balanceText);
        frame.add(Screen.creditScoreText);
        frame.add(Screen.debtText);

        frame.add(Screen.announcement);

        frame.add(Screen.addAccount);
    }

}
