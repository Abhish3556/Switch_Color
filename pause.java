package sample;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class pause extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn=new Button("New Game");
        Button btn2=new Button("Resume Game");
        Button exit=new Button("Exit");
        Button save=new Button("Save Game");
        Obstacle o=new Obstacle();
        exit.setOnAction(e->System.exit(0));
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("hello world");
            }
        });
        Pane root =new Pane();
        StackPane hold = new StackPane();
        Canvas canvas = new Canvas(500,  500);
        hold.getChildren().add(canvas);
        root.getChildren().add(hold);
        hold.setStyle("-fx-background-color: black");
        btn.setMinSize(30,20);

        root.getChildren().add(btn);
        btn.setLayoutX(150);
        btn.setLayoutY(250);

        btn.setStyle("-fx-background-color: #199cd4; -fx-font-size: 18px; -fx-font-family: 'Berlin Sans FB'; -fx-text-fill: #fcfeff; -fx-background-radius: 6");

        root.getChildren().add(save);
        save.setLayoutX(150);
        save.setLayoutY(300);
        save.setStyle("-fx-background-color: #199cd4; -fx-font-size: 18px; -fx-font-family: 'Berlin Sans FB'; -fx-text-fill: #fcfeff; -fx-background-radius: 6");

        root.getChildren().add(btn2);

        btn2.setLayoutX(150);
        btn2.setLayoutY(350);
        btn2.setStyle("-fx-background-color: #199cd4; -fx-font-size: 18px; -fx-font-family: 'Berlin Sans FB'; -fx-text-fill: #fcfeff; -fx-background-radius: 6");

        root.getChildren().add(exit);

        exit.setLayoutX(150);
        exit.setLayoutY(400);
        exit.setStyle("-fx-background-color: #199cd4; -fx-font-size: 18px; -fx-font-family: 'Berlin Sans FB'; -fx-text-fill: #fcfeff; -fx-background-radius: 6");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
               // System.out.println("ENTERED");

                o.start(new Stage());
                primaryStage.show();
            }
        });



        Scene scene=new Scene(root,500,500);
        primaryStage.setTitle("Switch Color");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
