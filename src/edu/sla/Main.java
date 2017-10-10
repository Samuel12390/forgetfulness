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
import javafx.scene.control.ChoiceBox;


public class Main extends Application {

    public void christmasShibaButton_click() {
        System.out.println("You are like everyone else, and would like a Christmas Shiba.");
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        Button clickMeButton = new Button("Begin the Onslaught of the Christmas Shibas! Show them no mercy!");
        clickMeButton.setOnAction(e -> christmasShibaButton_click());
        StackPane myUIFrame1 = new StackPane();
        primaryStage.setTitle("Shiba, Shiba, Oh Christmas Shiba");

        Scene buttonBoi = new Scene(myUIFrame1, 325, 400);
        Image image = new Image("ChristmasShiba.jpg");
        ImageView imageView = new ImageView(image);

        Image image2 = new Image("ChristmasShiba2.jpg");
        ImageView imageView2 = new ImageView(image);

        Image image3 = new Image("ChristmasShiba 3.jpg");
        ImageView imageView3 = new ImageView(image);

        HBox ChristmasShibaHBox  = new HBox(imageView);

        Scene afterChristmasShiba = new Scene(ChristmasShibaHBox, 325, 400);

        ChoiceBox choiceBox = new ChoiceBox();

        choiceBox.getItems().add("The First Christmas Shiba!");
        choiceBox.getItems().add("The One AFTER The First Christmas Shiba!");
        choiceBox.getItems().add("The One and Only, FOURTH Christmas Shiba!");

        HBox hbox = new HBox(choiceBox);

        Scene scene = new Scene(hbox, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();

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
