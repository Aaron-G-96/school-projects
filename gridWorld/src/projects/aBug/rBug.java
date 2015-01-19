/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.aBug;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

/**
 * A ZBug traces out a Z pattern of a given size.
 */
public class rBug extends Bug {

    private int segmentLength;
    private int steps;
    private int segment;

    public rBug(int length) {
        setDirection(Location.NORTHEAST);
        steps = 0;
        segment = 1;
        segmentLength = length;
    }

    public void act() {
        if (segment <= 4 && steps < segmentLength) {
            if (canMove()) {
                move();
                steps++;
            }
        } else if (segment == 1) {
            setDirection(Location.SOUTHEAST);
            steps = 0;

            segment++;
        } else if (segment == 2) {
            setDirection(Location.NORTHWEST);
            steps = (segmentLength/2);
            
            segment++;
        }else if (segment == 3){
            setDirection(Location.WEST);
            steps = 0;
            
            segment++;
        }
        
        
        
    }
}