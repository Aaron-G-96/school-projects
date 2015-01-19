/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.circleBug;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;
/**
 *
 * @author 008230
 */
public class circleBugRunner {
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        circleBug alice = new circleBug(6);
        alice.setColor(Color.ORANGE);
        circleBug bob = new circleBug(3);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}
