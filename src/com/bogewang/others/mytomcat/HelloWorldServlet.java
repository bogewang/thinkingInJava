/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.others.mytomcat;

import java.io.IOException;

public class HelloWorldServlet extends MyServlet {
    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("get world...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("post workd...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
