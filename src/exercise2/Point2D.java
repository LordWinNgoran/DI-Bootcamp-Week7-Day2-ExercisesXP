//Exercise 2 : Implement The Points Classes
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Write UML Point3D, Point2D
* date: 08/02/2023
*/

package exercise2;

public class Point2D {

    
    private float x = 0.0f;
    private float y = 0.0f;
    
    public Point2D() {
        super();
    }
    
    public Point2D(float x, float y) {
        super();
        this.x = x;
        this.y = y;
    }
    
    public float getX() {
        return this.x;
    }
    
    public void setX(float x) {
        this.x = x;
    }
    
    public float getY() {
        return this.y;
    }
    
    public void setY(float y) {
        this.y = y;
    }
    
    public void setXY(float x, float y) {
        this.setX(x);
        this.setY(y);
    }
    
    /*public float[] getXY() {
        float[] tabFloat = {this.x, this.y}; 
        return tabFloat;
    }*/
    
    
    /*public float[] getXY() {
        return new float[] {this.x, this.y};
    }*/
    
    public float[] getXY() {
        float[] tabFloat = new float[2];
        tabFloat[0] = this.x;
        tabFloat[1] = this.y;
        return tabFloat;
    }
    
    @Override
    public String toString() {
        return "("+this.x+","+this.y+")";
    }
    
}