package Entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	 @Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", permanentadd=" + permanentadd + "]";
	}
	@Id
	    private long studentId;
	    private String studentName;
	    private String studentEmail;
	    
	    @OneToOne
	    private Address permanentadd;
		public Address getPermanentadd() {
			return permanentadd;
		}
		public void setPermanentadd(Address permanentadd) {
			this.permanentadd = permanentadd;
		}
		public long getStudentId() {
			return studentId;
		}
		public void setStudentId(long studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public String getStudentEmail() {
			return studentEmail;
		}
		public void setStudentEmail(String studentEmail) {
			this.studentEmail = studentEmail;
		}

}
