package ru.revdaalex.tictactoe.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import ru.revdaalex.tictactoe.model.Board;
import ru.revdaalex.tictactoe.model.Point;
import java.util.Random;


/**
 * Controller of game TicTacToe
 * Created by revdaalex on 21.11.2016.
 */
public class GameController {

    final Random random = new Random();

    Board board = new Board();

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
    @FXML
    private Button startButton;

    private ObservableList<Button> buttons = FXCollections.observableArrayList();

    @FXML
    public void initialize(){
        player.setDisable(true);
        computer.setDisable(true);
    }

    public GameController() {
    }

    public void play(ActionEvent actionEvent) {
        player.setDisable(true);
        computer.setDisable(true);
        for (Button button : buttons){
            boolean isUsed = false;
            button.setUserData(isUsed);
        }
        for (Button button : buttons){
            button.setOnMouseClicked(event -> {
                if (((boolean) button.getUserData()) == false){
                        button.setText("X");
                    int index = -1;
                    for (int i = 0; i < buttons.size(); ++i) {
                        if (button == buttons.get(i)) {
                            index = i;
                        }
                    }
                    board.placeAMove(new Point(index / 3, index % 3), 1);
                    boolean busy = true;
                    button.setUserData(busy);
                    for (int x = 0; x < 9; x++) {
                        int compIndex = random.nextInt(9);
                        if (((boolean) buttons.get(compIndex).getUserData()) == false) {
                            buttons.get(compIndex).setText("O");
                            buttons.get(compIndex).setUserData(busy);
                            board.placeAMove(new Point(compIndex / 3, compIndex % 3), 2);
                            break;
                        }
                    }
                    if (board.isWin()){
                        initEndOfGame();
                    }
                }
            });
        }
    }

    private void compPlayFirst(){
        int index = random.nextInt(9);
        buttons.get(index).setText("O");
        board.placeAMove(new Point(index / 3, index % 3), 1);
        buttons.get(index).setUserData(Boolean.TRUE);
    }

    public void compFirst(ActionEvent actionEvent) {
        computer.setDisable(true);
        player.setDisable(true);
        compPlayFirst();
        play(actionEvent);
    }

    private void initEndOfGame() {
        Stage stage = new Stage();
        GridPane g2 = new GridPane();
        g2.setPadding(new Insets(20, 20, 20, 20));
        g2.setVgap(20);
        g2.setHgap(90);
        Label label = new Label();
        if (board.XWin()) {
            label.setText("Отличная игра!");
            stage.setTitle("Вы победили!");
        } else if (board.OWin()){
            label.setText("Не сегодня!");
            stage.setTitle("Вы проиграли!");
        } else {
            label.setText("Победила дружба!");
            stage.setTitle("Ничья!");
        }
        g2.add(label, 0, 0, 2, 1);
        Button quit = new Button("Выход");
        g2.add(quit, 2, 1, 1, 1);
        quit.setOnMouseClicked(event -> {
            System.exit(0);
        });
        Scene scene = new Scene(g2);
        stage.setScene(scene);
        stage.show();
    }

    public void exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void startGame(ActionEvent actionEvent) {
        startButton.setDisable(true);
        buttons.addAll(button1, button2, button3, button4, button5, button6, button7, button8, button9);
        player.setDisable(false);
        computer.setDisable(false);
    }
}