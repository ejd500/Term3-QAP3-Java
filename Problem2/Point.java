package Problem2;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    // No argument constructor...
    public Point(){
        // This constructor doesn't need to do anything
        // Both x and y will already be initialized to 0.0f
    }

    public float getX(){
        return this.x;
    }
    public void setX(float x){
        this.x = x;
    }

    public float getY(){
        return this.y;
    }
    public void setY(float y){
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] coordinates = new float[2];
        coordinates[0] = this.x;
        coordinates[1] = this.y;
        return coordinates;
    }

    public String toString(){
        return ("("+this.x+","+this.y+")");
    }
}
