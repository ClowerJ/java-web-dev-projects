package org.launchcode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date isNew;


    public Menu (Date date, ArrayList<MenuItem> menuItem){
        this.isNew = date;
        this.items = menuItem;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public Date getIsNew() {
        return isNew;
    }

    public void setIsNew(Date isNew) {
        this.isNew = isNew;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }
}
