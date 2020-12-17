package sample;
import javafx.animation.*;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.Color;
public class Ball extends Application {
    Circle elps = new Circle();
    int saves=0;
    boolean hitspace;
    Scene scene2;
    @Override
    public void start(Stage primaryStage) throws Exception {
       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Creating Ball");
        Group grp = new Group();
        elps.setCenterX(200);
        elps.setCenterY(100);
        elps.setRadius(20);
        elps.setFill(Color.RED);
        grp.getChildren().addAll(elps);
        scene2 = new Scene(grp, 500, 500, Color.BLACK);
        primaryStage.setScene(scene2);
        primaryStage.show();
        scene2.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.SPACE) {
                    hitspace = true;
                }
            }
        });
        AnimationTimer timer = new AnimationTimer() {
            double myTime = 0.0;
            int dir = 1;
            double v = 0;
            double damp = 0.7;
            double g = 15.8;
            double previousV = 0;
            int counter = 0;
            @Override
            public void handle(long arg0) {
                counter++;
                double curx = elps.getCenterX();
                double cury = elps.getCenterY(); v += g * 0.5 * Math.pow(myTime, 2);
                double dy = v;
                double newy = cury + dy;
                if (hitspace) { v = -3.5;
                    myTime = .13;
                    hitspace = false;
                }
                elps.setCenterY(newy);
                previousV = v;
                myTime += .001;
            }
        };
        timer.start();
    }
    public static void main(String[] args) {
        launch(args);
    }
}