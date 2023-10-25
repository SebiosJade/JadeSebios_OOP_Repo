package Student;

class StudentInterface {
   public static void main(String[] args) {
   
      Student s1 = new Student();
      
      s1.setFirstName("Simon Jhade");
      s1.setMiddleName("Mamangon");
      s1.setLastName("Sebios");
      s1.setSuffix("N/A");
      
      System.out.println("Firstname: " + s1.getFirstName());
      System.out.println("Middle Name: " + s1.getMiddleName());
      System.out.println("Last Name: " + s1.getLastName());
      System.out.println("Suffix" + s1.getSuffix());
      System.out.println("Full Name: " + s1.getFullName());
   }
}