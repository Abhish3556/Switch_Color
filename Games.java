package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.Group;


import javafx.scene.control.Button;

public class Games extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button Game1 = new Button("Game 1");
        Button Game2 = new Button("Game 2");
        Button Game3 = new Button("Game 3");



        Game1.setLayoutX(180);
        Game1.setLayoutY(250);
        Game1.setStyle("-fx-background-color: #199cd4; -fx-font-size: 18px; -fx-font-family: 'Berlin Sans FB'; -fx-text-fill: #fcfeff; -fx-background-radius: 6");



        Game2.setLayoutX(180);
        Game2.setLayoutY(300);
        Game2.setStyle("-fx-background-color: #199cd4; -fx-font-size: 18px; -fx-font-family: 'Berlin Sans FB'; -fx-text-fill: #fcfeff; -fx-background-radius: 6");




        Game3.setLayoutX(180);
        Game3.setLayoutY(350);
        Game3.setStyle("-fx-background-color: #199cd4; -fx-font-size: 18px; -fx-font-family: 'Berlin Sans FB'; -fx-text-fill: #fcfeff; -fx-background-radius: 6");


        Game1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                Obstacle o = new Obstacle();

                try {

                    // o.loading();
                    o.load=true;
                    o.start(primaryStage);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        });
        Game2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                Obstacle o = new Obstacle();
                Positionclr ps=new Positionclr();
                Posclr p=new Posclr();
                ps=p.load();
                try {

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        });
        Game3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                Obstacle o=new Obstacle();
                Positionclr ps=new Positionclr();
                Posclr p=new Posclr();
                ps=p.load();
                try {

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        });
        Group root=new Group();
        root.getChildren().addAll(Game1,Game2,Game3);
        Scene scene = new Scene(root, 500, 500, Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}