import java.util.ArrayList;

class Main {  
  public static void main(String[] args) {    
    Student student1 = new Student();    
    student1.setName("Arnold Spielberg");    
    student1.setGPA(4.0);    
    student1.setMajor("Electrical Engineering");
    // or can do this with the dot operator   //student1.name = "Arnold Spielberg";    
    //student1.gpa = 4.0;    
    //student1.major = "Electrical Engineering";    
    student1.print();//call student1

    Student student2 = new Student();
    student2.name = "Mengying Yu";
    student2.gpa = 4.3;
    student2.major = "Information Systems";

    student2.print();//call student2
    
    ArrayList<Double> gpas = new ArrayList<Double>();

    gpas.add(student1.gpa);
    gpas.add(student2.gpa);

    double sum = 0.0;
    for (double i : gpas) {
      sum = sum + i;
    }

    double average = sum/gpas.size();
    System.out.println("The average GPA is " + average);

  }

}