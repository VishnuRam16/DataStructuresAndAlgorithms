import java.util.ArrayList;
import java.util.List;

public class ArrayLists 
{ 

  private String firstName;
  private int age;

  public ArrayLists(String firstName, int age)  //Too late to change classname, would've kept it as StudentDetails :(
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

  public String toString()
  {
    return "Student {" + 
              " firstName = " + firstName + '\'' +
              " age = '" + age + '\'' +
              '}';
  }
  

  public static void main(String args[])
  {
      List<ArrayLists> studentDetails = new ArrayList<>();  //ArrayLists and ArrayList are different here, refer to above comment
      studentDetails.add(new ArrayLists("Vishnu", 21));
      studentDetails.add(new ArrayLists("Obi-Wan Kenobi", 60));
      studentDetails.add(new ArrayLists("Grogu", 50));
      studentDetails.add(new ArrayLists("Windu", 45));
      studentDetails.add(new ArrayLists("Anakin", 52));

      studentDetails.forEach(student -> System.out.println((student)));

  }
}
