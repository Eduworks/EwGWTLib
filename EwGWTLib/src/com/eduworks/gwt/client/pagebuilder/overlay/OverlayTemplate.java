package com.eduworks.gwt.client.pagebuilder.overlay;

import com.eduworks.gwt.client.net.callback.EventCallback;
import com.eduworks.gwt.client.pagebuilder.PageAssembler;
import com.eduworks.gwt.client.pagebuilder.screen.ScreenTemplate;
import com.google.gwt.user.client.Event;

public abstract class OverlayTemplate extends ScreenTemplate{
	public void display(){
		PageAssembler.attachHandler("close-overlay-btn", Event.ONCLICK, new EventCallback() {
			@Override
			public void onEvent(Event event) {
				cleanAndCloseOverlay(event);
			}
		});
	}
	
	public void cleanAndCloseOverlay(Event event) {
		//  This method will be overridden when an Overlay needs to run some clean up
		getOverlayDispatcher().hideOverlay();
	}
}
