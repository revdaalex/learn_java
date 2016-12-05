package ru.revdaalex.tictactoe.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
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

    private Pane pane;

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
                if (checkWinner()){
                    initEndOfGame();
                }
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

    private boolean checkWinner(){
        // 1 Ряд
        if (""!=button1.getText() && button1.getText() == button2.getText()
                && button2.getText() == button3.getText()){
            return true;
        }
        // 2 Ряд
        if (""!=button4.getText() && button4.getText() == button5.getText()
                && button5.getText() == button6.getText()){
            return true;
        }
        // 3 Ряд
        if (""!=button7.getText() && button7.getText() == button8.getText()
                && button8.getText() == button9.getText()){
            return true;
        }
        // 1 Колонка
        if (""!=button1.getText() && button1.getText() == button4.getText()
                && button4.getText() == button7.getText()){
            return true;
        }
        // 2 Колонка
        if (""!=button2.getText() && button2.getText() == button5.getText()
                && button5.getText() == button8.getText()){
            return true;
        }
        // 3 Колонка
        if (""!=button3.getText() && button3.getText() == button6.getText()
                && button6.getText() == button9.getText()){
            return true;
        }
        // 1 Диагональ
        if (""!=button1.getText() && button1.getText() == button5.getText()
                && button5.getText() == button9.getText()){
            return true;
        }
        // 2 Диагональ
        if (""!=button3.getText() && button3.getText() == button5.getText()
                && button5.getText() == button7.getText()){
            return true;
        }
        return false;
    }

    private void initEndOfGame(){
        try{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/EndGame.fxml"));
            pane = (Pane) loader.load();
            Scene scene = new Scene(pane);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Игра закончена");
            stage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exit(ActionEvent actionEvent) {
        System.exit(0);
    }
}