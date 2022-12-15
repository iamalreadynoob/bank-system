package mainPackage;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;


public class CreateNew
{
    protected CreateNew()
    {

        Screen.cardNumberTitle = new JTextField();
        Screen.pinTitle = new JTextField();
        Screen.ibanTitle = new JTextField();
        Screen.firstNameTitle = new JTextField();
        Screen.lastNameTitle = new JTextField();
        Screen.genderTitle = new JTextField();
        Screen.balanceTitle = new JTextField();
        Screen.creditScoreTitle = new JTextField();
        Screen.debtTitle = new JTextField();

        Screen.cardNumberText = new JTextField();
        Screen.pinText = new JTextField();
        Screen.ibanText = new JTextField();
        Screen.firstNameText = new JTextField();
        Screen.lastNameText = new JTextField();
        Screen.genderText = new JTextField();
        Screen.balanceText = new JTextField();
        Screen.creditScoreText = new JTextField();
        Screen.debtText = new JTextField();

        Screen.announcement = new JTextArea();

        Screen.addAccount = new JButton();

    }
}
