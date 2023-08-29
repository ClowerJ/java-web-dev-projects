package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menulc {
    private Date lastUpdated;
    private ArrayList<MenuItemlc> items;

    public Menulc(Date d, ArrayList<MenuItemlc> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItemlc> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItemlc> getItems() {
        return items;
    }
}
