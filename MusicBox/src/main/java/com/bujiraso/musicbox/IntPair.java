/*
 * Copyright (C) 2013 Bujiraso
 * This work is licensed under the Creative Commons Attribution-ShareAlike 3.0 Unported License. To view a
 * copy of this license, visit http://creativecommons.org/licenses/by-sa/3.0/ or send a letter to Creative
 * Commons, 444 Castro Street, Suite 900, Mountain View, California, 94041, USA.
 */
package com.bujiraso.musicbox;

/**
 * A pair of integers
 *
 * @author Bujiraso
 */
public class IntPair extends Pair {

    public final int a;
    public final int b;

    public IntPair(final int a, final int b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }
}
