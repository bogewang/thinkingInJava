/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch6._04_00;

public class ConnectionManager {
    private ConnectionManager instance = null;

    private ConnectionManager(){}

    public ConnectionManager getInstance() {
        if(instance == null){
            return new ConnectionManager();
        } else {
            return instance;
        }
    }
}
