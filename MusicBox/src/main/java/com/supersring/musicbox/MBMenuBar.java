/*
 * 
 */
package com.supersring.musicbox;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.Enumeration;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultButtonModel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author Nicholas
 */
class MBMenuBar extends JMenuBar {

    public Color userSelection = Color.black;

    public MBMenuBar() {
        initComponents();
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
                userSelection = Color.black;
            }
        });
        blackButton.setSelected(true);
        color.add(blackButton);
        bg.add(blackButton);
        //--red
        final JRadioButtonMenuItem redButton = new JRadioButtonMenuItem(new AbstractAction("Red") {
            public void actionPerformed(ActionEvent e) {
                userSelection = Color.red;
            }
        });
        color.add(redButton);
        bg.add(redButton);
        edit.add(color);
        add(edit);
    }
}
