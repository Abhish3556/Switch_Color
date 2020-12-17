package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Colorchanger extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Arc ar1 = new Arc(250, 0, 15, 15, 0, 90);
        ar1.setType(ArcType.ROUND);
        ar1.setStroke(Color.RED);
        ar1.setStrokeWidth(3);
        ar1.setFill(Color.RED);
        Arc ar2 = new Arc(250, 0, 15, 15, 90, 90);
        ar2.setType(ArcType.ROUND);
        ar2.setStroke(Color.BLUE);
        ar2.setStrokeWidth(3);
        ar2.setFill(Color.BLUE);
        Arc ar3 = new Arc(250, 0, 15, 15, 180, 90);
        ar3.setType(ArcType.ROUND);
        ar3.setStroke(Color.YELLOW);
        ar3.setStrokeWidth(3);
        ar3.setFill(Color.YELLOW);
        Arc ar4 = new Arc(250, 0, 15, 15, 270, 90);
        ar4.setType(ArcType.ROUND);
        ar4.setStroke(Color.DARKGREEN);
        ar4.setStrokeWidth(3);
        ar4.setFill(Color.DARKGREEN);
        Group smallCG1 = new Group(ar1, ar2, ar3, ar4);
        smallCG1.setTranslateY(-100);

        Arc arr1 = new Arc(250, 0, 15, 15, 0, 90);
        arr1.setType(ArcType.ROUND);
        arr1.setStroke(Color.RED);
        arr1.setStrokeWidth(3);
        arr1.setFill(Color.RED);
        Arc arr2 = new Arc(250, 0, 15, 15, 90, 90);
        arr2.setType(ArcType.ROUND);
        arr2.setStroke(Color.BLUE);
        arr2.setStrokeWidth(3);
        arr2.setFill(Color.BLUE);
        Arc arr3 = new Arc(250, 0, 15, 15, 180, 90);
        arr3.setType(ArcType.ROUND);
        arr3.setStroke(Color.YELLOW);
        arr3.setStrokeWidth(3);
        arr3.setFill(Color.YELLOW);
        Arc arr4 = new Arc(250, 0, 15, 15, 270, 90);
        arr4.setType(ArcType.ROUND);
        arr4.setStroke(Color.DARKGREEN);
        arr4.setStrokeWidth(3);
        arr4.setFill(Color.DARKGREEN);
        Group smallCG2 = new Group(arr1, arr2, arr3, arr4);
        smallCG2.setTranslateY(-100);

        Arc arrc1 = new Arc(250, 0, 15, 15, 0, 90);
        arrc1.setType(ArcType.ROUND);
        arrc1.setStroke(Color.RED);
        arrc1.setStrokeWidth(3);
        arrc1.setFill(Color.RED);
        Arc arrc2 = new Arc(250, 0, 15, 15, 90, 90);
        arrc2.setType(ArcType.ROUND);
        arrc2.setStroke(Color.BLUE);
        arrc2.setStrokeWidth(3);
        arrc2.setFill(Color.BLUE);
        Arc arrc3 = new Arc(250, 0, 15, 15, 180, 90);
        arrc3.setType(ArcType.ROUND);
        arrc3.setStroke(Color.YELLOW);
        arrc3.setStrokeWidth(3);
        arrc3.setFill(Color.YELLOW);
        Arc arrc4 = new Arc(250, 0, 15, 15, 270, 90);
        arrc4.setType(ArcType.ROUND);
        arrc4.setStroke(Color.DARKGREEN);
        arrc4.setStrokeWidth(3);
        arrc4.setFill(Color.DARKGREEN);
        Group smallCG3 = new Group(arrc1, arrc2, arrc3, arrc4);
        smallCG3.setTranslateY(-100);

    }
}
