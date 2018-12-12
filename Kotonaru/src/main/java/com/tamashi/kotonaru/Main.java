package com.tamashi.kotonaru;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {


    @Override
    public void start(Stage welcomStage) {

        Group group = new Group() ;

        Scene scene = new Scene(group, 600, 800) ;

        welcomStage.initStyle(StageStyle.DECORATED);
        welcomStage.setTitle("Kotonaru");
        welcomStage.setScene(scene);
        welcomStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }

}
