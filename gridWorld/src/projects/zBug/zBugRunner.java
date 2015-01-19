/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.zBug;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class zBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        zBug alice = new zBug(6);
        alice.setColor(Color.ORANGE);
        zBug bob = new zBug(3);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}