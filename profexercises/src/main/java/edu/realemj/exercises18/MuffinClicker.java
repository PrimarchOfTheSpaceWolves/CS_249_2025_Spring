package edu.realemj.exercises18;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MuffinClicker extends javafx.application.Application {

    private int muffinCount = 0;

    public int getMuffinCount() { return muffinCount; }
    public void setMuffinCount(int count) {
        muffinCount = count;
    }

    private class InnerMuffinButtonHandler implements EventHandler<ActionEvent> {
        private Text countText;

        public InnerMuffinButtonHandler(Text countText) {
            this.countText = countText;
        }
        public void handle(ActionEvent event) {
            Button b = (Button)event.getSource();
            System.out.println("CLICKED!");
            muffinCount++;
            countText.setText("Muffin count: " + muffinCount);
        }
    }

    public void start(Stage primaryStage) {

        Button muffinButton = new Button("MUFFIN!");
        Text muffinCountText = new Text("Muffin count: 0");

        //EventHandler<ActionEvent> buttonHandler = new MuffinButtonHandler(this,
        //        muffinCountText);
        //EventHandler<ActionEvent> buttonHandler = new InnerMuffinButtonHandler(muffinCountText);
        //muffinButton.setOnAction(buttonHandler);

        /*
        muffinButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                muffinCount++;
                muffinCountText.setText("Muffin count: " + muffinCount);
            }
        });*/

        muffinButton.setOnAction(actionEvent -> {
            muffinCount++;
            muffinCountText.setText("Muffin count: " + muffinCount);
        });

        EventHandler<MouseEvent> mouseCoordHandler = m -> {
            System.out.println("MOUSE: " + m.getX() + ", " + m.getY());
        };

        muffinButton.setOnMouseEntered(mouseCoordHandler);
        muffinButton.setOnMouseExited(mouseCoordHandler);

        /*
        EventHandler<ActionEvent> localHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                muffinCount++;
                muffinCountText.setText("Muffin count: " + muffinCount);
            }
        };*/


        BorderPane pane = new BorderPane();
        pane.setCenter(muffinButton);
        pane.setBottom(muffinCountText);

        Scene scene = new Scene(pane, 800, 600);

        primaryStage.setTitle("Muffin Clicker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String [] args) {
        launch(args);
    }
}

class MuffinButtonHandler implements EventHandler<ActionEvent> {

    private MuffinClicker boss;
    private Text countText;

    public MuffinButtonHandler(MuffinClicker boss, Text countText) {
        this.boss = boss;
        this.countText = countText;
    }
    public void handle(ActionEvent event) {
        Button b = (Button)event.getSource();
        System.out.println("CLICKED!");
        int cnt = boss.getMuffinCount();
        cnt++;
        boss.setMuffinCount(cnt);
        countText.setText("Muffin count: " + cnt);
    }
}
