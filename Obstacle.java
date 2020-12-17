package sample;

import javafx.animation.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;

import javafx.scene.control.Button;
import java.util.ArrayList;
import java.util.Random;

public class Obstacle extends Application {
    Circle ball = new Circle();
    boolean hitspace;
    String ball_color1;
    int sc = 0;
    int saves=0;
    int resume=0;
    Boolean load=false;
    @Override
    public void start(Stage primaryStage) {

        Button btn = new Button("New Game");
        Button btn2 = new Button("Resume Game");
        Button exit = new Button("Exit");
        Button save = new Button("Save Game");
        Obstacle o = new Obstacle();

        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Main m = new Main();
                try {
                    m.start(primaryStage);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });
        Pane root2 = new Pane();
        StackPane hold2 = new StackPane();
        Canvas canvas2 = new Canvas(500, 500);
        hold2.getChildren().add(canvas2);
        root2.getChildren().add(hold2);
        hold2.setStyle("-fx-background-color: black");
        btn.setMinSize(30, 20);

        root2.getChildren().add(btn);
        btn.setLayoutX(150);
        btn.setLayoutY(250);

        btn.setStyle("-fx-background-color: #199cd4; -fx-font-size: 18px; -fx-font-family: 'Berlin Sans FB'; -fx-text-fill: #fcfeff; -fx-background-radius: 6");

        root2.getChildren().add(save);
        save.setLayoutX(150);
        save.setLayoutY(300);
        save.setStyle("-fx-background-color: #199cd4; -fx-font-size: 18px; -fx-font-family: 'Berlin Sans FB'; -fx-text-fill: #fcfeff; -fx-background-radius: 6");

        root2.getChildren().add(btn2);

        btn2.setLayoutX(150);
        btn2.setLayoutY(350);
        btn2.setStyle("-fx-background-color: #199cd4; -fx-font-size: 18px; -fx-font-family: 'Berlin Sans FB'; -fx-text-fill: #fcfeff; -fx-background-radius: 6");

        root2.getChildren().add(exit);

        exit.setLayoutX(150);
        exit.setLayoutY(400);
        exit.setStyle("-fx-background-color: #199cd4; -fx-font-size: 18px; -fx-font-family: 'Berlin Sans FB'; -fx-text-fill: #fcfeff; -fx-background-radius: 6");


