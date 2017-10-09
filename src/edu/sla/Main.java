package edu.sla;

import com.sun.java.swing.action.AlignCenterAction;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    public void christmasShibaButton_click() {
        System.out.println("You are like everyone else, and would like a Christmas Shiba.");
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        Button clickMeButton = new Button("If you would like a Christmas Shiba, give me a gentle tap on the front");
        clickMeButton.setOnAction(e -> christmasShibaButton_click());
        StackPane myUIFrame1 = new StackPane();
        primaryStage.setTitle("Shiba, Shiba, Oh Christmas Shiba");

        Scene buttonBoi = new Scene(myUIFrame1, 325, 400);
        Image image = new Image("ChristmasShiba.jpg");
        ImageView imageView = new ImageView(image);

        HBox ChristmasShibaHBox  = new HBox(imageView);

        Scene afterChristmasShiba = new Scene(ChristmasShibaHBox, 325, 400);

        StackPane myUIFrame2 = new StackPane();
        myUIFrame1.getChildren().addAll(clickMeButton, ChristmasShibaHBox);
        primaryStage.setScene(afterChristmasShiba);
        primaryStage.setScene(buttonBoi);
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
