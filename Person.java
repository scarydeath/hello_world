class Person
{
	String firstname = "";
	String surname = "";

	public void setFirstname(String iFirstname)
	{
		firstname = iFirstname;
	}

	public void setSurname(String iSurname)
	{
		surname = iSurname;
	}

	public String getName()
	{
		return firstname + surname;
	}

	public void shout()
	{
		System.out.println("Heeeeyyyyy. Give me back my apple!");
	}

	Person();
}
