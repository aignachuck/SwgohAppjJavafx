package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private ComboBox moneyBox;

    @FXML
    private ComboBox ratherBox;

    @FXML
    private ComboBox characterBox;

    @FXML
    private ComboBox arenaBox;

    @FXML
    private ComboBox raidBox;

    @FXML
    private ComboBox tbBox;

    @FXML
    private ComboBox twBox;

    @FXML
    private ComboBox funBox;

    @FXML
    private Button saveButton;

    @FXML
    private Button clearButton;

    @FXML
    private Label endResult;

    private int moneyFinal = 0;
    private int ratherFinal;
    private int characterFinal;
    private int arenaFinal;
    private int raidFinal;
    private int tbFinal;
    private int twFinal;
    private int funFinal;


    //should really implement this as one statement inputting the values from each method


    public int moneyOut(){
        String moneyValue = moneyBox.getValue().toString();

        if (moneyValue.contains("1")){
            moneyFinal = 1;
        } else if (moneyValue.contains("2")){
            moneyFinal = 2;
        } else if (moneyValue.contains("3")){
            moneyFinal = 3;
        } else if (moneyValue.contains("4")){
            moneyFinal = 4;
        } else if (moneyValue.contains("5")){
            moneyFinal = 5;
        }

        return moneyFinal;
    }

    public int ratherOut(){
        String ratherValue = ratherBox.getValue().toString();

        if (ratherValue.contains("1")){
            ratherFinal = 1;
        } else if (ratherValue.contains("2")){
            ratherFinal = 2;
        } else if (ratherValue.contains("3")){
            ratherFinal = 3;
        } else if (ratherValue.contains("4")){
            ratherFinal = 4;
        } else if (ratherValue.contains("5")){
            ratherFinal = 5;
        }

        return ratherFinal;
    }

    public int characterOut(){
        String characterValue = characterBox.getValue().toString();

        if (characterValue.contains("1")){
            characterFinal = 1;
        } else if (characterValue.contains("2")){
            characterFinal = 2;
        } else if (characterValue.contains("3")){
            characterFinal = 3;
        } else if (characterValue.contains("4")){
            characterFinal = 4;
        } else if (characterValue.contains("5")){
            characterFinal = 5;
        }

        return characterFinal;
    }

    public int arenaOut(){
        String arenaValue = arenaBox.getValue().toString();

        if (arenaValue.contains("1")){
            arenaFinal = 1;
        } else if (arenaValue.contains("2")){
            arenaFinal = 2;
        } else if (arenaValue.contains("3")){
            arenaFinal = 3;
        } else if (arenaValue.contains("4")){
            arenaFinal = 4;
        } else if (arenaValue.contains("5")){
            arenaFinal = 5;
        }

        return arenaFinal;
    }

    public int raidOut(){
        String raidValue = raidBox.getValue().toString();

        if (raidValue.contains("1")){
            raidFinal = 1;
        } else if (raidValue.contains("2")){
            raidFinal = 2;
        } else if (raidValue.contains("3")){
            raidFinal = 3;
        } else if (raidValue.contains("4")){
            raidFinal = 4;
        } else if (raidValue.contains("5")){
            raidFinal = 5;
        }

        return raidFinal;
    }

    public int tbOut(){
        String tbValue = tbBox.getValue().toString();

        if (tbValue.contains("1")){
            tbFinal = 1;
        } else if (tbValue.contains("2")){
            tbFinal = 2;
        } else if (tbValue.contains("3")){
            tbFinal = 3;
        } else if (tbValue.contains("4")){
            tbFinal = 4;
        } else if (tbValue.contains("5")){
            tbFinal = 5;
        }

        return tbFinal;
    }

    public int twOut(){
        String twValue = twBox.getValue().toString();

        if (twValue.contains("1")){
            twFinal = 1;
        } else if (twValue.contains("2")){
            twFinal = 2;
        } else if (twValue.contains("3")){
            twFinal = 3;
        } else if (twValue.contains("4")){
            twFinal = 4;
        } else if (twValue.contains("5")){
            twFinal = 5;
        }

        return twFinal;
    }

    public int funOut(){
        String funValue = funBox.getValue().toString();

        if (funValue.contains("1")){
            funFinal = 1;
        } else if (funValue.contains("2")){
            funFinal = 2;
        } else if (funValue.contains("3")){
            funFinal = 3;
        } else if (funValue.contains("4")){
            funFinal = 4;
        } else if (funValue.contains("5")){
            funFinal = 5;
        }

        return funFinal;
    }

    @FXML
    public void saveButtonClicked(ActionEvent e){
        if (e.getSource().equals(saveButton)){
            moneyOut();
            ratherOut();
            characterOut();
            arenaOut();
            raidOut();
            tbOut();
            twOut();
            funOut();
            int scoreFinal = (moneyFinal + ratherFinal + characterFinal + arenaFinal + raidFinal + tbFinal + twFinal + funFinal);
//
            if (scoreFinal > 34){
                endResult.setText("Your final score is: " + scoreFinal + "!" + '\n' +
                        "Already know that which you need! ~ Yoda" + '\n' +
                        "-You know the answer to this question. Buying now will help you." + '\n' +
                        " Spend as your little heart desires.-");

            } else if (scoreFinal > 29 && scoreFinal < 35){
                endResult.setText("Your final score is: " + scoreFinal + "!" + '\n' +
                "Difficult to see. Always in motion is the future. ~ Yoda" + '\n' +
                "-Hard to say what you should do here. The choice to buy may help you, " + '\n' +
                        "but it may not be exactly what you need at this point. " + '\n' +
                        "Weigh your options carefully.-");
            } else if (scoreFinal < 30){
                endResult.setText("Your final score is: " + scoreFinal + "!" + '\n' +
                "It's a trap! ~ Admiral Ackbar" + '\n' +
                "-This does not seem like the best option for you." + '\n' + "As our good friend Qui-Gon Jinn once said: " + '\n' +
                "'There's always a bigger fish.'" + '\n' + "Try not to get eaten by the whales.-");
            }
        }
    }
}
