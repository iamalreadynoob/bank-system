package mainPackage;

import database.DatabaseConnectivity;
import detection.GeneralDetection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons
{

    public Buttons()
    {

        Screen.addAccount.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                GeneralDetection detect = new GeneralDetection(Screen.cardNumberText.getText(),
                        Screen.pinText.getText(), Screen.ibanText.getText(),
                        Screen.firstNameText.getText(), Screen.lastNameText.getText(),
                        Screen.genderText.getText(), Screen.balanceText.getText(),
                        Screen.creditScoreText.getText(), Screen.debtText.getText());

                if(detect.isEverythingOkay())
                {
                    DatabaseConnectivity databaseConnectivity = new DatabaseConnectivity(
                            Screen.cardNumberText.getText(), Screen.pinText.getText(),
                            Screen.ibanText.getText(), Screen.firstNameText.getText(),
                            Screen.lastNameText.getText(), Screen.genderText.getText(),
                            Screen.balanceText.getText(), Screen.creditScoreText.getText(),
                            Screen.debtText.getText());

                    databaseConnectivity.appendDatabase();

                    Screen.announcement.setText("Successfully saved!");

                    Screen.cardNumberText.setText(null);
                    Screen.pinText.setText(null);
                    Screen.ibanText.setText(null);
                    Screen.firstNameText.setText(null);
                    Screen.lastNameText.setText(null);
                    Screen.genderText.setText(null);
                    Screen.balanceText.setText(null);
                    Screen.creditScoreText.setText(null);
                    Screen.debtText.setText(null);
                }
                else
                {
                    Screen.announcement.setText(detect.getErrorMessage());
                }

            }

        });

    }

}
