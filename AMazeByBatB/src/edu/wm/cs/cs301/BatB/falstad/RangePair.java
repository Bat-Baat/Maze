package edu.wm.cs.cs301.BatB.falstad;

import java.io.Serializable;

/**
 * 
 * This code is refactored code from Maze.java by Paul Falstad, www.falstad.com, Copyright (C) 1998, all rights reserved
 * Paul Falstad granted permission to modify and use code for teaching purposes.
 */
public class RangePair implements Serializable{
    public int x1, z1, x2, z2;
    RangePair(int xx1, int zz1, int xx2, int zz2) {
	x1 = xx1;
	z1 = zz1;
	x2 = xx2;
	z2 = zz2;
    } 
}



