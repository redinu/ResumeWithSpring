package com.example.demo;

public class Education {
	
		
		private int eduId;
		private String typeOfDegree; 
		private String institute; 
		private int year;
		private int personId;
		
		
		public int getEduId() {
			return eduId;
		}
		public void setEduId(int eduId) {
			this.eduId = eduId;
		}
		public String getInstitute() {
			return institute;
		}
		public void setInstitute(String institute) {
			this.institute = institute;
		}
	
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		} 	
		
		public String getTypeOfDegree() {
			return typeOfDegree;
		}
		public void setTypeOfDegree(String typeOfDegree) {
			this.typeOfDegree = typeOfDegree;
		}
		public int getPersonId() {
			return personId;
		}
		public void setPersonId(int personId) {
			this.personId = personId;
		}
		@Override
		public String toString() {
			return "Education [typeOfDegree=" + typeOfDegree + ", institute=" + institute + ", " + ", endDate="
					+ year + "]";
		}
		
		

}


