package com.revature.pojos;

public class Department {

	//fields
	private int department_ID;
	private String department_Name;
	
	//constructor no arg
	public Department() {
		super();
	}
		
		public Department(int department_ID, String department_Name) {
		
			this.department_ID = department_ID; //using the this keyword to refer to an instance variable of the current class
			this.department_Name = department_Name; // local variables are within the blocks, methods, or constructors, but since we're referring to an instance of
													//a variable within the --> Class <---
			
	}//getters and setters

		public int getDepartment_ID() { //getters and setters to make accessible  these private fields 
			return department_ID;
		}

		public void setDepartment_ID(int department_ID) {
			this.department_ID = department_ID;
		}

		public String getDepartment_Name() {
			return department_Name;
		}

		public void setDepartment_Name(String department_Name) {
			this.department_Name = department_Name;
		}

		@Override
		public int hashCode() {  //and now we have a pojo...  getters setters, no arg constructor, hashcode, equals and toString
			final int prime = 31;
			int result = 1;
			result = prime * result + department_ID;
			result = prime * result + ((department_Name == null) ? 0 : department_Name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Department other = (Department) obj;
			if (department_ID != other.department_ID)
				return false;
			if (department_Name == null) {
				if (other.department_Name != null)
					return false;
			} else if (!department_Name.equals(other.department_Name))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Department [department_ID=" + department_ID + ", department_Name=" + department_Name + "]";
		}
}
		