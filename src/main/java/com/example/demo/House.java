package com.example.demo;

import org.springframework.beans.factory.annotation.Value;



public class House {
    private Window win;
    private int height;
    private Material wall;
    public House(Window win){
        this.win=win;

    }

    public Material getWall() {
        return wall;
    }

    public void setWall(Material wall) {
        this.wall = wall;
    }

    public Window getWin() {
        return win;
    }

    public void setWin(Window win) {
        this.win = win;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void view(){
        win.open();
    }

    public void buildwall(){
        for(int i=1; i<=getHeight();i++){
            System.out.printf("Floors %d. ", i);
            getWall().cover();
        }
    }
}
