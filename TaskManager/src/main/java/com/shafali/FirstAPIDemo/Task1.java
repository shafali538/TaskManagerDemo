package com.shafali.FirstAPIDemo;

import com.shafali.TaskManager.*;
public class Task1 implements Task<FirstAPIDemoTaskManager>{
    
	
	public FirstAPIDemoTaskManager perform(FirstAPIDemoTaskManager obj)
	{
		System.out.println("Perform method of task1 for first API");
		return obj;
	}
}
