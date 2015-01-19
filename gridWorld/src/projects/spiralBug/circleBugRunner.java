/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.spiralBug;
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
        spiralBug alice = new spiralBug(6);
        alice.setColor(Color.ORANGE);
        spiralBug bob = new spiralBug(3);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}
