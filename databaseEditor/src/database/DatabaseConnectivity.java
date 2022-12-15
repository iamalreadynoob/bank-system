package database;

import javax.xml.crypto.Data;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DatabaseConnectivity
{

    private String cardNumber, pin, iban, firstName, lastName, gender, balance, creditScore, debt;
    public DatabaseConnectivity(String cardNumber, String pin, String iban, String firstName,
                                String lastName, String gender, String balance, String creditScore,
                                String debt)
    {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.iban = iban;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.balance = balance;
        this.creditScore = creditScore;
        this.debt = debt;
    }

    public void appendDatabase()
    {
        try(FileWriter fileWriter = new FileWriter("database.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter out = new PrintWriter(bufferedWriter))
        {
            out.println(cardNumber);
            out.println(pin);
            out.println(iban);
            out.println(firstName);
            out.println(lastName);
            out.println(gender);
            out.println(balance);
            out.println(creditScore);
            out.println(debt);

        } catch (IOException e) {}
    }

}
