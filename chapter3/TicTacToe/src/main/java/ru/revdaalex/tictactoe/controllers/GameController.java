package ru.revdaalex.tictactoe.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import java.util.Random;


/**
 * Controller of game TicTacToe
 * Created by revdaalex on 21.11.2016.
 */
public class GameController {

    final Random random = new Random();

    @FXML
    AnchorPane gameBoard;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button player;
    @FXML
    private Button computer;

    private ObservableList<Button> buttons = FXCollections.observableArrayList();

    @FXML
    public void initialize(){
    }

    public GameController() {
    }

    public void play(ActionEvent actionEvent) {
        player.setDisable(true);
        computer.setDisable(true);
        buttons.addAll(button1, button2, button3, button4, button5, button6, button7, button8, button9);
        for (Button button : buttons){
            button.setOnMouseClicked(event -> {
                if (!button.getText().equals("X") && !button.getText().equals("O")){
                        button.setText("X");
                    }
                compPlay();
            });
        }
    }

    private void compPlay() {
        for (int index = 0; index < 9; index++) {
            int x = random.nextInt(9);
            if (!buttons.get(x).getText().equals("X") && !buttons.get(x).getText().equals("O")) {
                buttons.get(x).setText("O");
                break;
            }
        }
    }

    private void compPlayFirst(){
        int x = random.nextInt(9);
        buttons.addAll(button1, button2, button3, button4, button5, button6, button7, button8, button9);
        buttons.get(x).setText("O");
    }

    public void compFirst(ActionEvent actionEvent) {
        computer.setDisable(true);
        player.setDisable(true);
        compPlayFirst();
        play(actionEvent);


    }
}