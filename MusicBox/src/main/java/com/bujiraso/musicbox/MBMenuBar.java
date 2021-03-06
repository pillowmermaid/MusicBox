/*
 * Copyright (C) 2013 Bujiraso
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file, you can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.bujiraso.musicbox;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;

/**
 * Music box menu
 *
 * @author Bujiraso
 */
class MBMenuBar extends JMenuBar {

    private Color colorSelection;

    public MBMenuBar() {
        initComponents();
    }

    public Color getSelectedColor() {
        return colorSelection;
    }

    private void initComponents() {
        //FILE
        final JMenu file = new JMenu("File");
        //-exit
        file.add(new AbstractAction("Exit") {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(file);

        //EDIT
        final JMenu edit = new JMenu("Edit");
        //-COLOR
        final JMenu color = new JMenu("Color");
        //--black
        final ButtonGroup bg = new ButtonGroup();
        final JRadioButtonMenuItem blackButton = new JRadioButtonMenuItem(new AbstractAction("Black") {
            public void actionPerformed(ActionEvent e) {
                colorSelection = Color.black;
            }
        });
        blackButton.setSelected(true);
        colorSelection = Color.black;
        color.add(blackButton);
        bg.add(blackButton);
        //--red
        final JRadioButtonMenuItem redButton = new JRadioButtonMenuItem(new AbstractAction("Red") {
            public void actionPerformed(ActionEvent e) {
                colorSelection = Color.red;
            }
        });
        color.add(redButton);
        bg.add(redButton);
        edit.add(color);
        add(edit);
    }
}
