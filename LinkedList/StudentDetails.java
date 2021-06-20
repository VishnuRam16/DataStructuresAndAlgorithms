package LinkedList;

public class StudentDetails 
{
  private String firstName;
  private int age;

  public StudentDetails(String firstName, int age)  //Too late to change classname, would've kept it as StudentDetails :(
  {
    this.firstName = firstName;
    this.age = age;
  }

  public String GetFirstName()
  {
    return firstName;
  }

  public void SetFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public int GetAge()
  {
    return age;
  }  

  public void SetAge(int age)
  {
    this.age = age;
  }

  // public boolean equals(Object o)
  // {
  //   if(this == o)
  //   {
  //     return true;
  //   }
  //   else if(o == null || getClass() != o.getClass())
  //   {
  //     return false;
  //   }

  //   StudentDetails studentDetails = (StudentDetails) o;
  //   if (age != studentDetails.age)
  //   {
  //     return false;
  //   }
  //   return firstName.equals(studentDetails.firstName);

  // }

  // public int hashCode()
  // {
  //   int result = firstName.hashCode();
  //   result = 31 * result + age.hashCode();
  //   return result;
  // }

  public String toString()
  {
    return "Student -->" + 
              " firstName = '" + firstName + '\'' +
              " age = '" + age + '\'' +
              ' ';
  }
  
}
