package com.dash;

public class Students implements Comparable<Students> {
	private String name;
	private String rollNumber;
	private Departments dept;
	public Students(){
		
	}
	public Students(String name,String rollNumber){
		this.name=name;
		this.rollNumber=rollNumber;
	}
	public Students(String name,String rollNumber,Departments dept){
		this.name=name;
		this.rollNumber=rollNumber;
		this.dept=dept;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	@Override
	public int compareTo(Students stud) {
		if(this.name.compareTo(stud.name)==0){
			if(this.rollNumber.compareTo(stud.rollNumber)==0)
			{
				if(this.dept==null){
					return 1;
				}
				else if(stud.dept==null){
					return -1;
				}
				else{
					return this.getDept().compareTo(stud.dept);
				}
			}
			else{
				return this.rollNumber.compareTo(stud.rollNumber);
			}
		}
		else{
			return this.name.compareTo(stud.name);
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((rollNumber == null) ? 0 : rollNumber.hashCode());
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
		Students other = (Students) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNumber == null) {
			if (other.rollNumber != null)
				return false;
		} else if (!rollNumber.equals(other.rollNumber))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", rollNumber=" + rollNumber + "]"+"Dept :"+(this.dept==null?" null":this.dept.toString());
	}
	public Departments getDept() {
		return dept;
	}
	public void setDept(Departments dept) {
		this.dept = dept;
	}	
}
