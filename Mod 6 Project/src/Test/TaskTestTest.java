package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import task.task;

class TaskTestTest {

	@Test
	@DisplayName("Task ID cannot have more than 10 characters")
	void testTaskIDWithMoreThanTenCharacters() {
		task task = new task();
		if (task.getTaskDesc().length() > 10) {
			fail("Task ID has more than 10 characters.");
		}
	}

	private void fail(String string) {
		// TODO Auto-generated method stub
		
	}

	@Test
	@DisplayName("Task Name cannot have more than 20 characters")
	void testTaskNameWithMoreThanTwentyCharacters() {
		task task = new task();
		if (task.getTaskName().length() > 20) {
			fail("Task Name has more than 20 characters.");
		}
	}

	@Test
	@DisplayName("Task Description cannot have more than 50 characters")
	void testTaskDescWithMoreThanFiftyCharacters() {
		task task = new task();
		if (task.getTaskDesc().length() > 50) {
			fail("Task Description has more than 50 characters.");
		}
	}

	@Test
	@DisplayName("Task Name shall not be null")
	void testTaskNameNotNull() {
		task task = new task();
		assertNotNull(task.getTaskName(), "Task Name was null.");
	}
	
	@Test
	@DisplayName("Task Description shall not be null")
	void testTaskDescNotNull() {
		task task = new task();
		assertNotNull(task.getTaskDesc(), "Task Description was null.");
	}

	private void assertNotNull(String taskDesc, String string) {
		// TODO Auto-generated method stub
		
	}
}