        Button r2=new Button("Resume Game Lossing 5 Points");
        Button exit2=new Button("Exit");
        exit2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Main m = new Main();
                try {
                    m.start(primaryStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Pane root3 =new Pane();
        StackPane hold3 = new StackPane();
        Canvas canvas3 = new Canvas(500,  500);
        hold3.getChildren().add(canvas3);
        root3.getChildren().add(hold3);
        hold3.setStyle("-fx-background-color: black");

        r2.setLayoutX(150);
        r2.setLayoutY(200);
        r2.setStyle("-fx-background-color: #199cd4; -fx-font-size: 18px; -fx-font-family: 'Berlin Sans FB'; -fx-text-fill: #fcfeff; -fx-background-radius: 6");
        root3.getChildren().add(r2);

        root3.getChildren().add(exit2);

        exit2.setLayoutX(150);
        exit2.setLayoutY(250);
        exit2.setStyle("-fx-background-color: #199cd4; -fx-font-size: 18px; -fx-font-family: 'Berlin Sans FB'; -fx-text-fill: #fcfeff; -fx-background-radius: 6");

        Text Score1 =new Text();
        Score1.setX(150);
        Score1.setY(50);
        Score1.setFill(Color.YELLOW);
        Score1.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR,30));
        Score1.setText("YOUR SCORE");
        Text S1=new Text();
        S1.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR,30));
        //S1.setText(String.valueOf(sc));
        S1.setY(100);
        S1.setX(200);
        S1.setFill(Color.YELLOW);

        root3.getChildren().addAll(Score1,S1);
        Scene scene4=new Scene(root3,500,500);

        ball.setTranslateX(250);
        ball.setTranslateY(400);
        ball.setRadius(8);
        ball.setFill(Color.RED);
        ball_color1 = "RED";
        Button ps = new Button("Pause");
        ps.setTranslateX(20);
        ps.setTranslateY(20);
        ps.setStyle("-fx-background-color: #199cd4; -fx-font-size: 18px; -fx-font-family: 'Berlin Sans FB'; -fx-text-fill: #fcfeff; -fx-background-radius: 6");
        // pause p=new pause();

        Pane root = new Pane();
        StackPane hold = new StackPane();
        Canvas canvas = new Canvas(500, 500);
        hold.getChildren().add(canvas);
        root.getChildren().add(hold);

        hold.setStyle("-fx-background-color: black");

        Text Score = new Text();
        Score.setX(350);
        Score.setY(50);
        Score.setFill(Color.YELLOW);
        Score.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 30));
        Score.setText("SCORE");
        Text S = new Text();
        S.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 30));
        S.setText(String.valueOf(sc));
        S.setY(100);
        S.setX(400);
        S.setFill(Color.YELLOW);
        S.setText(String.valueOf(sc));


        final Line[] line1 = {new Line(200, -50, 300, -50)}; //Line(startX,startY,endX,endY)
        line1[0].setStroke(Color.RED);
        line1[0].setStrokeWidth(10);

        final Line[] line2 = {new Line(200, 50, 300, 50)};
        line2[0].setStroke(Color.YELLOW);
        line2[0].setStrokeWidth(10);

        Line line3 = new Line(200, -50, 200, 50);
        line3.setStroke(Color.DARKGREEN);
        line3.setStrokeWidth(10);


        Line line4 = new Line(300, -50, 300, 50);
        line4.setStroke(Color.BLUE);
        line4.setStrokeWidth(10);

        Group rect = new Group(line1[0], line2[0], line3, line4);


        Arc arc1 = new Arc(250, 0, 70, 70, 0, 90);
        arc1.setType(ArcType.OPEN);
        arc1.setStroke(Color.RED);
        arc1.setStrokeWidth(10);
        arc1.setFill(Color.TRANSPARENT);
        Arc arc2 = new Arc(250, 0, 70, 70, 90, 90);
        arc2.setType(ArcType.OPEN);
        arc2.setStroke(Color.BLUE);
        arc2.setStrokeWidth(10);
        arc2.setFill(Color.TRANSPARENT);
        Arc arc3 = new Arc(250, 0, 70, 70, 180, 90);
        arc3.setType(ArcType.OPEN);
        arc3.setStroke(Color.YELLOW);
        arc3.setStrokeWidth(10);
        arc3.setFill(Color.TRANSPARENT);
        Arc arc4 = new Arc(250, 0, 70, 70, 270, 90);
        arc4.setType(ArcType.OPEN);
        arc4.setStroke(Color.DARKGREEN);
        arc4.setStrokeWidth(10);
        arc4.setFill(Color.TRANSPARENT);

        Group Circle = new Group(arc1, arc2, arc3, arc4);

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

        Line lt1 = new Line(200, 0, 200, 60);
        lt1.setStroke(Color.RED);
        lt1.setStrokeWidth(10);

        Line lt2 = new Line(200, -60, 200, 0);
        lt2.setStroke(Color.BLUE);
        lt2.setStrokeWidth(10);

        Line lt3 = new Line(200, 0, 260, 0);
        lt3.setStroke(Color.DARKGREEN);
        lt3.setStrokeWidth(10);

        Line lt4 = new Line(200, 0, 140, 0);
        lt4.setStroke(Color.YELLOW);
        lt4.setStrokeWidth(10);

        Group plus = new Group(lt1, lt2, lt3, lt4);

        Rectangle star1 = new Rectangle();
        star1.setFill(Color.GRAY);
        star1.setX(235);
        star1.setY(-20);
        star1.setWidth(30);
        star1.setHeight(30);
        star1.setRotate(127);
        Rectangle starp2 = new Rectangle();
        starp2.setFill(Color.GRAY);
        starp2.setX(235);
        starp2.setY(-20);
        starp2.setWidth(30);
        starp2.setHeight(30);
        Group star11 = new Group(star1, starp2);


        Rectangle star2 = new Rectangle();
        star2.setFill(Color.GRAY);
        star2.setX(235);
        star2.setY(-20);
        star2.setWidth(30);
        star2.setHeight(30);
        star2.setRotate(127);
        Rectangle starr2 = new Rectangle();
        starr2.setFill(Color.GRAY);
        starr2.setX(235);
        starr2.setY(-20);
        starr2.setWidth(30);
        starr2.setHeight(30);
        Group star12 = new Group(star2, starr2);

        ArrayList<Group> Arr = new ArrayList<>();
        Arr.add(rect);//0
        Arr.add(smallCG1);//1
        Arr.add(Circle);//2
        Arr.add(smallCG2);//3
        Arr.add(plus);//4
        Arr.add(smallCG3);//5
        Arr.add(star11);//6
        Arr.add(star12);//7
        Arr.get(0).setTranslateY(200);
        Arr.get(6).setTranslateY(200);
        Arr.get(1).setTranslateY(50);
        Arr.get(2).setTranslateY(-150);
        Arr.get(7).setTranslateY(-150);
        Arr.get(3).setTranslateY(-300);
        Arr.get(4).setTranslateY(-450);
        Arr.get(5).setTranslateY(-600);

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
                if ((Arr.get(0).getTranslateY() == 250 || Arr.get(2).getTranslateY() == 250 || Arr.get(4).getTranslateY() == 250)
                        && ball.getTranslateY() > 200) {

                    if (Arr.get(4).getTranslateY() > 250) {
                        Arr.get(4).setTranslateY(Arr.get(4).getTranslateY() + 1);

                    }
                    if (Arr.get(0).getTranslateY() > 250) {
                        Arr.get(0).setTranslateY(Arr.get(0).getTranslateY() + 1);
                        Arr.get(6).setTranslateY(Arr.get(6).getTranslateY() + 1);
                    }
                    if (Arr.get(2).getTranslateY() > 250) {
                        Arr.get(2).setTranslateY(Arr.get(2).getTranslateY() + 1);
                        Arr.get(7).setTranslateY(Arr.get(7).getTranslateY() + 1);
                    }
                } else {
                    Arr.get(0).setTranslateY(Arr.get(0).getTranslateY() + 1);
                    Arr.get(1).setTranslateY(Arr.get(1).getTranslateY() + 1);
                    Arr.get(2).setTranslateY(Arr.get(2).getTranslateY() + 1);
                    Arr.get(3).setTranslateY(Arr.get(3).getTranslateY() + 1);
                    Arr.get(4).setTranslateY(Arr.get(4).getTranslateY() + 1);
                    Arr.get(5).setTranslateY(Arr.get(5).getTranslateY() + 1);
                    Arr.get(6).setTranslateY(Arr.get(6).getTranslateY() + 1);
                    Arr.get(7).setTranslateY(Arr.get(7).getTranslateY() + 1);

                }
                Arr.get(0).setRotate(Arr.get(0).getRotate() + 1);
                Arr.get(1).setRotate(Arr.get(1).getRotate() + 1);
                Arr.get(2).setRotate(Arr.get(2).getRotate() + 1);
                Arr.get(3).setRotate(Arr.get(3).getRotate() + 1);
                Arr.get(4).setRotate(Arr.get(4).getRotate() + 1);
                Arr.get(5).setRotate(Arr.get(5).getRotate() + 1);

                if (ball.getTranslateY() <= Arr.get(2).getTranslateY() + 80 &&
                        ball.getTranslateY() >= Arr.get(2).getTranslateY() + 70) {
                    int u = (((int) Arr.get(2).getRotate() - 1) % 360) + 1;

                    int a = check1(u, ball_color1);
                    //  System.out.println(a+"   "+u+" "+ball_color1);
                    if (a == 0)
                    {S1.setText(String.valueOf(sc));
                        //System.out.println(sc);

                        this.stop();
                        primaryStage.setScene(scene4);
                        ball.setTranslateY(Arr.get(2).getTranslateY()+180);
                        primaryStage.show();;
                    }}
                if (ball.getTranslateY() <= Arr.get(2).getTranslateY() - 70 &&
                        ball.getTranslateY() >= Arr.get(2).getTranslateY() - 80) {
                    int u = (((int) Arr.get(2).getRotate() - 1 + 180) % 360) + 1;

                    int a = check1(u, ball_color1);
                    //System.out.println(a+"   "+u+" "+ball_color1);
                    if (a == 0)
                    {S1.setText(String.valueOf(sc));
                        //System.out.println(sc);
                        this.stop();
                        primaryStage.setScene(scene4);
                        ball.setTranslateY(Arr.get(2).getTranslateY()-180);
                        primaryStage.show();;
                    }
                }

                if (ball.getTranslateY() <= Arr.get(0).getTranslateY() + 60 &&
                        ball.getTranslateY() >= Arr.get(0).getTranslateY() + 50) {
                    //System.out.println(ball.getTranslateY()+" "+Arr.get(0).getTranslateY()+50);
                    int u = (((int) Arr.get(0).getRotate() - 1) % 360) + 1;

                    int a = check2(u, ball_color1);
                    // System.out.println(a+"   "+u+" "+ball_color1);
                    if (a == 0)
                    {S1.setText(String.valueOf(sc));
                        // System.out.println(sc);
                        this.stop();
                        primaryStage.setScene(scene4);
                        ball.setTranslateY(Arr.get(0).getTranslateY()+130);
                        primaryStage.show();;
                    }
                }

                if (ball.getTranslateY() <= Arr.get(0).getTranslateY() - 50 &&
                        ball.getTranslateY() >= Arr.get(0).getTranslateY() - 60) {
                    // System.out.println(ball.getTranslateY()+" "+Arr.get(0).getTranslateY()+50);
                    int u = (((int) Arr.get(0).getRotate() - 1 + 180) % 360) + 1;

                    int a = check2(u, ball_color1);
                    //System.out.println(a+"   "+u+" "+ball_color1);
                    if (a == 0)
                    {   S1.setText(String.valueOf(sc));
                        //System.out.println(sc);
                        this.stop();
                        primaryStage.setScene(scene4);
                        ball.setTranslateY(Arr.get(0).getTranslateY()-130);
                        primaryStage.show();;
                    }
                }
                if (ball.getTranslateY() >= Arr.get(4).getTranslateY() - 5 &&
                        ball.getTranslateY() <= Arr.get(4).getTranslateY() + 5) {
                    //System.out.println(ball.getTranslateY()+" "+Arr.get(0).getTranslateY()+50);
                    int u = (((int) Arr.get(4).getRotate() - 1) % 360) + 1;
                    //System.out.println(Arr.get(4).getTranslateY()+" "+ball.getTranslateY());
                    int a = check3(u, ball_color1);
                    //System.out.println(a+"  Plus "+u+" "+ball_color1);
                    if (a == 0)
                    {   S1.setText(String.valueOf(sc));
                        // System.out.println(sc);
                        this.stop();
                        primaryStage.setScene(scene4);
                        ball.setTranslateY(Arr.get(4).getTranslateY()+100);
                        primaryStage.show();;
                    }
                }

                String[] str = new String[4];
                str[0] = "RED";
                str[1] = "YELLOW";
                str[2] = "BLUE";
                str[3] = "DARKGREEN";
                Random r = new Random();
                int index = r.nextInt(4);
                String ball_color = str[index];

                if (ball.getTranslateY() <= Arr.get(1).getTranslateY() + 10 && Arr.get(1).isVisible()) {
                    ball.setFill(Paint.valueOf(ball_color));
                    ball_color1 = ball_color;
                    Arr.get(1).setVisible(false);
                }
                if (ball.getTranslateY() <= Arr.get(3).getTranslateY() + 10 && Arr.get(3).isVisible()) {
                    ball.setFill(Paint.valueOf(ball_color));
                    ball_color1 = ball_color;
                    Arr.get(3).setVisible(false);
                }
                if (ball.getTranslateY() <= Arr.get(5).getTranslateY() + 10 && Arr.get(5).isVisible()) {
                    ball.setFill(Paint.valueOf(ball_color));
                    ball_color1 = ball_color;
                    Arr.get(5).setVisible(false);
                }


                if (ball.getTranslateY() <= Arr.get(6).getTranslateY() + 10 && Arr.get(6).isVisible()) {
                    Arr.get(6).setVisible(false);
                    sc += 1;
                    S.setText(String.valueOf(sc));
                }

                if (ball.getTranslateY() <= Arr.get(7).getTranslateY() + 10 && Arr.get(7).isVisible()) {
                    Arr.get(7).setVisible(false);
                    sc += 1;
                    S.setText(String.valueOf(sc));
                }
                if (Arr.get(0).getTranslateY() > 550) {
                    Arr.get(0).setTranslateY(-450);
                }

                if (Arr.get(1).getTranslateY() > 550) {
                    Arr.get(1).setVisible(true);
                    Arr.get(1).setTranslateY(-450);
                }

                if (Arr.get(2).getTranslateY() > 550) {
                    Arr.get(2).setTranslateY(-450);
                }
                if (Arr.get(3).getTranslateY() > 550) {
                    Arr.get(3).setVisible(true);
                    Arr.get(3).setTranslateY(-450);
                }

                if (Arr.get(4).getTranslateY() > 550) {
                    Arr.get(4).setTranslateY(-450);
                }
                if (Arr.get(5).getTranslateY() > 550) {
                    Arr.get(5).setVisible(true);
                    Arr.get(5).setTranslateY(-450);
                }

                if (Arr.get(6).getTranslateY() > 550) {
                    Arr.get(6).setVisible(true);
                    Arr.get(6).setTranslateY(-450);
                }

                if (Arr.get(7).getTranslateY() > 550) {
                    Arr.get(7).setVisible(true);
                    Arr.get(7).setTranslateY(-450);
                }
                int curx = (int) ball.getTranslateY();
                int cury = (int) ball.getTranslateY();

                v += g * 0.5 * Math.pow(myTime, 2);
                int dy = (int) v;
                int newy = cury + dy;

                if (ball.getTranslateY() > 550) {

                    this.stop();
                    //System.exit(0);
                    primaryStage.setScene(scene4);
                    primaryStage.show();
                }
                if (hitspace) {
                    v = -3.5;
                    myTime = .13;
                    hitspace = false;
                }
                ball.setTranslateY(newy);

                previousV = v;
                if (sc < 5)
                    myTime += .001;
                else
                    myTime += .003;
            }
        };
        timer.start();


        root.getChildren().addAll(ps, S, plus, rect, Circle, ball,
                smallCG1, smallCG2, smallCG3, star11, star12, Score);
        Scene scene = new Scene(root, 500, 500, Color.GRAY);
        primaryStage.setScene(scene);
        primaryStage.show();
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            //CONDITION TO JUMP BALL
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.W) {
                    hitspace = true;
                }
            }
        });



        Scene scene2=new Scene(root2,500,500, Color.GRAY);
        //Scene scene3=new Scene(root,500,500,Color.GRAY);


        //PAUSE BUTTON
        ps.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                timer.stop();
                primaryStage.setScene(scene2);
                primaryStage.show();
            }
        });


        //NEW GAME BUTTON
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


        //RESUME BUTTON
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //System.out.println("ENTERED");
                timer.start();
                primaryStage.setScene(scene);
                primaryStage.show();
            }
        });
        //RESUME 2
        r2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(sc>=5) {
                    //System.out.println("ENTERED");

                    //  System.out.println(ball.getTranslateY());
                    primaryStage.setScene(scene);
                    primaryStage.show();
                    sc -= 5;
                    S.setText(String.valueOf(sc));
                    S1.setText(String.valueOf(sc));
                    timer.start();
                }
                else
                {
                    Main m=new Main();
                    try {
                        m.start(primaryStage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent){
                int cur_ball_y= (int) ball.getTranslateY();
                String cur_ball_clr=ball_color1;
                int cur_circle_pos=(int) Arr.get(2).getTranslateY();
                int cur_circle_angle=(int) Arr.get(2).getRotate();
                int cur_lines_pos=(int) Arr.get(4).getTranslateY();
                int cur_lines_angle=(int) Arr.get(4).getRotate();
                int cur_rect_angle=(int) Arr.get(0).getRotate();
                int cur_rect_pos=(int) Arr.get(0).getTranslateY();
                int cur_star_pos1=(int) Arr.get(6).getTranslateY();
                int cur_star_pos2=(int) Arr.get(7).getTranslateY();
                int cur_clr_btn1=(int) Arr.get(1).getTranslateY() ;
                int clr_btn_rot1=(int) Arr.get(1).getRotate();
                int cur_clr_btn2=(int) Arr.get(3).getTranslateY() ;
                int clr_btn_rot2=(int) Arr.get(3).getRotate();
                int cur_clr_btn3=(int) Arr.get(5).getTranslateY() ;
                int clr_btn_rot3=(int) Arr.get(5).getRotate();

                int points=sc;
                Boolean bstar1=Arr.get(6).isVisible();
                Boolean bstar2=Arr.get(7).isVisible();

                Boolean bclr1=Arr.get(1).isVisible();
                Boolean bclr2=Arr.get(3).isVisible();
                Boolean bclr3=Arr.get(5).isVisible();
                Positionclr pc=new Positionclr();

                pc.setBall_Y(cur_ball_y);
                pc.setCircle_angle(cur_circle_angle);
                pc.setCircle_pos(cur_circle_pos);
                pc.setLines_angle(cur_lines_angle);
                pc.setLines_pos(cur_lines_pos);
                pc.setRect_angle(cur_rect_angle);
                pc.setRect_pos(cur_rect_pos);
                pc.setStar1(cur_star_pos1);
                pc.setStar2(cur_star_pos2);
                pc.setClrbtn1_ang(clr_btn_rot1);
                pc.setClrbtn1_pos(cur_clr_btn1);
                pc.setClrbtn2_ang(clr_btn_rot2);
                pc.setClrbtn2_pos(cur_clr_btn2);
                pc.setClrbtn3_ang(clr_btn_rot3);
                pc.setClrbtn3_pos(cur_clr_btn3);
                pc.setPoint(sc);
                pc.setBst1(bstar1);
                pc.setBst2(bstar2);
                pc.setBcl1(bclr1);
                pc.setBcl2(bclr2);
                pc.setBcl3(bclr3);
                Posclr p=new Posclr();
                p.save(pc);
                Main m=new Main();
                try {
                    m.start(primaryStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }

        });

        if(load)
        {
            Posclr p = new Posclr();
            Positionclr ps2=new Positionclr();
            ps2=p.load();
            ball.setTranslateY(ps2.Ball_Y);
            Arr.get(2).setTranslateY(ps2.circle_pos);
            Arr.get(2).setRotate(ps2.circle_angle);
            Arr.get(0).setTranslateY(ps2.rect_pos);
            Arr.get(0).setRotate(ps2.rect_angle);
            Arr.get(4).setTranslateY(ps2.lines_pos);
            Arr.get(4).setRotate(ps2.lines_angle);
            sc = ps2.Point;
            S.setText(String.valueOf(sc));

            Arr.get(1).setTranslateY(ps2.clrbtn1_pos);
            Arr.get(1).setRotate(ps2.clrbtn1_ang);
            Arr.get(3).setTranslateY(ps2.clrbtn2_pos);
            Arr.get(3).setRotate(ps2.clrbtn2_ang);
            Arr.get(5).setTranslateY(ps2.clrbtn3_pos);
            Arr.get(5).setRotate(ps2.clrbtn3_ang);
            Arr.get(6).setTranslateY(ps2.star1);
            Arr.get(7).setTranslateY(ps2.star2);
            Arr.get(6).setVisible(ps2.bst1);
            Arr.get(7).setVisible(ps2.bst2);
            Arr.get(1).setVisible(ps2.bcl1);
            Arr.get(3).setVisible(ps2.bcl2);
            Arr.get(5).setVisible(ps2.bcl3);
            primaryStage.setScene(scene);
            primaryStage.show();
            load=false;

        }


    }
    /*  public void loading() {
          load=true;
          Stage primaryStage=new Stage();
          start(primaryStage);
      }*/
    public int check1(int angle, String ball_color) {
        if (ball_color.equals("DARKGREEN") && (angle > 0 && angle < 90)) {
            return 1;
        } else if (ball_color.equals("RED") && angle > 90 && angle < 180)
            return 1;

        else if (ball_color.equals("BLUE") && angle > 180 && angle < 270)
            return 1;

        else if (ball_color.equals("YELLOW") && angle > 270 && angle < 360)
            return 1;
        else
            return 0;
    }


    public int check2(int angle, String ball_color) {
        if (ball_color.equals("BLUE") && (angle > 45 && angle < 135)) {
            return 1;
        } else if (ball_color.equals("RED") && angle > 135 && angle < 225)
            return 1;

        else if (ball_color.equals("DARKGREEN") && angle > 225 && angle < 315)
            return 1;

        else if (ball_color.equals("YELLOW") && angle > 315 || angle < 45)
            return 1;
        else
            return 0;
    }



    public int check3(int angle, String ball_color) {
        if (ball_color.equals("DARKGREEN") && (angle > 315 || angle < 45)) {
            return 1;
        } else if (ball_color.equals("BLUE") && angle > 45 && angle < 135)
            return 1;

        else if (ball_color.equals("YELLOW") && angle > 135 && angle < 225)
            return 1;

        else if (ball_color.equals("RED") && angle > 225 && angle < 315)
            return 1;
        else
            return 0;
    }


    public static void main(String args[])
    {
        launch(args);
    }
}