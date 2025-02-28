/**
 * Sample Skeleton for 'wordle-view.fxml' Controller Class
 */

package org.example.wordleapp;

import java.net.URL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;


import javafx.animation.PauseTransition;
import javafx.application.Platform;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Duration;


public class WordleController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;



    @FXML // fx:id="hboxAnswer"
    private HBox hboxAnswer; // Value injected by FXMLLoader



    @FXML // fx:id="btnA"
    private Button btnA; // Value injected by FXMLLoader

    @FXML // fx:id="btnB"
    private Button btnB; // Value injected by FXMLLoader

    @FXML // fx:id="btnC"
    private Button btnC; // Value injected by FXMLLoader

    @FXML // fx:id="btnClear"
    private Button btnClear; // Value injected by FXMLLoader

    @FXML // fx:id="btnD"
    private Button btnD; // Value injected by FXMLLoader

    @FXML // fx:id="btnE"
    private Button btnE; // Value injected by FXMLLoader

    @FXML // fx:id="btnEnter"
    private Button btnEnter; // Value injected by FXMLLoader

    @FXML // fx:id="btnF"
    private Button btnF; // Value injected by FXMLLoader

    @FXML // fx:id="btnG"
    private Button btnG; // Value injected by FXMLLoader

    @FXML // fx:id="btnH"
    private Button btnH; // Value injected by FXMLLoader

    @FXML // fx:id="btnI"
    private Button btnI; // Value injected by FXMLLoader

    @FXML // fx:id="btnJ"
    private Button btnJ; // Value injected by FXMLLoader

    @FXML // fx:id="btnK"
    private Button btnK; // Value injected by FXMLLoader

    @FXML // fx:id="btnL"
    private Button btnL; // Value injected by FXMLLoader

    @FXML // fx:id="btnM"
    private Button btnM; // Value injected by FXMLLoader

    @FXML // fx:id="btnN"
    private Button btnN; // Value injected by FXMLLoader

    @FXML // fx:id="btnO"
    private Button btnO; // Value injected by FXMLLoader

    @FXML // fx:id="btnP"
    private Button btnP; // Value injected by FXMLLoader

    @FXML // fx:id="btnQ"
    private Button btnQ; // Value injected by FXMLLoader

    @FXML // fx:id="btnR"
    private Button btnR; // Value injected by FXMLLoader

    @FXML // fx:id="btnS"
    private Button btnS; // Value injected by FXMLLoader

    @FXML // fx:id="btnT"
    private Button btnT; // Value injected by FXMLLoader

    @FXML // fx:id="btnU"
    private Button btnU; // Value injected by FXMLLoader

    @FXML // fx:id="btnV"
    private Button btnV; // Value injected by FXMLLoader

    @FXML // fx:id="btnW"
    private Button btnW; // Value injected by FXMLLoader

    @FXML // fx:id="btnX"
    private Button btnX; // Value injected by FXMLLoader

    @FXML // fx:id="btnY"
    private Button btnY; // Value injected by FXMLLoader

    @FXML // fx:id="btnZ"
    private Button btnZ; // Value injected by FXMLLoader

    @FXML // fx:id="lblAnswer1"
    private Label lblAnswer1; // Value injected by FXMLLoader

    @FXML // fx:id="lblAnswer2"
    private Label lblAnswer2; // Value injected by FXMLLoader

    @FXML // fx:id="lblAnswer3"
    private Label lblAnswer3; // Value injected by FXMLLoader

    @FXML // fx:id="lblAnswer4"
    private Label lblAnswer4; // Value injected by FXMLLoader

    @FXML // fx:id="lblAnswer5"
    private Label lblAnswer5; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess1Letter1"
    private Label lblGuess1Letter1; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess1Letter2"
    private Label lblGuess1Letter2; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess1Letter3"
    private Label lblGuess1Letter3; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess1Letter4"
    private Label lblGuess1Letter4; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess1Letter5"
    private Label lblGuess1Letter5; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess2Letter1"
    private Label lblGuess2Letter1; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess2Letter2"
    private Label lblGuess2Letter2; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess2Letter3"
    private Label lblGuess2Letter3; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess2Letter4"
    private Label lblGuess2Letter4; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess2Letter5"
    private Label lblGuess2Letter5; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess3Letter1"
    private Label lblGuess3Letter1; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess3Letter2"
    private Label lblGuess3Letter2; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess3Letter3"
    private Label lblGuess3Letter3; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess3Letter4"
    private Label lblGuess3Letter4; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess3Letter5"
    private Label lblGuess3Letter5; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess4Letter1"
    private Label lblGuess4Letter1; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess4Letter2"
    private Label lblGuess4Letter2; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess4Letter3"
    private Label lblGuess4Letter3; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess4Letter4"
    private Label lblGuess4Letter4; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess4Letter5"
    private Label lblGuess4Letter5; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess5Letter1"
    private Label lblGuess5Letter1; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess5Letter2"
    private Label lblGuess5Letter2; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess5Letter3"
    private Label lblGuess5Letter3; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess5Letter4"
    private Label lblGuess5Letter4; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess5Letter5"
    private Label lblGuess5Letter5; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess6Letter1"
    private Label lblGuess6Letter1; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess6Letter2"
    private Label lblGuess6Letter2; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess6Letter3"
    private Label lblGuess6Letter3; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess6Letter4"
    private Label lblGuess6Letter4; // Value injected by FXMLLoader

    @FXML // fx:id="lblGuess6Letter5"
    private Label lblGuess6Letter5; // Value injected by FXMLLoader


    @FXML // fx:id="lblResult"
    private Label lblResult, lblHeader, lblFooter; // Value injected by FXMLLoader

    @FXML
    private ToggleButton btnDarkMode, btnLightMode;

    @FXML
    private VBox vboxApp;




    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnA != null : "fx:id=\"btnA\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnB != null : "fx:id=\"btnB\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnC != null : "fx:id=\"btnC\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnD != null : "fx:id=\"btnD\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnE != null : "fx:id=\"btnE\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnEnter != null : "fx:id=\"btnEnter\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnF != null : "fx:id=\"btnF\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnG != null : "fx:id=\"btnG\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnH != null : "fx:id=\"btnH\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnI != null : "fx:id=\"btnI\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnJ != null : "fx:id=\"btnJ\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnK != null : "fx:id=\"btnK\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnL != null : "fx:id=\"btnL\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnM != null : "fx:id=\"btnM\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnN != null : "fx:id=\"btnN\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnO != null : "fx:id=\"btnO\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnP != null : "fx:id=\"btnP\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnQ != null : "fx:id=\"btnQ\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnR != null : "fx:id=\"btnR\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnS != null : "fx:id=\"btnS\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnT != null : "fx:id=\"btnT\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnU != null : "fx:id=\"btnU\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnV != null : "fx:id=\"btnV\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnW != null : "fx:id=\"btnW\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnX != null : "fx:id=\"btnX\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnY != null : "fx:id=\"btnY\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnZ != null : "fx:id=\"btnZ\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess1Letter1 != null : "fx:id=\"lblGuess1Letter1\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess1Letter2 != null : "fx:id=\"lblGuess1Letter2\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess1Letter3 != null : "fx:id=\"lblGuess1Letter3\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess1Letter4 != null : "fx:id=\"lblGuess1Letter4\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess1Letter5 != null : "fx:id=\"lblGuess1Letter5\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess2Letter1 != null : "fx:id=\"lblGuess2Letter1\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess2Letter2 != null : "fx:id=\"lblGuess2Letter2\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess2Letter3 != null : "fx:id=\"lblGuess2Letter3\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess2Letter4 != null : "fx:id=\"lblGuess2Letter4\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess2Letter5 != null : "fx:id=\"lblGuess2Letter5\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess3Letter1 != null : "fx:id=\"lblGuess3Letter1\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess3Letter2 != null : "fx:id=\"lblGuess3Letter2\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess3Letter3 != null : "fx:id=\"lblGuess3Letter3\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess3Letter4 != null : "fx:id=\"lblGuess3Letter4\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess3Letter5 != null : "fx:id=\"lblGuess3Letter5\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess4Letter1 != null : "fx:id=\"lblGuess4Letter1\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess4Letter2 != null : "fx:id=\"lblGuess4Letter2\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess4Letter3 != null : "fx:id=\"lblGuess4Letter3\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess4Letter4 != null : "fx:id=\"lblGuess4Letter4\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess4Letter5 != null : "fx:id=\"lblGuess4Letter5\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess5Letter1 != null : "fx:id=\"lblGuess5Letter1\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess5Letter2 != null : "fx:id=\"lblGuess5Letter2\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess5Letter3 != null : "fx:id=\"lblGuess5Letter3\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess5Letter4 != null : "fx:id=\"lblGuess5Letter4\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess5Letter5 != null : "fx:id=\"lblGuess5Letter5\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess6Letter1 != null : "fx:id=\"lblGuess6Letter1\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess6Letter2 != null : "fx:id=\"lblGuess6Letter2\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess6Letter3 != null : "fx:id=\"lblGuess6Letter3\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess6Letter4 != null : "fx:id=\"lblGuess6Letter4\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblGuess6Letter5 != null : "fx:id=\"lblGuess6Letter5\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblAnswer1 != null : "fx:id=\"lblAnswer1\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblAnswer2 != null : "fx:id=\"lblAnswer2\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblAnswer3 != null : "fx:id=\"lblAnswer3\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblAnswer4 != null : "fx:id=\"lblAnswer4\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblAnswer5 != null : "fx:id=\"lblAnswer5\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblResult != null : "fx:id=\"lblResult\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblHeader != null : "fx:id=\"lblHeader\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert lblFooter != null : "fx:id=\"lblFooter\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert hboxAnswer != null : "fx:id=\"hboxAnswer\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnDarkMode != null : "fx:id=\"btnDarkMode\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert btnLightMode != null : "fx:id=\"btnLightMode\" was not injected: check your FXML file 'wordle-view.fxml'.";
        assert vboxApp != null : "fx:id=\"vboxApp\" was not injected: check your FXML file 'wordle-view.fxml'.";




        lblAnswer1.setText(ANSWER_AS_LIST.get(0).toUpperCase());
        lblAnswer2.setText(ANSWER_AS_LIST.get(1).toUpperCase());
        lblAnswer3.setText(ANSWER_AS_LIST.get(2).toUpperCase());
        lblAnswer4.setText(ANSWER_AS_LIST.get(3).toUpperCase());
        lblAnswer5.setText(ANSWER_AS_LIST.get(4).toUpperCase());


        btnQ.setOnAction(event -> buttonPressed(btnQ.getText()));
        btnW.setOnAction(event -> buttonPressed(btnW.getText()));
        btnE.setOnAction(event -> buttonPressed(btnE.getText()));
        btnR.setOnAction(event -> buttonPressed(btnR.getText()));
        btnT.setOnAction(event -> buttonPressed(btnT.getText()));
        btnY.setOnAction(event -> buttonPressed(btnY.getText()));
        btnU.setOnAction(event -> buttonPressed(btnU.getText()));
        btnI.setOnAction(event -> buttonPressed(btnI.getText()));
        btnO.setOnAction(event -> buttonPressed(btnO.getText()));
        btnP.setOnAction(event -> buttonPressed(btnP.getText()));
        btnA.setOnAction(event -> buttonPressed(btnA.getText()));
        btnS.setOnAction(event -> buttonPressed(btnS.getText()));
        btnD.setOnAction(event -> buttonPressed(btnD.getText()));
        btnF.setOnAction(event -> buttonPressed(btnF.getText()));
        btnG.setOnAction(event -> buttonPressed(btnG.getText()));
        btnH.setOnAction(event -> buttonPressed(btnH.getText()));
        btnJ.setOnAction(event -> buttonPressed(btnJ.getText()));
        btnK.setOnAction(event -> buttonPressed(btnK.getText()));
        btnL.setOnAction(event -> buttonPressed(btnL.getText()));
        btnZ.setOnAction(event -> buttonPressed(btnZ.getText()));
        btnX.setOnAction(event -> buttonPressed(btnX.getText()));
        btnC.setOnAction(event -> buttonPressed(btnC.getText()));
        btnV.setOnAction(event -> buttonPressed(btnV.getText()));
        btnB.setOnAction(event -> buttonPressed(btnB.getText()));
        btnN.setOnAction(event -> buttonPressed(btnN.getText()));
        btnM.setOnAction(event -> buttonPressed(btnM.getText()));

        btnClear.setOnAction(event -> clearPressed());

        btnLightMode.setOnAction(event -> setToLightMode());
        btnDarkMode.setOnAction(event -> setToDarkMode());


        mapBoxes();
        mapButtons();

        btnEnter.setOnAction(event -> enterPressed());

        hboxAnswer.setVisible(false);
        lblResult.setVisible(false);

        Platform.runLater(() -> {
            bindButton(KeyCode.A, btnA);
            bindButton(KeyCode.B, btnB);
            bindButton(KeyCode.C, btnC);
            bindButton(KeyCode.D, btnD);
            bindButton(KeyCode.E, btnE);
            bindButton(KeyCode.F, btnF);
            bindButton(KeyCode.G, btnG);
            bindButton(KeyCode.H, btnH);
            bindButton(KeyCode.I, btnI);
            bindButton(KeyCode.J, btnJ);
            bindButton(KeyCode.K, btnK);
            bindButton(KeyCode.L, btnL);
            bindButton(KeyCode.M, btnM);
            bindButton(KeyCode.N, btnN);
            bindButton(KeyCode.O, btnO);
            bindButton(KeyCode.P, btnP);
            bindButton(KeyCode.Q, btnQ);
            bindButton(KeyCode.R, btnR);
            bindButton(KeyCode.S, btnS);
            bindButton(KeyCode.T, btnT);
            bindButton(KeyCode.U, btnU);
            bindButton(KeyCode.V, btnV);
            bindButton(KeyCode.W, btnW);
            bindButton(KeyCode.X, btnX);
            bindButton(KeyCode.Y, btnY);
            bindButton(KeyCode.Z, btnZ);
            bindButton(KeyCode.BACK_SPACE, btnClear);
            bindButton(KeyCode.ENTER, btnEnter);

        });

    }



    int index = 0;
    int wordsGuessed = 0;
    Map<String, Label> row1 = new HashMap<>();
    Map<String, Label> row2 = new HashMap<>();
    Map<String, Label> row3 = new HashMap<>();
    Map<String, Label> row4 = new HashMap<>();
    Map<String, Label> row5 = new HashMap<>();
    Map<String, Label> row6 = new HashMap<>();
    Map<String, Button>buttonMap = new HashMap<>();

    final String ANSWER = Answer.setWordleAnswer();

    final ArrayList<String> ANSWER_AS_LIST = Answer.stringToLetterArrayList(ANSWER);
    ArrayList<String> GuessWord= new ArrayList<>();
    ArrayList<String> ButtonsPressed =  new ArrayList<>();


    private void bindButton(KeyCode key, Button btn) {
        if (btn != null && btn.getScene() != null) {
            // Add key binding to the scene to trigger button action
            btn.getScene().addEventFilter(KeyEvent.KEY_PRESSED, event -> {
                if (event.getCode() == key) {
                    // Fire the button's action programmatically when 'A' is pressed
                    btn.fire();
                }
            });
        }
    }

    private void enterPressed() {
        if (Answer.checkGuess(GuessWord)) {
            wordsGuessed++;
            changeButtonColor(GuessWord);
            GuessWord.clear();
            lblResult.setVisible(false);
            lblResult.getStyleClass().clear();
            lblResult.getStyleClass().add("resultMessage");

            index = 0;
            switch (wordsGuessed) {
                case 1:
                {
                    makeGuess(row1);
                    break;
                }
                case 2:
                {
                    makeGuess(row2);
                    break;
                }
                case 3:
                {
                    makeGuess(row3);
                    break;
                }
                case 4:
                {
                    makeGuess(row4);
                    break;
                }
                case 5:
                {
                    makeGuess(row5);
                    break;
                }
                case 6:
                {
                    makeGuess(row6);
                    if(!lblResult.isVisible()) {
                        lblResult.setVisible(true);
                        lblResult.getStyleClass().clear();
                        lblResult.getStyleClass().add("resultMessageFailed");
                        lblResult.setText("Sorry! You ran out of tries!");
                        hboxAnswer.setVisible(true);
                    }
                    break;
                }

           }
        } else {
            lblResult.setVisible(true);
            lblResult.getStyleClass().clear();
            lblResult.getStyleClass().add("resultMessageFailed");
            lblResult.setText("Invalid Word!");
            hideLabelAfterDelay(lblResult);

        }


    }

    private void hideLabelAfterDelay(Label label) {
        // Create a PauseTransition that lasts for 2 seconds
        PauseTransition pause = new PauseTransition(Duration.seconds(2));

        // Set the action that will occur after the pause (hide the label)
        pause.setOnFinished(event -> label.setVisible(false));

        // Play the transition
        pause.play();
    }


    private void makeGuess(Map<String, Label> guessedRow) {

//        String guessedBox;

        int excelsior = 0;
        ArrayList<String> colorLetters = new ArrayList<>();

        for (int i = 0; i < ANSWER_AS_LIST.size(); i++) {
            String letterBeingChecked = guessedRow.get("Letter" + String.valueOf(i + 1)).getText().toLowerCase();
            if (letterBeingChecked.equalsIgnoreCase(ANSWER_AS_LIST.get(i))) {
                turnGreen(guessedRow.get("Letter" + String.valueOf(i + 1)));
                colorLetters.add(letterBeingChecked);
                excelsior++;
            }
        }

        for (int i = 0; i < ANSWER_AS_LIST.size(); i++) {
            String letterBeingChecked = guessedRow.get("Letter"+String.valueOf(i+1)).getText().toLowerCase();
            if (ANSWER_AS_LIST.contains(letterBeingChecked) && !letterBeingChecked.equalsIgnoreCase(ANSWER_AS_LIST.get(i))) {
                int colorChecker = 0;
                int answerChecker = 0;

                for (String letter : colorLetters) {
                    if (letter.equalsIgnoreCase(letterBeingChecked)) {
                        colorChecker++;
                    }
                }

                for (String letter : ANSWER_AS_LIST) {
                    if (letter.equalsIgnoreCase(letterBeingChecked)) {
                        answerChecker++;
                    }
                }

                if (colorChecker < answerChecker) {
                    turnYellow(guessedRow.get("Letter"+String.valueOf(i+1)));
                    colorLetters.add(letterBeingChecked);

                }


            } else if (!letterBeingChecked.equalsIgnoreCase(ANSWER_AS_LIST.get(i))){
                turnGrey(guessedRow.get("Letter"+String.valueOf(i+1)));

            }

        }

        for (int i = 0; i < ANSWER_AS_LIST.size(); i++) {
            if (!guessedRow.get("Letter" + String.valueOf(i + 1)).getStyleClass().contains("greenBox") &&
                    !guessedRow.get("Letter" + String.valueOf(i + 1)).getStyleClass().contains("yellowBox") &&
                    !guessedRow.get("Letter" + String.valueOf(i + 1)).getStyleClass().contains("greyBox")) {
                turnGrey(guessedRow.get("Letter"+String.valueOf(i+1)));
            }

        }

//        for (int i = 0; i < ANSWER_AS_LIST.size(); i++) {
//            guessedBox = setColor(guessedRow.get("Letter"+String.valueOf(i+1)), i, ANSWER_AS_LIST);
//
//            if (guessedBox.equalsIgnoreCase("GREEN")) {
//                turnGreen(guessedRow.get("Letter"+String.valueOf(i+1)));
//                excelsior++;
//            } else if (guessedBox.equalsIgnoreCase("YELLOW")) {
//                turnYellow(guessedRow.get("Letter"+String.valueOf(i+1)));
//            } else if (guessedBox.equalsIgnoreCase("GREY")) {
//                turnGrey(guessedRow.get("Letter"+String.valueOf(i+1)));
//            }
//        }

        if (excelsior == 5) {
            lblResult.setVisible(true);
            lblResult.getStyleClass().clear();
            lblResult.getStyleClass().add("resultMessage");
            lblResult.setText("Congratulations! You guessed correctly!");
            btnEnter.setDisable(true);
        }

    }

