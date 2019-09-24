
/**
 * Write a description of class House here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class House
{
   public void House() 
   { 
      Square c5 = new Square(); 
      c5.makeVisible(); 
      c5.changeSize(150); 
      c5.moveHorizontal(-250);
      Square c4 = new Square(); 
      c4.makeVisible(); 
      c4.changeColor("black"); 
      c4.changeSize(45);
      c4.moveHorizontal(-225);
      c4.moveVertical(30);
      Triangle c3 = new Triangle(); 
      c3.makeVisible(); 
      c3.changeColor("green");
      c3.changeSize(90,275);
      c3.moveVertical(-85);
      c3.moveHorizontal(-70);
      Circle c2 = new Circle(); 
      c2.makeVisible(); 
      c2.changeColor("yellow");
      c2.changeSize(100);
      c2.moveHorizontal(70);
      c2.moveVertical(-30);
      
      
      
    }
}
