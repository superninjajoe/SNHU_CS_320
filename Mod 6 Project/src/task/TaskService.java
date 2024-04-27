package task;

public class TaskService {

	import java.util.ArrayList;
	
		public ArrayList<task> taskList = new ArrayList<task>();

		public void displaytaskList() {
			for (int counter = 0; counter < taskList.size(); counter++) {
				System.out.println("\t Task ID: " + taskList.get(counter).getTaskName());
				System.out.println("\t Task Name: " + taskList.get(counter).getTaskName());
				System.out.println("\t Task Description: " + taskList.get(counter).getTaskDesc());
			}

		public void addTask(String taskName, String taskDesc) {
			// Create the new task
			task task = new task();
			taskList.add(task);
		}

		public task getTask(String taskID) {
			task task = new task();
			for (int counter = 0; counter < taskList.size(); counter++) {
				if (taskList.get(counter).getTaskDesc().contentEquals(taskID)) {
					task = taskList.get(counter);
				}
			}
			return task;
		}

		public void deleteTask(String taskID) {
			for (int counter = 0; counter < taskList.size(); counter++) {
				if (taskList.get(counter).getTaskName().equals(taskID)) {
					taskList.remove(counter);
					break;
				}
				if (counter == taskList.size() - 1) {
					System.out.println("Task ID: " + taskID + " not found.");
				}
			}
		}

		public void updateTaskName(String updatedString, String taskID) {
			for (int counter = 0; counter < taskList.size(); counter++) {
				if (taskList.get(counter).getTaskName().equals(taskID)) {
					taskList.get(counter).setTaskName(updatedString);
					break;
				}
				if (counter == taskList.size() - 1) {
					System.out.println("Task ID: " + taskID + " not found.");
				}
			}
		}

		public void updateTaskDesc(String updatedString, String taskID) {
			for (int counter = 0; counter < taskList.size(); counter++) {
				if (taskList.get(counter).getTaskName().equals(taskID)) {
					taskList.get(counter).setTaskDesc(updatedString);
					break;
				}
				if (counter == taskList.size() - 1) {
					System.out.println("Task ID: " + taskID + " not found.");
				}
			}
		}
	}