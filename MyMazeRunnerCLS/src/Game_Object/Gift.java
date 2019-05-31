/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game_Object;

/**
 *
 * @author Amina A. Abounawara
 */
/**
 * A class representing the 'Gift' game object.
 *

 */
public class Gift extends GameObject {
    private static final char DEFAULT_ICON = 'G';
    /**
     * @param position the {@link Position} of this game object
     */
     public Gift(Position position) {
        super(DEFAULT_ICON, position);
    }
     /**
     * Returns a String object representing the direction hints to this Key object
     * from the specified player's position.
     *
     * @param playerPosition the {@link Position} of the {@link Player}
     * @return the direction hints
     */
    public String getDirectionHints(Position playerPosition) {
        StringBuilder sb = new StringBuilder();

        if (this.getX() > playerPosition.getX())
            sb.append("-> ");
        else if (this.getX() < playerPosition.getX())
            sb.append("<- ");

        if (this.getY() > playerPosition.getY())
            sb.append("v ");
        else if (this.getY() < playerPosition.getY())
            sb.append("^ ");

        return sb.toString();
    }
}