/**
 * This Programs purpose is to detect what arrow keys are pressed and record how many times.
 */

import javax.swing.*; //Using the "*" at the end imports all of the swing code for the frame and panel

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ArrowKeys {

    public ArrowKeys() {

        JFrame frame = new JFrame(); //This line creates a new JFrame object, which represents the main window of the application.
        frame.setVisible(true); //This line makes the frame visible on the screen.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //This line sets the default close operation for the frame. When the frame is closed, the entire application will exit.
        frame.setSize(400, 400); //This line sets the size of the frame to 400 pixels by 400 pixels.
        frame.setFocusable(true); //This line makes the frame focusable, allowing it to receive keyboard events.

        JPanel panel = new JPanel(); //This line creates a new JPanel object, which is a container for other GUI components.
      //These lines create four JLabel objects, which are used to display text or images.
        JLabel up = new JLabel(); 
        JLabel down = new JLabel();
        JLabel left = new JLabel();
        JLabel right = new JLabel();

        //These lines add the JLabel objects to the JPanel so that they can be displayed.
        panel.add(up);
        panel.add(down);
        panel.add(right);
        panel.add(left);

        //These lines set the initial text for each JLabel object.
        up.setText("Up: 0 ");
        down.setText("Down: 0 ");
        right.setText("Right: 0 ");
        left.setText("Left: 0 ");

        frame.addKeyListener(new KeyListener() { //This line adds a KeyListener to the frame, which listens for keyboard events.

            //These lines declare and initialize variables to keep track of the number of times each arrow key is pressed.
            int upCount =1;
            int downCount =1;
            int rightCount=1;
            int leftCount =1;

            @Override
            public void keyTyped(KeyEvent e){

            }

            @Override
            public void keyPressed(KeyEvent e){ // Invoked when a key has been pressed. Updates the label text based on the pressed arrow key.
                int keyCode = e.getKeyCode();
                switch(keyCode){
                    case KeyEvent.VK_UP:
                        up.setText("Up: "+ Integer.toString(upCount++));
                        break;
                    case KeyEvent.VK_DOWN:
                        down.setText("Down: "+ Integer.toString(downCount++));
                        break;
                    case KeyEvent.VK_RIGHT:
                        right.setText("Right: "+ Integer.toString(rightCount++));
                        break;
                    case KeyEvent.VK_LEFT:
                        left.setText("Left: "+ Integer.toString(leftCount++));
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e){
                
            }
        });

        frame.add(panel);
    }

    public static void main(String[] args) {
        new ArrowKeys();
    }
}