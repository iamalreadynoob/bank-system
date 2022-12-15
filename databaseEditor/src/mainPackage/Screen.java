package mainPackage;

import javax.swing.*;

public class Screen extends JFrame
{

    protected static JTextField cardNumberTitle, pinTitle, ibanTitle, firstNameTitle, lastNameTitle,
            genderTitle, balanceTitle, creditScoreTitle, debtTitle, cardNumberText, pinText, ibanText,
            firstNameText, lastNameText, genderText, balanceText, creditScoreText, debtText;
    protected static JTextArea announcement;
    protected static JButton addAccount;

    protected Screen()
    {
        this.setSize(600, 700);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("Database Editor");

        new CreateNew();
        new Add(this);
        new Positions();
        new Buttons();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