//    public static String setColor(Label guessedBox,int index, ArrayList<String> answerWord) {
//        String color = "grey";
//        if (guessedBox.getText().equalsIgnoreCase(answerWord.get(index))) {
//            color = "green";
//        } else if (answerWord.contains(guessedBox.getText().toLowerCase())) {
//            color = "yellow";
//        } else {
//            color = "grey";
//        }
//        return color;
//    }

    private void turnGreen(Label guessedBox) {
        guessedBox.getStyleClass().clear();
        guessedBox.getStyleClass().add("greenBox");

    }

    private void turnYellow(Label guessedBox) {
        guessedBox.getStyleClass().clear();
        guessedBox.getStyleClass().add("yellowBox");

    }

    private void turnGrey(Label guessedBox) {
        guessedBox.getStyleClass().clear();
        guessedBox.getStyleClass().add("greyBox");

    }

    private void clearPressed() {
        switch(wordsGuessed){
            case 0:
            {
                activateRowForClear(row1);
                break;
            }
            case 1: {
                activateRowForClear(row2);
                break;
            }
            case 2: {
                activateRowForClear(row3);
                break;
            }
            case 3: {
                activateRowForClear(row4);
                break;
            }
            case 4: {
                activateRowForClear(row5);
                break;
            }
            case 5: {
                activateRowForClear(row6);
                break;
            }
        }

    }

    private void activateRowForClear(Map<String, Label> selectedRow) {
        switch(index) {
            case 1: {
                selectedRow.get("Letter1").setText("");
                GuessWord.remove(GuessWord.size()-1);
                index = 0;
                break;
            }
            case 2: {
                selectedRow.get("Letter2").setText("");
                GuessWord.remove(GuessWord.size()-1);
                index = 1;
                break;
            }
            case 3: {
                selectedRow.get("Letter3").setText("");
                GuessWord.remove(GuessWord.size()-1);
                index = 2;
                break;
            }
            case 4: {
                selectedRow.get("Letter4").setText("");
                GuessWord.remove(GuessWord.size()-1);
                index = 3;
                break;
            }
            case 5: {
                selectedRow.get("Letter5").setText("");
                GuessWord.remove(GuessWord.size()-1);
                index = 4;
                break;
            }
        }
    }


    private void buttonPressed(String letterPressed) {

        switch (wordsGuessed) {
            case 0 : {
                activateRow(row1, letterPressed);

                break;
            }
            case 1 : {
                activateRow(row2, letterPressed);
                break;
            }
            case 2 : {
                activateRow(row3, letterPressed);
                break;
            }
            case 3 : {
                activateRow(row4, letterPressed);
                break;
            }
            case 4 : {
                activateRow(row5, letterPressed);
                break;
            }
            case 5 : {
                activateRow(row6, letterPressed);
                break;
            }
        }




    }

    private void activateRow(Map<String, Label> selectRow, String letterPressed) {
        switch (index) {
            case 0: {
                selectRow.get("Letter1").setText(letterPressed);
                GuessWord.add(letterPressed);
                index=1;
                break;
            }
            case 1: {
                selectRow.get("Letter2").setText(letterPressed);
                GuessWord.add(letterPressed);
                index=2;
                break;
            }
            case 2: {
                selectRow.get("Letter3").setText(letterPressed);
                GuessWord.add(letterPressed);
                index=3;
                break;
            }
            case 3: {
                selectRow.get("Letter4").setText(letterPressed);
                GuessWord.add(letterPressed);
                index=4;
                break;
            }
            case 4: {
                selectRow.get("Letter5").setText(letterPressed);
                GuessWord.add(letterPressed);
                index=5;
                break;
            }

        }
    }

    private void mapBoxes() {
        row1.put("Letter1", lblGuess1Letter1);
        row1.put("Letter2", lblGuess1Letter2);
        row1.put("Letter3", lblGuess1Letter3);
        row1.put("Letter4", lblGuess1Letter4);
        row1.put("Letter5", lblGuess1Letter5);
        row2.put("Letter1", lblGuess2Letter1);
        row2.put("Letter2", lblGuess2Letter2);
        row2.put("Letter3", lblGuess2Letter3);
        row2.put("Letter4", lblGuess2Letter4);
        row2.put("Letter5", lblGuess2Letter5);
        row3.put("Letter1", lblGuess3Letter1);
        row3.put("Letter2", lblGuess3Letter2);
        row3.put("Letter3", lblGuess3Letter3);
        row3.put("Letter4", lblGuess3Letter4);
        row3.put("Letter5", lblGuess3Letter5);
        row4.put("Letter1", lblGuess4Letter1);
        row4.put("Letter2", lblGuess4Letter2);
        row4.put("Letter3", lblGuess4Letter3);
        row4.put("Letter4", lblGuess4Letter4);
        row4.put("Letter5", lblGuess4Letter5);
        row5.put("Letter1", lblGuess5Letter1);
        row5.put("Letter2", lblGuess5Letter2);
        row5.put("Letter3", lblGuess5Letter3);
        row5.put("Letter4", lblGuess5Letter4);
        row5.put("Letter5", lblGuess5Letter5);
        row6.put("Letter1", lblGuess6Letter1);
        row6.put("Letter2", lblGuess6Letter2);
        row6.put("Letter3", lblGuess6Letter3);
        row6.put("Letter4", lblGuess6Letter4);
        row6.put("Letter5", lblGuess6Letter5);
    }

    private void mapButtons() {
        buttonMap.put("A", btnA);
        buttonMap.put("B", btnB);
        buttonMap.put("C", btnC);
        buttonMap.put("D", btnD);
        buttonMap.put("E", btnE);
        buttonMap.put("F", btnF);
        buttonMap.put("G", btnG);
        buttonMap.put("H", btnH);
        buttonMap.put("I", btnI);
        buttonMap.put("J", btnJ);
        buttonMap.put("K", btnK);
        buttonMap.put("L", btnL);
        buttonMap.put("M", btnM);
        buttonMap.put("N", btnN);
        buttonMap.put("O", btnO);
        buttonMap.put("P", btnP);
        buttonMap.put("Q", btnQ);
        buttonMap.put("R", btnR);
        buttonMap.put("S", btnS);
        buttonMap.put("T", btnT);
        buttonMap.put("U", btnU);
        buttonMap.put("V", btnV);
        buttonMap.put("W", btnW);
        buttonMap.put("X", btnX);
        buttonMap.put("Y", btnY);
        buttonMap.put("Z", btnZ);
    }

    private void changeButtonColor(ArrayList<String>buttonsPressed) {
        for (String button : buttonsPressed) {
            buttonMap.get(button).getStyleClass().remove("button");
            buttonMap.get(button).getStyleClass().add("buttonUsed");
        }
    }

    private void setToDarkMode(){
        btnDarkMode.setSelected(false);


        vboxApp.getStyleClass().remove("lightMode");
        vboxApp.getStyleClass().add("darkMode");
        lblHeader.getStyleClass().remove("lightMode");
        lblHeader.getStyleClass().add("darkMode");
        lblFooter.getStyleClass().remove("lightMode");
        lblFooter.getStyleClass().add("darkMode");

        if (wordsGuessed<1) {
            row1.forEach((key, value) ->
            {value.getStyleClass().remove("lightMode");
                value.getStyleClass().add("darkMode");});
        }

        if (wordsGuessed<2) {
            row2.forEach((key, value) ->
            {value.getStyleClass().remove("lightMode");
                value.getStyleClass().add("darkMode");});
        }

        if (wordsGuessed<3) {
            row3.forEach((key, value) ->
            {value.getStyleClass().remove("lightMode");
                value.getStyleClass().add("darkMode");});
        }

        if (wordsGuessed<4) {
            row4.forEach((key, value) ->
            {value.getStyleClass().remove("lightMode");
                value.getStyleClass().add("darkMode");});
        }

        if (wordsGuessed<5) {
            row5.forEach((key, value) ->
            {value.getStyleClass().remove("lightMode");
                value.getStyleClass().add("darkMode");});
        }

        if (wordsGuessed<6) {
            row6.forEach((key, value) ->
            {value.getStyleClass().remove("lightMode");
                value.getStyleClass().add("darkMode");});
        }





    }

    private void setToLightMode(){
        btnLightMode.setSelected(false);


        vboxApp.getStyleClass().remove("darkMode");
        vboxApp.getStyleClass().add("lightMode");
        lblHeader.getStyleClass().remove("darkMode");
        lblHeader.getStyleClass().add("lightMode");
        lblFooter.getStyleClass().remove("darkMode");
        lblFooter.getStyleClass().add("lightMode");


        if (wordsGuessed<1) {
            row1.forEach((key, value) ->
            {value.getStyleClass().remove("darkMode");
                value.getStyleClass().add("lightMode");});
        }

        if (wordsGuessed<2) {
            row2.forEach((key, value) ->
            {value.getStyleClass().remove("darkMode");
                value.getStyleClass().add("lightMode");});
        }

        if (wordsGuessed<3) {
            row3.forEach((key, value) ->
            {value.getStyleClass().remove("darkMode");
                value.getStyleClass().add("lightMode");});
        }

        if (wordsGuessed<4) {
            row4.forEach((key, value) ->
            {value.getStyleClass().remove("darkMode");
                value.getStyleClass().add("lightMode");});
        }

        if (wordsGuessed<5) {
            row5.forEach((key, value) ->
            {value.getStyleClass().remove("darkMode");
                value.getStyleClass().add("lightMode");});
        }

        if (wordsGuessed<6) {
            row6.forEach((key, value) ->
            {value.getStyleClass().remove("darkMode");
                value.getStyleClass().add("lightMode");});
        }


    }


}
