public class MovableCircle implements Movable {
   private int radius;
   private MovablePoint center=new MovablePoint(0,0,0,0);

   public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
       this.center.x=x;
       this.center.y=y;
       this.center.xSpeed=xSpeed;
       this.center.ySpeed=ySpeed;
       this.radius=radius;
   }
    @Override
    public void moveUp() {
        center.y=center.y+Math.abs(center.ySpeed);
    }

    @Override
    public void moveDown() {
        center.y=center.y-Math.abs(center.ySpeed);
    }

    @Override
    public void moveLeft() {
        center.x=center.x-Math.abs(center.xSpeed);
    }

    @Override
    public void moveRight() {
        center.x=center.x+Math.abs(center.xSpeed);
    }

    public String toString() {
        return "center coordinates: "+center.x+",  "+center.y+" .radius: "+Math.abs(radius);
    }

}
