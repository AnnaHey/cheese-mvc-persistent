package org.launchcode.models.forms;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by Anna Hexter on 7/30/2017.
 */
public class AddMenuItemForm {

    @NotNull
    private int menuId;

    @NotNull
    private int cheeseId;

    private Iterable<Cheese> cheeses;

    private Menu menu;

    public AddMenuItemForm(){}

    public AddMenuItemForm(Iterable<Cheese> cheeses, Menu menu) {
        this.cheeses = cheeses;
        this.menu = menu;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }

    public Iterable<Cheese> getCheeses() {
        return cheeses;
    }

    public Menu getMenu() {
        return menu;
    }
}



