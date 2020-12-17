package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class end_game extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn2=new Button("Resume Game Lossing 5 Points");
        Button exit=new Button("Exit");
        exit.setOnAction(e->System.exit(0));
        Pane root =new Pane();
        StackPane hold = new StackPane();
        Canvas canvas = new Canvas(500,  500);
        hold.getChildren().add(canvas);
        root.getChildren().add(hold);
        hold.setStyle("-fx-background-color: black");

        btn2.setLayoutX(150);
        btn2.setLayoutY(200);
        btn2.setStyle("-fx-background-color: #199cd4; -fx-font-size: 18px; -fx-font-family: 'Berlin Sans FB'; -fx-text-fill: #fcfeff; -fx-background-radius: 6");
        root.getChildren().add(btn2);

        root.getChildren().add(exit);

        exit.setLayoutX(150);
        exit.setLayoutY(250);
        exit.setStyle("-fx-background-color: #199cd4; -fx-font-size: 18px; -fx-font-family: 'Berlin Sans FB'; -fx-text-fill: #fcfeff; -fx-background-radius: 6");


        Scene scene=new Scene(root,500,500);
        primaryStage.setTitle("Switch Color");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}