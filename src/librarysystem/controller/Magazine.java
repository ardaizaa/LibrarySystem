/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package librarysystem.controller;

import java.util.Date;

/**
 *
 * @author sim
 */
public abstract class Magazine extends LibraryItem {
    private int volume;
    private int issueNo;
    private Date published;

    public Magazine(String title, int maxCheckoutLength,
            int volume, int issueNo, Date published) {
        super(title, maxCheckoutLength);
        this.volume = volume;
        this.issueNo = issueNo;
        this.published = published;
    }

    public void reserve() {

    }
    public void addCopy() {

    }
    public void getMagazineInfo() {

    }
}
