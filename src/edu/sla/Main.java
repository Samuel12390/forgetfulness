package edu.sla;

import com.sun.java.swing.action.AlignCenterAction;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.control.ChoiceBox;
import javafx.beans.value.*;


public class Main extends Application {

    public void christmasShibaButton_click() {
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Shibas, Shibas! Oh, the Christmas Shibas");
        ChoiceBox shibaChoiceBox = new ChoiceBox();

        shibaChoiceBox.getItems().add("The First Christmas Shiba!");
        shibaChoiceBox.getItems().add("The One AFTER The First Christmas Shiba!");
        shibaChoiceBox.getItems().add("The One and Only, FOURTH Christmas Shiba!");

        shibaChoiceBox.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
                System.out.println(shibaChoiceBox.getItems().get((Integer) number2));
            }
        });



        Button clickMeButton = new Button("Begin the onslaught of the Christmas Shibas! Show them no mercy!");

        clickMeButton.setOnAction(e -> christmasShibaButton_click());

        Image image = new Image("ChristmasShiba.jpg");
        ImageView imageView = new ImageView(image);

        Image image2 = new Image("ChristmasShiba2.jpg");
        ImageView imageView2 = new ImageView(image);

        Image image3 = new Image("ChristmasShiba 3.jpg");
        ImageView imageView3 = new ImageView(image);

        HBox ChristmasShibaHBox  = new HBox(imageView);
        HBox horizontalControls = new HBox(image, clickMeButton, shibaChoiceBox);


        Scene afterChristmasShiba = new Scene(horizontalControls, 325, 400);

        primaryStage.setScene(afterChristmasShiba);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
