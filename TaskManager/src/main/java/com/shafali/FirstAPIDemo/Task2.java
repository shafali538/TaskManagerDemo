package com.shafali.FirstAPIDemo;
import com.shafali.TaskManager.*;

public class Task2 implements Task<FirstAPIDemoTaskManager>{
    
	
	public FirstAPIDemoTaskManager perform(FirstAPIDemoTaskManager onj)
	{
		System.out.println("Perform method of task2 for first API");
		return onj;
	}
}
