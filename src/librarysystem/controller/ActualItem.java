/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package librarysystem.controller;

/**
 *
 * @author sim
 */
public class ActualItem {
    private long itemId;
    private long copyId;
    private boolean isBorrowed;
    private boolean isReserved;

    public ActualItem(long itemId) {
        this.itemId = itemId;
        copyId = System.currentTimeMillis();
        isBorrowed = false;
        isReserved = false;
    }

    public void lend() {
        isBorrowed = true;
        isReserved = false;
        //TODO: more
    }    
    public void checkin() {
        isBorrowed = false;
    }
    public void reserve() {
        isReserved = true;
    }
    public void cancelReservation() {
        isReserved = false;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
    public boolean isReserved() {
        return isReserved;
    }    
}
