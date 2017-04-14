package com.shafali.SecondAPIDemo;

import com.shafali.TaskManager.*;
import java.io.*;
public class SecondTask_Task2 implements Task<ActualTaskManager2>{
    
	
	public ActualTaskManager2 perform(ActualTaskManager2 onj)
	{
		System.out.println("Perform method of second API task2");
		return onj;
	}
}
