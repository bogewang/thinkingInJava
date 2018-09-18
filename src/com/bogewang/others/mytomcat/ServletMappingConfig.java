/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.others.mytomcat;

import java.util.ArrayList;
import java.util.List;

public class ServletMappingConfig {
    public static List<ServletMapping> servletMappingList = new ArrayList<>();

    static {
        servletMappingList.add(new ServletMapping("findGirl", "/girl", "com.bogewang.others.mytomcat.FindGirlServlet"));
        servletMappingList.add(new ServletMapping("hellWorld", "/world", "com.bogewang.others.mytomcat.HelloWorldServlet"));
    }
}
