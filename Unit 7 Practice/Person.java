import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person>
{
    private String name;

    public Person(String aName)
    {
        name = aName;
    }

    public String getName()
    {
        return name;
    }

    public int compareTo(Person otherPerson)
    {
        if (this.name.compareTo(otherPerson.name) > 0)
        {
            return 1;
        }
        else if (this.name.compareTo(otherPerson.name) < 0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }

    public String toString()
    {
        return this.name;
    }
    
    public static void main(String[] args)
    {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("Sosa"));
        list.add(new Person("Lil Wayne"));
        list.add(new Person("Chief Keef"));
        list.add(new Person("2 chainz"));
        list.add(new Person("Snoop Dogg"));
        
        System.out.println(list);
        Collections.sort(list);
        
        System.out.println(list);
    }
}