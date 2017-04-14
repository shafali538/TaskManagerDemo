package com.shafali.SecondAPIDemo;

import com.shafali.TaskManager.*;


public class ActualTaskManager2 extends TaskManager<ActualTaskManager2>{
	SecondTask_Task1 Secondtaskobj1;
	SecondTask_Task2 Secondtaskobj2;
	SecondTask_Pre Secondtaskobj3;
	
	public ActualTaskManager2()
	{
     Secondtaskobj3=new SecondTask_Pre();
	 Secondtaskobj1=new SecondTask_Task1();
	 Secondtaskobj2=new SecondTask_Task2();
	 
	}
	
	public Boolean executeMehtodTaskManager()
	{   
		super.addTasks(Secondtaskobj3);
		super.addTasks(Secondtaskobj1);
		super.addTasks(Secondtaskobj2);
		super.execute(this);
		return true;
	}

}
