package com.simple_gtd_01.model;

public interface AbstractModel {
	public abstract void addNewTaskToModel(String objective);
	public abstract void setTaskAsDone(int id);
	public abstract void removeTaskFromModel(int id);
	public abstract void setTaskObjective(int id, String newObjective);
	public abstract void setTaskAsUndone(int id);
	public abstract void saveTasksToJson();
	public abstract void readTasksFromJson();
	public abstract void sendAllTasksToView();
}
