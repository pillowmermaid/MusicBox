package com.supersring.musicbox;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 * Hello world!
 *
 */
public class MBFrame extends JFrame {

    public MBFrame() throws HeadlessException {
        initFrame();
    }

    public MBFrame(final GraphicsConfiguration gc) {
        super(gc);
        initFrame();
    }

    public MBFrame(final String title) throws HeadlessException {
        super(title);
        initFrame();
    }

    public MBFrame(final String title, final GraphicsConfiguration gc) {
        super(title, gc);
        initFrame();
    }

    public static void main(final String[] args) {
        //Instantiate, pack, center, and show
        final MBFrame mbFrame = new MBFrame("Music Box");
        mbFrame.pack();
        mbFrame.setLocationRelativeTo(null);
        mbFrame.setVisible(true);
    }

    private void initFrame() {
        //Exit when this frame is closed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final BorderLayout borderLayout = new BorderLayout();
        this.setLayout(borderLayout);

        //Create and add background
        final JPanel background = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        final Dimension bgSize = new Dimension(340, 340);
        background.setPreferredSize(bgSize);
//        background.setBackground(Color.black);
        this.add(background, BorderLayout.CENTER);

        //Create and add a canvas to JPanel
        MBCanvas mbCanvas = new MBCanvas();
        mbCanvas.setPreferredSize(bgSize);
        c.gridx = 1;
        c.gridy = 1;
        c.fill = GridBagConstraints.BOTH;
        background.add(mbCanvas, c);

        //Create and add a menu bar with items
        this.add(new MBMenuBar(), BorderLayout.NORTH);
    }
}
