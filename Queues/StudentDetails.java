package Queues;

public class StudentDetails 
{
  private String firstName;


  public StudentDetails(String firstName)  
  {
    this.firstName = firstName;
  }

  public String GetFirstName()
  {
    return firstName;
  }

  public void SetFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String toString()
  {
    return "Student -->" + 
              " firstName = '" + firstName + '\'' +
              ' ';
  }  
}
