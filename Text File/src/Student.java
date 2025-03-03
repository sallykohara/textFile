public class Student
	{
		private String firstName;
		private String lastName;
		
		public Student(String f, String l)
		{
			firstName = f;
			lastName = l;
		}
		public String getFirstName()
		{
			return firstName;
		}
		public void setFirstName(String f)
		{
			firstName = f;
		}
		public String getLastName()
		{
			return lastName;
		}
		public void setLastName(String l)
		{
			lastName = l;
		}			
	}
