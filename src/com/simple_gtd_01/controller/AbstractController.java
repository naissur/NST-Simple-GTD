package com.simple_gtd_01.controller;

import com.simple_gtd_01.model.AbstractModel;

public interface AbstractController {
	public void addTaskDialogExecuted(String task_objective);
	public AbstractModel getModel();
	public void setTaskAsDone(int id);
	public void setTaskAsUndone(int id);
	public void removeTask(int id);
}
