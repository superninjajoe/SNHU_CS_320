package task;

public class task {

	public class task {
		private final String taskID;
		private String taskName;
		private String taskDesc;
		
		public task(String taskName, String taskDesc) {
			
			
			if (taskName == null || taskName.isEmpty()) {
				this.taskName = "NULL";
			} else if (taskName.length() > 10) {
				this.taskName = taskName.substring(0, 10);
			} 
			
			if (taskName == null || taskName.isEmpty()) {
				this.taskName = "NULL";
			} else if (taskName.length() > 20) {
				this.taskName = taskName.substring(0, 20);
			} 
			
			if (taskDesc == null || taskDesc.isEmpty()) {
				this.taskDesc = "NULL";
			} else if (taskDesc.length() > 50) {
				this.taskDesc = taskDesc.substring(0, 50);
			}
		}
		
		public String getTaskID() {
			return taskID;
		}
		
		public String getTaskName() {
			return taskName;
		}
		
		public String getTaskDesc() {
			return taskDesc;
		}
		
		public void setTaskName(String taskName) {
			if (taskName == null || taskName.isEmpty()) {
				this.taskName = "NULL";
			} else if (taskName.length() > 10) {
				this.taskName = taskName.substring(0, 10);
			} 
		}
		
		public void setTaskName(String taskName) {
			if (taskName == null || taskName.isEmpty()) {
				this.taskName = "NULL";
			} else if (taskName.length() > 20) {
				this.taskName = taskName.substring(0, 20);
			} 
		}
		
		public void setTaskDesc(String taskDesc) {
			if (taskDesc == null || taskDesc.isEmpty()) {
				this.taskDesc = "NULL";
			} else if (taskDesc.length() > 50) {
				this.taskDesc = taskDesc.substring(0, 50);
			} 
		}
	}

	public String getTaskName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTaskDesc() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setTaskName(String updatedString) {
		// TODO Auto-generated method stub
		
	}

	public void setTaskDesc(String updatedString) {
		// TODO Auto-generated method stub
		
	}
	}