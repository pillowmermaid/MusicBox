/*
 * Copyright (C) 2013 Bujiraso
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file, you can obtain one at http://mozilla.org/MPL/2.0/.
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
