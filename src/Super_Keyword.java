public class Super_Keyword {
    public  static void main(String[] args)
    {
        Person person = new Person("Ajinkya","Sultane");
       Student student = new Student("Aj","Sultane",7.98);
        //System.out.println(person.first+person.last);
   person.showName();
   student.showName();
    }


}

class Person
{
    String first;
    String last;

    Person(String first,String last)
    {
        this.first =first;
        this.last = last;
    }
    void showName()
    {
        System.out.println(this.first + " " + this.last);
    }
}
class  Student extends  Person
{
    double gpa;

    Student(String first , String last , double gpa)
    {
      //  this.first = first;
      //  this.last = last;
        super(first, last);
        this.gpa = gpa;
    }

}
