import org.code.neighborhood.*;
// Asphalt Painter is a painter than can create an image
public class AsphaltPainter extends MuralPainter {

  // Main method with different methods to break down algorithm
    public  void paintButterfly(){
      paintWingsOutline();
      paintAntennae();
      paintBody();
      paintWings();
    }
/*
* Creates a method to paint outline of wings
*  Creates 1 unit wide and long outline
*/
    public void paintWingsOutline(){
       moveTwice();
       turnRight();
       move();
       paintLine("violet", 1);
       turnAround();
       move();
       turnRight();
       moveTwice();
       moveTwice();
       moveTwice();
       moveTwice();
       moveTwice();
       moveTwice();
       paintLine("violet", 1);
       turnRight();
       move();
       turnRight();
       paintLine("violet", 1);
       move();
       paintLine("violet", 2);
       moveTwice();
       moveTwice();
       moveTwice(); 
       move();
       paintLine("violet", 2);
       move();
       paintLine("violet", 1);
       turnAround(); 
       turnRight();
       move();
       paintLine("violet", 1);
       turnLeft();
       move();
       turnRight();
       paintLine("violet", 2);
       turnLeft();
       move();
       paintLine("violet", 1);
       moveTwice();
       moveTwice();
       moveTwice();
       moveTwice();
       moveTwice();
       move();
       paintLine("violet", 1);
       turnLeft();
       move();
       paintLine("violet", 2);
       turnAround();
       moveTwice();
       moveTwice();
       paintLine("violet", 2);
       turnAround();
       move();
       turnLeft();
       moveTwice();
       moveTwice();
       moveTwice();
       moveTwice();
       moveTwice();
       moveTwice();
       moveTwice();
       turnRight();
       paintLine("violet", 2);
       turnAround();
       moveTwice();
       turnRight();
       move();
       turnLeft();
       move();
       paintLine("violet", 2);
       turnLeft();
       moveTwice();
       moveTwice();
       moveTwice();
       moveTwice();
       moveTwice();
       moveTwice();
       moveTwice();
       move();
       turnRight();
       paintLine("violet", 2);
       turnRight();
       move();
       paintLine("violet", 1);
       turnRight();
       move();
       paintLine("violet", 1);
       turnLeft();
       move();  
       paintLine("violet", 1);
       turnRight();
       move();
       turnLeft();
       paintLine("violet", 2);
       moveTwice();
       move();
       paintLine("violet", 2);
       turnLeft();
       move();
       paintLine("violet", 1);
       turnRight();
       move();
       paintLine("violet", 1);
       turnLeft();
       move();
       paintLine("violet", 1);
       turnRight(); 
       move();
       turnRight();
       moveTwice();
       paintLine("violet", 2);
       moveTwice();
       moveTwice();
       moveTwice();
       move();
       turnRight();
       moveTwice();
       moveTwice();
       paintLine("violet", 2);
       moveTwice();
       move();
       paintLine("violet", 2);
    }
  /*
  * Creates method to paint the body of butterfly
  * Paints body of butterfly
  */
    public void paintBody(){
      turnRight();
      moveTwice();
      move();
      turnRight();
      moveTwice();
      move();
      paintLine("purple", 8);
      turnLeft();
      move();
      turnLeft();
      moveTwice();
      paintLine("purple", 6);
      turnLeft();
      moveTwice();
      turnLeft();
      move();
      paintLine("purple", 6);
      
    }
/*
  * Created a method to paint antennae
  * Utilizes loop to paint a diagonal line
  */
  public void paintAntennae(){
        turnAround();
        moveTwice();
        move();
        turnRight();
        move();
        if (canMove("south")){
          turnRight();
          paintLine("black", 1);
          turnLeft();
          move();
        }
        turnRight();
        paintLine("black", 1); 
        turnLeft();
        move();
        paintLine("black", 1);
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        moveTwice();
        turnRight();
        moveTwice();
        turnRight();
        move();
        paintLine("black", 1);
        turnLeft();
        move();
        paintLine("black", 1);
        turnRight();
        move();
        paintLine("black", 1);
        
  }
/*
  * Created method for drawing the wings of the mural
  * Fills in the outline of wings
  */
  public void paintWings(){
    turnRight();
    move();
    turnRight();
    paintLine("violet", 7);
    turnLeft();
    move();
    turnLeft();
    paintLine("violet", 7);
    turnRight();
    move();
    turnRight();
    paintLine("violet", 8);
    turnLeft();
    move();
    turnLeft();
    paintLine("violet", 10);
    turnRight();
    move();
    turnRight();
    paintLine("violet", 12);
    turnLeft();
    move();
    turnLeft();
    moveTwice();
    paintLine("violet", 2);
    move();
    moveTwice();
    paintLine("violet", 4);
    turnLeft();
    move();
    moveTwice();
    moveTwice();
    moveTwice();
    moveTwice();
    turnLeft();
    move();
    paintLine("violet", 7);
    turnRight();
    move();
    turnRight();
    paintLine("violet", 7);
    turnLeft();
    move();
    turnLeft();
    paintLine("violet", 8);
    turnRight();
    move();
    turnRight();
    paintLine("violet", 10);
    turnLeft();
    move();
    turnLeft();
    paintLine("violet", 11);
    turnRight();
    move();
    turnRight();
    moveTwice();
    paintLine("violet", 2);
    moveTwice();
    paintLine("violet", 4);
   
  }
//  Created method for moving twice forward to decrease repetition

    public void moveTwice(){
      move();
      move();
    }
}