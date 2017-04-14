package com.shafali.FirstAPIDemo;

import com.shafali.TaskManager.*;

public class FirstAPIDemoTaskManager extends TaskManager<FirstAPIDemoTaskManager>{
	
	Task1 taskobj1;
	Task2 taskobj2;
	
	
	
	public FirstAPIDemoTaskManager()
	{
	 
	  taskobj1=new Task1();
	  taskobj2=new Task2();
	}
	public Boolean executeMehtod()
	{   
		super.addTasks(taskobj1);
		super.addTasks(taskobj2);
		super.execute(this);
		return true;
	}

}


