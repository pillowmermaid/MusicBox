/*
 * Copyright (C) 2013 Bujiraso
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file, you can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.bujiraso.musicbox;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 * Music box canvas, where objects are drawn
 *
 * @author Bujiraso
 */
class MBCanvas extends JPanel implements MouseListener {

    private final IntPair[] rectCoords;
    private final Color[] rectColors;
    private static final int RECT_WIDTH = 60;
    private static final int RECT_HEIGHT = 60;
    private static final int BUFFER = 7;

    public MBCanvas() {
        rectCoords = new IntPair[25];
        setupCoords();
        rectColors = new Color[25];
        for (int i = 0; i < rectColors.length; i++) {
            rectColors[i] = Color.black;
        }
    }

    @Override
    public void paint(final Graphics g) {
        super.paint(g);
        g.setColor(((MBFrame) this.getParent().getParent().getParent().getParent().getParent()).getSelectedColor());
        for (int i = 0; i < rectCoords.length; i++) {
            final IntPair intPair = rectCoords[i];
            g.setColor(rectColors[i]);
            g.fill3DRect(intPair.a, intPair.b, RECT_WIDTH, RECT_HEIGHT, true);
        }
    }

    private void setRectangleColor(final int index, final Color color) {
        if (color == null) {
//            throw new IllegalArgumentException("Null is not a color");
        }
        if (index < 0 || index > 24) {
            throw new IndexOutOfBoundsException("There are only 25 rectangles. Your index must be between 0 and 24.");
        }
        rectColors[index] = color;
    }

    private void setupCoords() {
        int xCount = 0;
        int yCount = 0;
        for (int i = 0; i < rectCoords.length; i++) {
            rectCoords[i] = new IntPair(
                    xCount * (RECT_WIDTH + BUFFER) + BUFFER, yCount * (RECT_HEIGHT + BUFFER) + BUFFER);
            if (xCount < 4) {
                xCount++;
            }
            else {
                xCount = 0;
                yCount++;
            }
        }
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}
