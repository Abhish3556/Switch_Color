package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Posclr {
    //Implementing serialization
    //Game 1
    public void save(Positionclr obj)
    { try{
        File f=new File("C:\\Users\\ADMIN\\IdeaProjects\\MajorProject\\src\\sample\\savefile.txt");
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj);}
    catch(Exception e)
    {
        e.printStackTrace();
    }
    }
    public Positionclr load() {
        try{
            File f=new File("C:\\Users\\ADMIN\\IdeaProjects\\MajorProject\\src\\sample\\savefile.txt");
            FileInputStream fis=new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fis);
            Positionclr str=(Positionclr) ois.readObject();
            return str;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }



    public static void main(String[] args) throws Exception {
    }
}

class Positionclr extends Posclr implements Serializable  {

    public int Ball_Y;
    //public String Ball_clr;
    public int circle_pos;
    public int circle_angle;
    public int rect_pos;
    public int rect_angle;
    public int lines_pos;
    public int lines_angle;
    public int Point;
    public int star1;
    public int star2;
    public int clrbtn1_pos;
    public int clrbtn2_pos;
    public int clrbtn3_pos;
    public int clrbtn1_ang;
    public int clrbtn2_ang;
    public int clrbtn3_ang;
    public boolean bst1;
    public boolean bst2;
    public boolean bcl1;
    public boolean bcl2;
    public boolean bcl3;
    public  Positionclr()
    {
        circle_angle=0;
        circle_pos=0;
        rect_angle=0;
        rect_pos=0;
        lines_angle=0;
        lines_pos=0;
        Ball_Y=0;
        Point=0;
        star1=0;
        star2=0;
        clrbtn1_ang=0;
        clrbtn1_pos=0;
        clrbtn2_ang=0;
        clrbtn2_pos=0;
        clrbtn3_ang=0;
        clrbtn3_pos=0;
        bst1=true;
        bst2=true;
        bcl1=true;
        bcl2=true;
        bcl3=true;
    }

    // Positionclr newp=new Positionclr();

    public void setBall_Y(int ball_Y) {
        Ball_Y = ball_Y;
    }

    public void setCircle_pos(int circle_pos) {
        this.circle_pos = circle_pos;
    }

    public void setCircle_angle(int circle_angle) {
        this.circle_angle = circle_angle;
    }

    public void setRect_pos(int rect_pos) {
        this.rect_pos = rect_pos;
    }

    public void setRect_angle(int rect_angle) {
        this.rect_angle = rect_angle;
    }

    public void setLines_pos(int lines_pos) {
        this.lines_pos = lines_pos;
    }

    public void setLines_angle(int lines_angle) {
        this.lines_angle = lines_angle;
    }

    public int getPoint() {
        return Point;
    }

    public void setPoint(int point) {
        Point = point;
    }

    public void setBst1(boolean bst1) {
        this.bst1 = bst1;
    }

    public void setBst2(boolean bst2) {
        this.bst2 = bst2;
    }

    public void setBcl1(boolean bcl1) {
        this.bcl1 = bcl1;
    }

    public void setBcl2(boolean bcl2) {
        this.bcl2 = bcl2;
    }

    public void setBcl3(boolean bcl3) {
        this.bcl3 = bcl3;
    }

    public int getStar1() {
        return star1;
    }

    public void setStar1(int star1) {
        this.star1 = star1;
    }

    public int getStar2() {
        return star2;
    }

    public void setStar2(int star2) {
        this.star2 = star2;
    }

    public int getClrbtn1_pos() {
        return clrbtn1_pos;
    }

    public void setClrbtn1_pos(int clrbtn1_pos) {
        this.clrbtn1_pos = clrbtn1_pos;
    }

    public int getClrbtn2_pos() {
        return clrbtn2_pos;
    }

    public void setClrbtn2_pos(int clrbtn2_pos) {
        this.clrbtn2_pos = clrbtn2_pos;
    }

    public int getClrbtn3_pos() {
        return clrbtn3_pos;
    }

    public void setClrbtn3_pos(int clrbtn3_pos) {
        this.clrbtn3_pos = clrbtn3_pos;
    }

    public int getClrbtn1_ang() {
        return clrbtn1_ang;
    }

    public void setClrbtn1_ang(int clrbtn1_ang) {
        this.clrbtn1_ang = clrbtn1_ang;
    }

    public int getClrbtn2_ang() {
        return clrbtn2_ang;
    }

    public void setClrbtn2_ang(int clrbtn2_ang) {
        this.clrbtn2_ang = clrbtn2_ang;
    }

    public int getClrbtn3_ang() {
        return clrbtn3_ang;
    }

    public void setClrbtn3_ang(int clrbtn3_ang) {
        this.clrbtn3_ang = clrbtn3_ang;
    }

    public int getBall_Y() {
        return Ball_Y;
    }

    public int getCircle_pos() {
        return circle_pos;
    }

    public int getCircle_angle() {
        return circle_angle;
    }

    public int getRect_pos() {
        return rect_pos;
    }

    public int getRect_angle() {
        return rect_angle;
    }

    public int getLines_pos() {
        return lines_pos;
    }

    public int getLines_angle() {
        return lines_angle;
    }
}