package edu.realemj.exercises18;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.*;
public class PaneMaster extends Application {
    public void start(Stage primaryStage) {

        Button [] allButtons = new Button[5];
        for(int i = 0; i < allButtons.length; i++) {
            allButtons[i] = new Button("" + (i+1));
        }

        //Pane masterPane = new StackPane();
        //Pane masterPane = new FlowPane();
        //Pane masterPane = new VBox();
        /*
        GridPane masterPane = new GridPane();
        int index = 0;
        for(Button b: allButtons) {
            //masterPane.getChildren().add(b);

            int row = index / 10;
            int col = index % 10 + row % 2;
            index += 2;
            masterPane.add(b, col, row);
        }
        */

        BorderPane masterPane = new BorderPane();
        masterPane.setTop(allButtons[0]);
        masterPane.setBottom(allButtons[1]);
        masterPane.setLeft(allButtons[2]);
        masterPane.setRight(allButtons[3]);
        masterPane.setCenter(allButtons[4]);




        //StackPane.setAlignment(allButtons[0], Pos.TOP_LEFT);


        Scene scene = new Scene(masterPane, 800, 600);

        primaryStage.setTitle("Pane Master");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String [] args) {
        launch(args);
    }
}
