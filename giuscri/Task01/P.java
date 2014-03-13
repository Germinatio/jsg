// Code mainly written as a template. If this piece
// is accepted by the rest of the organization, you only
// need to link every key-strokes to the relative move
// of our fellow snake.

/* ... */
import java.awt.*;

/* Managing key-strokes */
import java.awt.event.*;

/* ... */
import javax.swing.*;

public class P extends JFrame implements KeyListener {

    public P(String title) {
        super(title);
    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                /* Making a new JFrame titled 'foo' */
                P foo = new P("foo");

                /* If foo is halted, process is killed */
                foo.setDefaultCloseOperation(EXIT_ON_CLOSE);

                /* foo is a 640x480-px frame */
                foo.setSize(640, 480);

                /* Spaghetti link ...btw, it works */
                foo.addKeyListener(foo);

                /* Making foo visible (not the default choice) */
                foo.setVisible(true);
            }
        });

    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        /* Left, Up, Down, Right are in range [37-40] */
        if (36 < keyCode && keyCode < 41) {
            System.out.println("Ouch!, a "
               + KeyEvent.getKeyText(keyCode));
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

}
