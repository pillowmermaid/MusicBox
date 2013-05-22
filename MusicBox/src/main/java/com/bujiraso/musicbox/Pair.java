/*
 * Copyright (C) 2013 Bujiraso
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file, you can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.bujiraso.musicbox;

/**
 * A pair of the same type of object. Each instance is immutable.
 *
 * @author Bujiraso
 */
public class Pair<T> {

    public final T a;
    public final T b;

    public Pair(final T a, final T b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pair<T> other = (Pair<T>) obj;
        if (this.a != other.a && (this.a == null || !this.a.equals(other.a))) {
            return false;
        }
        if (this.b != other.b && (this.b == null || !this.b.equals(other.b))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (this.a != null ? this.a.hashCode() : 0);
        hash = 23 * hash + (this.b != null ? this.b.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Pair {" + "a=" + a + ", b=" + b + '}';
    }
}
