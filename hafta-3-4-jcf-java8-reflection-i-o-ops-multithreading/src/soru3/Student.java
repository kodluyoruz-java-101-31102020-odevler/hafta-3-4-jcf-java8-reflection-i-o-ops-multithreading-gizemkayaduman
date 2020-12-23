package soru3;


public class Student {
	
	String studentNo;
	String studentName;
	String studentSurname;
	String studentAge;
	String studentSection;
	
	public Student(String studentNo,String studentName,String studentSurname,String studentAge,String studentSection) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.studentSurname = studentSurname;
		this.studentAge = studentAge;
		this.studentSection = studentSection;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentAge == null) ? 0 : studentAge.hashCode());
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		result = prime * result + ((studentNo == null) ? 0 : studentNo.hashCode());
		result = prime * result + ((studentSection == null) ? 0 : studentSection.hashCode());
		result = prime * result + ((studentSurname == null) ? 0 : studentSurname.hashCode());
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
		Student other = (Student) obj;
		if (studentAge == null) {
			if (other.studentAge != null)
				return false;
		} else if (!studentAge.equals(other.studentAge))
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		if (studentNo == null) {
			if (other.studentNo != null)
				return false;
		} else if (!studentNo.equals(other.studentNo))
			return false;
		if (studentSection == null) {
			if (other.studentSection != null)
				return false;
		} else if (!studentSection.equals(other.studentSection))
			return false;
		if (studentSurname == null) {
			if (other.studentSurname != null)
				return false;
		} else if (!studentSurname.equals(other.studentSurname))
			return false;
		return true;
	}
	
	
	
	@Override
	public String toString() {
		return "[studentNo=" + studentNo + ", studentName=" + studentName + ", studentSurname=" + studentSurname
				+ ", studentAge=" + studentAge + ", studentSection=" + studentSection + "]";
	}



	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSurname() {
		return studentSurname;
	}

	public void setStudentSurname(String studentSurname) {
		this.studentSurname = studentSurname;
	}

	public String getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentSection() {
		return studentSection;
	}

	public void setStudentSection(String studentSection) {
		this.studentSection = studentSection;
	}

	
}
