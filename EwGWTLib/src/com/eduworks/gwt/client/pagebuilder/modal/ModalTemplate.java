package com.eduworks.gwt.client.pagebuilder.modal;

import com.eduworks.gwt.client.component.HtmlTemplates;

public abstract class ModalTemplate {
	public abstract ModalDispatch getModalDispatcher();
	public abstract HtmlTemplates getTemplates();
	
	public abstract void display();
	
	public abstract ModalSize getModalSize();
	
	protected enum ModalSize{
		TINY, 		// 30%
		SMALL,		// 40%
		MEDIUM,		// 60%
		LARGE,		// 75%
		XLARGE,		// 90%
		FULL		// 100%
	}
}
