import java.awt.*;
import java.awt.event.*;
import javax.swing.JApplet;

/**
 *
 * @author Harrison English
 * SignatureApplet
 *
 * Creates a picture which is a hommage to the webcomic series XKCD url:http://xkcd.com/149/
 * it basically redraws this web comic using java and adding color as per required by this 
 * assignment
 *
 */
public class SignatureApplet extends JApplet{
    
    int width, height;

    @Override public void init(){
    	//gets the width and height given by the html tags
        width = getSize().width;
        height = getSize().height;
        
        //changes the background to be white instead of gray
       Container content = getContentPane();
       content.setBackground(Color.white);

    }
    //paint mehtod
	@Override public void paint(Graphics g){
		//to to place this hear to prevent certain bugs
		super.paint(g);
		
		//sets color for thefirst speaker as well as curved lines
        g.setColor(Color.GREEN);
        
        //first dialogue and line for first speaker
        g.drawString("Make me a sandwich.", 50, 10);
        g.drawArc(75, 5, 30, 100, 20, 40); 
        
        //Second Dialogue and line for first speaker
        g.drawString("SUDO Make me a sandwich.", 50, 50);
        g.drawArc(75, 40, 40, 150, 20, 40); 
        
		//sets color for thefirst speaker as well as curved lines
        g.setColor(Color.BLUE);
        
        //first dialogue and line for second speaker
        g.drawString("What? Make it yourself.", 190, 30);
        g.drawArc(225, 25, 30, 100, 20, 40); 
        
        //Second Dialogue and line for first speaker
        g.drawString("Okay.", 250, 70);
        g.drawArc(225, 45, 35, 75, 20, -90); 
        
        //Color of people
        g.setColor(Color.BLACK);
        
        
        g.drawOval(110, 98, 10, 12);    //first person head
        g.drawLine(115, 110, 115, 130); //body
        g.drawLine(115, 115, 125, 120); //arm
        
        g.drawOval(200, 98, 10, 12); 	//second person head
        g.drawLine(205, 110, 205, 125); //body
        g.drawLine(205, 115, 195, 121); //left arm
        g.drawLine(205, 115, 210, 125); //right arm
        g.drawLine(205, 125, 200, 135); //left leg
        g.drawLine(205, 125, 210, 135); //right leg
        
        // create chair color sets color
        Color BROWN  = new Color(139, 69, 19);
        g.setColor(BROWN);
        
        //chair
        g.drawLine(105, 110, 105, 130); //back line
        g.fillOval(105, 110, 10 , 20);  //backpillow
        g.drawLine(105, 130, 125, 130); //bottom line
        g.drawOval(105, 120, 20, 10);   //arm rest
        g.drawLine(125, 125, 125, 130); //frontline
        g.fillRect(105, 125, 20, 5);    //bottom of chair
        g.fillOval(105, 120, 20, 10);   //arm rest filler

    }
    
	
}