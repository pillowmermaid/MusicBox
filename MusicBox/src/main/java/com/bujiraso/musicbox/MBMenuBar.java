/*
 * Copyright (C) 2013 Bujiraso
 * This work is licensed under the Creative Commons Attribution-ShareAlike 3.0 Unported License. To view a
 * copy of this license, visit http://creativecommons.org/licenses/by-sa/3.0/ or send a letter to Creative
 * Commons, 444 Castro Street, Suite 900, Mountain View, California, 94041, USA.
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
