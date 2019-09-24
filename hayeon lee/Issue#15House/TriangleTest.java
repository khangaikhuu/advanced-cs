
import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TriangleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TriangleTest
{
    @Test
    public void testMySquare()
    {
       Square sq = new Square();
       sq.makeVisible();
       sq.moveRight();
       SquareTwo sqt = new SquareTwo();
       sqt.makeVisible();
       sqt.moveRight();
       sqt.moveDown();
       Triangle tr = new Triangle();
       tr.makeVisible();
       tr.moveLeft();
       tr.moveDown();
       tr.moveUp();
       Circle ci = new Circle();
       ci.makeVisible();
       ci.moveRight();
       ci.moveUp();
    }
    
  
    @Test
    public void testMyTriangle()
    {
     
    }
    @Test
    public void testMyCircle()
    {
       
    }
}
