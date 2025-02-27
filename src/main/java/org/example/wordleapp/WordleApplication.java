package org.example.wordleapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @Author: Kazi Fattah
 * @Date: Feb 2025
 * @Description: A recreation of the  famous wordle game from NYTimes
 */

public class WordleApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(WordleApplication.class.getResource("wordle-view.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());
        stage.setTitle("Wordle");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/images/wordle-icon.png")));
        stage.setScene(scene);
        stage.show();

        root.requestFocus();
    }

    public static void main(String[] args) {
        launch();
    }
}