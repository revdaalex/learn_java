package ru.revdaalex.tictactoe.start;
/**
 *
 * Created by revdaalex on 16.11.2016.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import ru.revdaalex.tictactoe.controllers.GameController;

import java.io.IOException;

public class StartTicTacToe extends Application {

    private Stage primaryStage;
    private AnchorPane rootLayout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("TicTacToe");
        initGameBoard();
    }

    private void initGameBoard() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/GameBoard.fxml"));
            rootLayout = (AnchorPane) loader.load();
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
