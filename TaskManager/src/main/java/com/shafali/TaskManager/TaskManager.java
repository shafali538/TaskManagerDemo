package com.shafali.TaskManager;

import java.util.LinkedList;
import java.util.Queue;


public class TaskManager<T> {
	public Queue<Task> queue;
     public  TaskManager()
      {
	    queue = new LinkedList<Task>();
      }
		public void addTasks(Task obj)
		{   
	       queue.add(obj);
	    }
		
		@SuppressWarnings("unchecked")
		public <T> Boolean execute(T MainObject)
		{   
			while(!queue.isEmpty())
			{
			//Loop for each Item in queue.
			Task<T> obj=queue.remove();
			obj.perform(MainObject);
			}
			 return true;
		}

			
		}
	

