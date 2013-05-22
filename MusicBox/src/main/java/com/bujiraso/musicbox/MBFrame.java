/*
 * Copyright (C) 2013 Bujiraso
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file, you can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.bujiraso.musicbox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Music Box main frame
 *
 * @author Bujiraso
 */
public class MBFrame extends JFrame {

    private MBMenuBar myMenuBar;

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
        background.setOpaque(false);
        //TODO: where is the mouse clicking?
        final GridBagConstraints c = new GridBagConstraints();
        final Dimension bgSize = new Dimension(340, 340);
        background.setPreferredSize(bgSize);
//        background.setBackground(Color.black);
        this.add(background, BorderLayout.CENTER);

        //Create and add a canvas to JPanel
        final MBCanvas mbCanvas = new MBCanvas();
        mbCanvas.setPreferredSize(bgSize);
        c.gridx = 1;
        c.gridy = 1;
        c.fill = GridBagConstraints.BOTH;
        background.add(mbCanvas, c);

        //Create and add a menu bar with items
        myMenuBar = new MBMenuBar();
        this.add(myMenuBar, BorderLayout.NORTH);
    }

    public Color getSelectedColor() {
        return myMenuBar.getSelectedColor();
    }
}
