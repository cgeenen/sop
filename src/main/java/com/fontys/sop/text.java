/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fontys.sop;

/**
 *
 * @author hanh-
 */
public class text {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public text(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "text{" + "text=" + text + '}';
    }

}
