package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.util.Duration;

import java.io.Serializable;
import java.nio.file.Paths;

public class Main extends Application implements Serializable {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane root =new Pane();
        Pane root1=new Pane();
        Button btn=new Button("New Game");
        Button btn2=new Button("Load Game");
        Button exit=new Button("Exit");
        Obstacle o=new Obstacle();

        exit.setOnAction(e->System.exit(0));

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Obstacle o = new Obstacle();
                try {
                    o.start(primaryStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            Games g=new Games();
            @Override
            public void handle(ActionEvent actionEvent) {

                try {
                    g.start(primaryStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        StackPane hold = new StackPane();
        Canvas canvas = new Canvas(500,  500);
        hold.getChildren().add(canvas);
        root.getChildren().add(hold);
        hold.setStyle("-fx-background-color: black");

        Text text1 = new Text();

        text1.setX(180);
        text1.setY(75);
        text1.setFont(Font.font("Abyssinica SIL", FontWeight.BOLD, FontPosture.REGULAR,50));
        text1.setText("COLOR");
        text1.setFill(Color.GREENYELLOW);
        root.getChildren().add(text1);

        Text text = new Text();
        text.setX(175);
        text.setY(125);
        text.setFont(Font.font("Abyssinica SIL", FontWeight.BOLD, FontPosture.REGULAR,50));
        text.setText("SWITCH");
        text.setFill(Color.GREENYELLOW);
        root.getChildren().add(text);

            Arc arc1 = new Arc(250, 200, 50, 50, 0, 90);
            arc1.setType(ArcType.OPEN);
            arc1.setStroke(Color.RED);
            arc1.setStrokeWidth(8);
            arc1.setFill(Color.TRANSPARENT);
            Arc arc2 = new Arc(250, 200, 50, 50, 90, 90);
            arc2.setType(ArcType.OPEN);
            arc2.setStroke(Color.BLUE);
            arc2.setStrokeWidth(8);
            arc2.setFill(Color.TRANSPARENT);
            Arc arc3 = new Arc(250, 200, 50, 50, 180, 90);
            arc3.setType(ArcType.OPEN);
            arc3.setStroke(Color.YELLOW);
            arc3.setStrokeWidth(8);
            arc3.setFill(Color.TRANSPARENT);
            Arc arc4 = new Arc(250, 200, 50, 50, 270, 90);
            arc4.setType(ArcType.OPEN);
            arc4.setStroke(Color.DARKGREEN);
            arc4.setStrokeWidth(8);
            arc4.setFill(Color.TRANSPARENT);

        KeyValue kv = new KeyValue(arc1.startAngleProperty(), 360);
        KeyFrame kf = new KeyFrame(Duration.seconds(2), kv);
        Timeline timeline = new Timeline();
        timeline.setAutoReverse(false);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().add(kf);
        KeyValue kv2 = new KeyValue(arc2.startAngleProperty(), 450);
        KeyFrame kf2 = new KeyFrame(Duration.seconds(2), kv2);
        timeline.setAutoReverse(false);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().add(kf2);
        KeyValue kv3 = new KeyValue(arc3.startAngleProperty(), 540);
        KeyFrame kf3 = new KeyFrame(Duration.seconds(2), kv3);
        timeline.setAutoReverse(false);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().add(kf3);
        KeyValue kv4 = new KeyValue(arc4.startAngleProperty(), 630);
        KeyFrame kf4 = new KeyFrame(Duration.seconds(2), kv4);
        timeline.setAutoReverse(false);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().add(kf4);
        timeline.play();

        root.getChildren().add(arc1);
        root.getChildren().add(arc2);
        root.getChildren().add(arc3);
        root.getChildren().add(arc4);
        btn.setMinSize(30,20);
        root.getChildren().add(btn);
        btn.setLayoutX(200);
        btn.setLayoutY(300);
        btn.setStyle("-fx-background-color: #199cd4; -fx-font-size: 18px; -fx-font-family: 'Berlin Sans FB'; -fx-text-fill: #fcfeff; -fx-background-radius: 6");
        root.getChildren().add(btn2);
        btn2.setLayoutX(200);
        btn2.setLayoutY(350);
        btn2.setStyle("-fx-background-color: #199cd4; -fx-font-size: 18px; -fx-font-family: 'Berlin Sans FB'; -fx-text-fill: #fcfeff; -fx-background-radius: 6");
        root.getChildren().add(exit);
        exit.setLayoutX(200);
        exit.setLayoutY(400);
        exit.setStyle("-fx-background-color: #199cd4; -fx-font-size: 18px; -fx-font-family: 'Berlin Sans FB'; -fx-text-fill: #fcfeff; -fx-background-radius: 6");

        AudioClip sound = new AudioClip(Paths.get("C:/Users/ADMIN/IdeaProjects/MajorProject/src/sample/music1.mp3").toUri().toString());
        sound.setCycleCount(Integer.MAX_VALUE);
        sound.play();


        Scene scene=new Scene(root,500,500);
        primaryStage.setTitle("Switch Color");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
