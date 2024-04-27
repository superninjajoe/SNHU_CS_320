package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import task.TaskService;
import task.task;

class TaskServiceTestTest {

	@Test
	@DisplayName("Test to Update task name")
	@Order(1)
	void testUpdateTaskName() {
		TaskService service = new TaskService();
		service.addTask("Task Name", "Description");
		service.updateTaskName("Updated Task Name", "3");
		service.displaytaskList();
		assertEquals("Updated Task Name", service.getTask("3").getTaskName(), "Task name was not updated.");
	}

	@Test
	@DisplayName("Test to Update task description.")
	@Order(2)
	void testUpdateTaskDesc() {
		TaskService service = new TaskService();
		service.addTask("Task Name", "Description");
		service.updateTaskDesc("Updated Description", "1");
		service.displaytaskList();
		assertEquals("Updated Description", service.getTask("1").getTaskDesc(), "Task description was not updated.");
	}

	@Test
	@DisplayName("Test to ensure that service correctly deletes tasks.")
	@Order(5)
	void testDeleteContact() {
		TaskService service = new TaskService();
		service.addTask("Task Name", "Description");
		service.deleteTask("0");			ArrayList<task> taskListEmpty = new ArrayList<Task>();
		service.displaytaskList();
		assertEquals(service.taskList, taskListEmpty, "The contact was not deleted.");
	}

	@Test
	@DisplayName("Test to ensure that service can add a task.")
	@Order(6)
	void testAddContact() {
		TaskService service = new TaskService();
		service.addTask("Task Name", "Description");
		service.displaytaskList();
		assertNotNull(service.getTask("0"), "Task was not added correctly.");
	}