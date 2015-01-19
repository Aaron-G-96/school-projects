/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.dancingBug;

import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class dancingBug extends Bug
{
    private int steps;
    private int sideLength;
    private int happiness;
    
    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public dancingBug(int length)
    {
        steps = 0;
        sideLength = length;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            happiness = steps;
            while (happiness > 0){
              turn();
              happiness--;
            }
            
            
            steps = 0;
        }
    }
}
