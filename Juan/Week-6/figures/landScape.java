
/**
 * Write a description of class landScape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class landScape
{
    public void landScape()
    {
        Person c4 = new Person(); 
       c4.makeVisible(); 
       c4.moveLeft(); 
       c4.moveLeft(); 
       c4.moveUp();
       c4.slowMoveVertical(5);
       
       Person c3 = new Person(); 
       c3.makeVisible(); 
       c3.changeSize(50,25);
       
       Circle c2 = new Circle(); 
       c2.makeVisible(); 
       c2.changeColor("green");
       c2.changeSize(1000);
       c2.moveVertical(125);
       c2.moveHorizontal(-500);
       
       Circle c1 = new Circle(); 
       c1. makeVisible(); 
       c1.changeColor("yellow");
       c1.moveHorizontal(125);
       c1.changeSize(50);
       c1.moveVertical(25);
       
      
    }
}
