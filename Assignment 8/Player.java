public class Player {
    //Our first class is the player class
    //in our player class we are going to have attributes of a box
    //Width, Height,X position, Y position: These are private integer variables
    private int width;
    private int height;
    private int xPosition;
    private int yPosition;
    //Next there is going to be the methods for the behaviors
    //There is going to be four getters methods for the attributes
    void player(int width,int height,int xPosition,int yPosition){
        this.width=width;
        this.height=height;
        this.xPosition=xPosition;
        this.yPosition=yPosition;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public int getXPosition() {
        return xPosition;
    }
    public int getYPosition() {
        return yPosition;
    }
    //There is going to be had three methods
    //the first is MoveHorizontal(this is going to take in the x value)
    void MoveHorizontal(int x_delta){
        xPosition= (x_delta+xPosition);
    }
    //the second is MoveVertical(this is going to take in the y values)
    void MoveVertical(int y_delta){
        yPosition=(y_delta+yPosition);
    }
    //the third is DidTheyCollide(compare players) then print We collided!
    boolean DidTheyCollide(Player otherPlayer){
        if(this.xPosition<(otherPlayer.width+ otherPlayer.xPosition) &&
           (this.width+this.xPosition)> otherPlayer.xPosition &&
            this.yPosition<(otherPlayer.height+ otherPlayer.yPosition) &&
                (this.height+ this.yPosition)> otherPlayer.yPosition){
            System.out.println("They collided!");
        return true;
        }
        return false;
    }
}
