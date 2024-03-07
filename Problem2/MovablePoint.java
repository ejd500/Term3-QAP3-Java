package Problem2;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // No argument constructor...
    public MovablePoint(){
        // This constructor doesn't need to do anything
        // Both xSpeed and ySpeed will already be initialized to 0.0f
    }

    public float getXSpeed(){
        return this.xSpeed;
    }
    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }

    public float getYSpeed(){
        return this.ySpeed;
    }
    public void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] xySpeed = new float[2];
        xySpeed[0] = this.xSpeed;
        xySpeed[1] = this.ySpeed;
        return xySpeed;
    }

    @Override
    public String toString(){
        return super.toString() + ",speed=(" + this.xSpeed + "," + this.ySpeed + ")";
    }

    public MovablePoint move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
