package com.shafali.SecondAPIDemo;

import com.shafali.TaskManager.*;

import com.shafali.FirstAPIDemo.*;


public class SecondTask_Pre implements Task<ActualTaskManager2>{

	public ActualTaskManager2 perform(ActualTaskManager2 onj)
	{   
		FirstAPIDemoTaskManager BaseTaskManagerobj=new FirstAPIDemoTaskManager();
		//Task1 TaskObj=new Task1();
		BaseTaskManagerobj.executeMehtod();
		//TaskObj.perform(BaseTaskManagerobj);
		
		return onj;
	}
}
