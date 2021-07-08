package HashTables;

public class StudentDetails 
{
  private String firstName;
  private String lastName;


  public StudentDetails(String firstName, String lastName)  
  {
    this.firstName = firstName;
    this.lastName  = lastName; 
  }

  public String GetFirstName()
  {
    return firstName;
  }

  public void SetFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String GetLastName()
  {
    return lastName;
  }

  public void SetLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public String toString()
  {
    return "Student -->" + 
              " firstName = " + firstName + "," +
              " lastName  = " + lastName  +
              ' ';
  }    
}
