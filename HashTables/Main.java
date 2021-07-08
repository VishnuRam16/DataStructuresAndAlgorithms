package HashTables;

public class Main 
{
  public static void main(String[] args)
  {
    StudentDetails vishnu = new StudentDetails("Vishnu","Ram");
    StudentDetails obi = new StudentDetails("Obi-Wan", "Kenobi");
    StudentDetails grogu = new StudentDetails("Grogu", "Yoda");
    StudentDetails windu = new StudentDetails("Master", "Windu" );
    StudentDetails anakin = new StudentDetails("Anakin", "Skywalker");

    Hashtable hash = new Hashtable();

    hash.Put("Ram", vishnu);
    hash.Put("Kenobi", obi);
    hash.Put("Yoda", grogu);
    hash.Put("Windu", windu);
    hash.Put("Skywalker", anakin);

    hash.DisplayHashTable();

    System.out.println("Get key Windu: " + hash.Retrieve("Windu"));

  } 
}
