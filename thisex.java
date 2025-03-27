class thisex
	{
		int rollno;
		String name;
		public thisex(int rollno,String name)
		{
			this.rollno=rollno;
			this.name=name;
		}
		void display()
		{
			System.out.println(rollno);
			System.out.println(name);

		}
		public static void main(String args[])
		{
			thisex s1=new thisex(1234,"xyz");
			
		}
	}
