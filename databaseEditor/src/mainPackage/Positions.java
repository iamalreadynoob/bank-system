package mainPackage;

import java.awt.Color;

import javax.swing.JLabel;

public class Positions
{

    protected Positions()
    {

        Screen.cardNumberTitle.setBounds(20, 20, 100, 30);
        Screen.cardNumberTitle.setEditable(false);
        Screen.cardNumberTitle.setText("Card Number:");
        Screen.cardNumberTitle.setBackground(null);
        Screen.cardNumberTitle.setBorder(null);
        Screen.cardNumberTitle.setForeground(Color.RED.darker());

        Screen.cardNumberText.setBounds(220, 20, 200, 30);
        Screen.cardNumberText.setBackground(Color.BLACK);
        Screen.cardNumberText.setForeground(Color.WHITE);
        Screen.cardNumberText.setBorder(null);
        Screen.cardNumberText.setHorizontalAlignment(JLabel.CENTER);

        Screen.pinTitle.setBounds(20, 80, 100, 30);
        Screen.pinTitle.setEditable(false);
        Screen.pinTitle.setText("PIN:");
        Screen.pinTitle.setBackground(null);
        Screen.pinTitle.setBorder(null);
        Screen.pinTitle.setForeground(Color.RED.darker());

        Screen.pinText.setBounds(220, 80, 200, 30);
        Screen.pinText.setBackground(Color.BLACK);
        Screen.pinText.setForeground(Color.WHITE);
        Screen.pinText.setBorder(null);
        Screen.pinText.setHorizontalAlignment(JLabel.CENTER);

        Screen.ibanTitle.setBounds(20, 140, 100, 30);
        Screen.ibanTitle.setEditable(false);
        Screen.ibanTitle.setText("IBAN: ");
        Screen.ibanTitle.setBackground(null);
        Screen.ibanTitle.setBorder(null);
        Screen.ibanTitle.setForeground(Color.RED.darker());

        Screen.ibanText.setBounds(220, 140, 200, 30);
        Screen.ibanText.setBackground(Color.BLACK);
        Screen.ibanText.setForeground(Color.WHITE);
        Screen.ibanText.setBorder(null);
        Screen.ibanText.setHorizontalAlignment(JLabel.CENTER);

        Screen.firstNameTitle.setBounds(20, 200, 100, 30);
        Screen.firstNameTitle.setEditable(false);
        Screen.firstNameTitle.setText("First Name:");
        Screen.firstNameTitle.setBackground(null);
        Screen.firstNameTitle.setBorder(null);
        Screen.firstNameTitle.setForeground(Color.RED.darker());

        Screen.firstNameText.setBounds(220, 200, 200, 30);
        Screen.firstNameText.setBackground(Color.BLACK);
        Screen.firstNameText.setForeground(Color.WHITE);
        Screen.firstNameText.setBorder(null);
        Screen.firstNameText.setHorizontalAlignment(JLabel.CENTER);

        Screen.lastNameTitle.setBounds(20, 260, 100, 30);
        Screen.lastNameTitle.setEditable(false);
        Screen.lastNameTitle.setText("Last Name:");
        Screen.lastNameTitle.setBackground(null);
        Screen.lastNameTitle.setBorder(null);
        Screen.lastNameTitle.setForeground(Color.RED.darker());

        Screen.lastNameText.setBounds(220, 260, 200, 30);
        Screen.lastNameText.setBackground(Color.BLACK);
        Screen.lastNameText.setForeground(Color.WHITE);
        Screen.lastNameText.setBorder(null);
        Screen.lastNameText.setHorizontalAlignment(JLabel.CENTER);

        Screen.genderTitle.setBounds(20, 320, 100, 30);
        Screen.genderTitle.setEditable(false);
        Screen.genderTitle.setText("Gender:");
        Screen.genderTitle.setBackground(null);
        Screen.genderTitle.setBorder(null);
        Screen.genderTitle.setForeground(Color.RED.darker());

        Screen.genderText.setBounds(220, 320, 200, 30);
        Screen.genderText.setBackground(Color.BLACK);
        Screen.genderText.setForeground(Color.WHITE);
        Screen.genderText.setBorder(null);
        Screen.genderText.setHorizontalAlignment(JLabel.CENTER);

        Screen.balanceTitle.setBounds(20, 380, 100, 30);
        Screen.balanceTitle.setEditable(false);
        Screen.balanceTitle.setText("Balance:");
        Screen.balanceTitle.setBackground(null);
        Screen.balanceTitle.setBorder(null);
        Screen.balanceTitle.setForeground(Color.RED.darker());

        Screen.balanceText.setBounds(220, 380, 200, 30);
        Screen.balanceText.setBackground(Color.BLACK);
        Screen.balanceText.setForeground(Color.WHITE);
        Screen.balanceText.setBorder(null);
        Screen.balanceText.setHorizontalAlignment(JLabel.CENTER);

        Screen.creditScoreTitle.setBounds(20, 440, 100, 30);
        Screen.creditScoreTitle.setEditable(false);
        Screen.creditScoreTitle.setText("Credit Score:");
        Screen.creditScoreTitle.setBackground(null);
        Screen.creditScoreTitle.setBorder(null);
        Screen.creditScoreTitle.setForeground(Color.RED.darker());

        Screen.creditScoreText.setBounds(220, 440, 200, 30);
        Screen.creditScoreText.setBackground(Color.BLACK);
        Screen.creditScoreText.setForeground(Color.WHITE);
        Screen.creditScoreText.setBorder(null);
        Screen.creditScoreText.setHorizontalAlignment(JLabel.CENTER);

        Screen.debtTitle.setBounds(20, 500, 100, 30);
        Screen.debtTitle.setEditable(false);
        Screen.debtTitle.setText("Debt:");
        Screen.debtTitle.setBackground(null);
        Screen.debtTitle.setBorder(null);
        Screen.debtTitle.setForeground(Color.RED.darker());

        Screen.debtText.setBounds(220, 500, 200, 30);
        Screen.debtText.setBackground(Color.BLACK);
        Screen.debtText.setForeground(Color.WHITE);
        Screen.debtText.setBorder(null);
        Screen.debtText.setHorizontalAlignment(JLabel.CENTER);

        Screen.announcement.setBounds(20, 560, 400, 60);
        Screen.announcement.setEditable(false);
        Screen.announcement.setBackground(Color.BLUE.darker());
        Screen.announcement.setBorder(null);
        Screen.announcement.setForeground(Color.BLACK);
        Screen.announcement.setLineWrap(true);

        Screen.addAccount.setBounds(430,560,100,30);
        Screen.addAccount.setBackground(Color.RED.darker());
        Screen.addAccount.setForeground(Color.BLACK);
        Screen.addAccount.setText("Add");
        Screen.addAccount.setBorder(null);
    }


}
