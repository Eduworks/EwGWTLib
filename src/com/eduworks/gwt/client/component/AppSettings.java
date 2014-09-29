package com.eduworks.gwt.client.component;

import com.eduworks.gwt.client.pagebuilder.ScreenDispatch;
import com.eduworks.gwt.client.pagebuilder.ScreenTemplate;
import com.google.gwt.core.client.GWT;

public class AppSettings {
   
   public static ScreenDispatch dispatcher = new ScreenDispatch();
   public static HtmlTemplates templates = GWT.create(HtmlTemplates.class);
   public static ScreenTemplate defaultScreen;
   public static String siteName = "";
   public static String helpURL = ""; 

}
