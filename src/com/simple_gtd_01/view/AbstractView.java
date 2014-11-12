package com.simple_gtd_01.view;

import com.simple_gtd_01.controller.AbstractController;

public interface AbstractView {

	public void setController(AbstractController controller);
	
	public void addNewTaskToView(String objective);
	
	public void onNewTaskDialogExecuted(String objective);
}
