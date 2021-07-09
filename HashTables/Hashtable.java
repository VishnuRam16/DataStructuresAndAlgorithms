package HashTables;

public class Hashtable 
{
  private KeyValuePairing[] hashtable;

  public Hashtable()
  {
    hashtable = new KeyValuePairing[10];
  }

  private int HashKey(String key)
  {
    return key.length() % hashtable.length;
  }

  public void Put(String key, StudentDetails studentDetails)
  {
    int hashedKey = HashKey(key); 
    if(Occupied(hashedKey))
    {
      int stopIndex = hashedKey;
      if(hashedKey == hashtable.length - 1)
      {
        hashedKey = 0;
      }
      else
      {
        hashedKey++;
      }
      while(Occupied(hashedKey) && hashedKey != stopIndex)
      {
        hashedKey = (hashedKey + 1) % hashtable.length;
      }

    }

    if(Occupied(hashedKey))
    {
      System.out.println("Position filled at: " +hashedKey);
    }
    else
    {
      hashtable[hashedKey] = new KeyValuePairing(key, studentDetails);
    }

  }

  public StudentDetails Retrieve(String key)
  {
    int hashedKey = FindKey(key); 
    if(hashedKey == -1)
    {
      return null;
    }
    return hashtable[hashedKey].studentDetails;
  }

  public StudentDetails Remove(String key)
  {
    int hashedKey = FindKey(key); 
    if(hashedKey == -1)
    {
      return null;
    }

    StudentDetails studentDetails = hashtable[hashedKey].studentDetails;
    hashtable[hashedKey] = null;

    KeyValuePairing[] previousHastable = hashtable;
    hashtable = new KeyValuePairing[previousHastable.length];

    for(int i = 0; i < previousHastable.length; i++)
    {
      if(previousHastable[i] != null)
      {
          Put(previousHastable[i].key, previousHastable[i].studentDetails);
      }
    }

    return studentDetails;
  }

  public void DisplayHashTable()
  {
    for(int i =0; i < hashtable.length; i++)
    if(hashtable[i] == null)
    {
      System.out.println("Empty");
    }
    else
    {
      System.out.println(hashtable[i].studentDetails);
    }

    System.out.println("\n");

  }

  public boolean Occupied(int index)
  {
    return hashtable[index] != null;
  }

  private int FindKey(String key)
  {
    int hashedKey = HashKey(key);
    if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key))
    {
      return hashedKey;
    }
  
    int stopIndex = hashedKey;
    if(hashedKey == hashtable.length - 1)
    {
      hashedKey = 0;
    }
    else
    {
      hashedKey++;
    }
    while(hashedKey != stopIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].key.equals(key))
    {
      hashedKey = (hashedKey + 1) % hashtable.length;
    }

    if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key))
    {
      return hashedKey;
    }
    else
    {
      return -1;
    }
    
  }

  
}
