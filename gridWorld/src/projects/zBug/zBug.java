/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.zBug;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

/**
 * A ZBug traces out a Z pattern of a given size.
 */
public class zBug extends Bug {

    private int segmentLength;
    private int steps;
    private int segment;

    public zBug(int length) {
        setDirection(Location.EAST);
        steps = 0;
        segment = 1;
        segmentLength = length;
    }

    public void act() {
        if (segment <= 3 && steps < segmentLength) {
            if (canMove()) {
                move();
                steps++;
            }
        } else if (segment == 1) {
            setDirection(Location.SOUTHWEST);
            steps = 0;

            segment++;
        } else if (segment == 2) {
            setDirection(Location.EAST);
            steps = 0;
            segment++;
        }
    }
}
