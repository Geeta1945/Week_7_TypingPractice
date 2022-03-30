package week7typingpractice;

/**
 * Person
 * Write a class with the name person. The class needs three fields(instance variables) with the names firstname,
 * lastname of type string and age of type int.
 * Write the following methods(instance methods)
 * Method named getFirstName without any parameters, it needs to return the value of the firstname field.
 * Method named getLastNAme without any parameters, it needs to return the value of the lastname field.
 * Method named getAge without any parameters, it needs to return the value of the age field.
 * Method named setFirstName with one parameter of type String, it needs to set value of the firstname field.
 * Method named setLastName with one parameter of type String, it needs to set value of the lastname field
 * Method named setAge with one parameter of type int, it needs to set value of the age field.
 * If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0;
 * Method named isTeen without any parameters, it needs to return true if the value of the age field is greater
 * than 12 nd less than 20, otherwise,return false.
 * Method name getFullName without any parameters, it needs to return the full name of the person.
 * In case both first name and last name fields are empty, String returns empty string.
 * In case firstname is empty string , return lastname --- as per below logic I have changed the description here.
 * In case lastname is empty String, return firstname
 * To check if 'string is empty, use the method isEmpty from string class .
 * For example - firstName.isEmpty() returns true if the string is empty or in other words, when the String does not
 * contain any characters.
 * TEST EXAMPLE
 *
 * TEST CODE: (Write below code in to main method then check out put)
 * Person person = new Person();
 * person.setFirstName(&quot;&quot;); // firstName is set to empty string
 * person.setLastName(&quot;&quot;); // lastName is set to empty string
 * person.setAge(10);
 * System.out.println(&quot;fullName= &quot; + person.getFullName());
 * System.out.println(&quot;teen= &quot; + person.isTeen());
 * person.setFirstName(&quot;John&quot;); // firstName is set to John
 * person.setAge(18);
 * System.out.println(&quot;fullName= &quot; + person.getFullName());
 * person.setLastName(&quot;Smith&quot;); // lastName is set to Smith
 * System.out.println(&quot;fullName= &quot; + person.getFullName());
 *
 * OUTPUT
 * fullName=
 * teen =false
 * fullName = John
 * teen =true
 * fullname =John Smith
 * NOTE:All methods should be defined as public NOT public static
 * NOTE: In total , you have to write 8 methods
 *
 */
public class Programme_14_person {

    // Instance variables
    String firstName, lastName;
    int age;

    public static void main(String[] args) {
        Programme_14_person person =new Programme_14_person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("full Name = " +person.getFullName());
        System.out.println("teen = "+person.isTeen());
       person.setFirstName("Johan"); // first name is set to john
        person.setAge(18);
        System.out.println("Full name : "+person.getFullName());
        System.out.println("teen = "+person.isTeen());
        person.setLastName("Smith");// lastname is set to smith
        System.out.println("Full Name : "+person.getFullName());

    }

    // Get Firstname Method
    public String getFirstName() {

        return firstName;
    }


    //Get Lastname method
    public String getLastName() {
        return lastName;
    }

    // Get age method
    public int getAge() {
        return age;
    }


    // Set the first name

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    // Set lastname method
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // set age method
    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    // Check is it Teen or not method
    public boolean isTeen(){
        if(getAge()>12 && getAge()<20){
            return true;
        }
        else{
            return false;
        }
    }

    //Get full name method
    public String getFullName() {
        if (getFirstName().isEmpty() && getLastName().isEmpty()) {
            return " ";
        } else if (firstName.isEmpty()) {
            return getLastName();
        } else if (getLastName().isEmpty()) {
            return getFirstName();
        }
        else{
            return getFirstName()+ " "+ getLastName();
        }

    }


}
