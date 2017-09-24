package com.dash;

public class Departments implements Comparable<Departments> {

	private String name;
	private Long deptId;
	
	public Departments(String name,Long deptId) {
		this.name=name;
		this.deptId=deptId;
	}
	
	@Override
	public int compareTo(Departments dept) {
		return this.deptId.compareTo(dept.deptId);
		
	}

	@Override
	public int hashCode() {
		System.out.println(" hash Method :::");

		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println(" Equals Method :::");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departments other = (Departments) obj;
		if (deptId == null) {
			if (other.deptId != null)
				return false;
		} else if (!deptId.equals(other.deptId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Departments [name=" + name + ", deptId=" + deptId + "]";
	}
}
