package com.shafali.SecondAPIDemo;

import com.shafali.TaskManager.*;

public class SecondTask_Task1 implements Task<ActualTaskManager2>{
    
	
	public ActualTaskManager2 perform(ActualTaskManager2 onj)
	{   
		
		System.out.println("Perform method of second API task1");
		return onj;
	}
}
