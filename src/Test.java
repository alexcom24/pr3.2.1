
public class Test {
    public static void main(String[] args) {
        MovablePoint s=new MovablePoint(2,3,4,-2);
        MovableCircle c=new MovableCircle(2,3,4,-2,-6);
        s.moveDown();
        s.moveLeft();
        c.moveRight();
        c.moveUp();
       System.out.println(s);
       System.out.println(c);
    }
}
