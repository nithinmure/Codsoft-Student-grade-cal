import java.util.*;
public class StudGradeCal{
  public static void main(String[] args){
    System.out.println("STUDENT GRADE CALCULATOR!!");
    System.out.println("----------------------------------------");
    System.out.println("Enter your MARKS secured in each subject when asked Accordingly!!");
    System.out.println("---------------------------------------------------------------");
    Scanner inp = new Scanner(System.in);
    System.out.print("English: ");
    int eng = inp.nextInt();
    System.out.print("Maths: ");
    int math = inp.nextInt();
    System.out.print("Physics: ");
    int phy = inp.nextInt();
    System.out.print("Chemistry: ");
    int che = inp.nextInt();
    System.out.print("Social Studies: ");
    int soc = inp.nextInt();
    System.out.print("Environmental Studies : ");
    int env = inp.nextInt();
    System.out.print("Biology : ");
    int bio = inp.nextInt();
    
    int total = eng+math+phy+che+env+bio+soc;
    int avg = total/7;
    String grade;
    if(avg>=90) grade = "O";
    else if(avg >= 80 && avg < 90) grade = "A+";
    else if(avg >= 70 && avg < 80) grade = "A";
    else if(avg >= 60 && avg < 70) grade = "B+";
    else if(avg >= 50 && avg < 60) grade = "B";
    else if(avg >= 40 && avg < 50) grade = "C";
    else grade = "F";

    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
    System.out.println();
    System.out.println("Validating!!!");
    try{
      Thread.sleep(3000);
    }catch(InterruptedException e){
      e.printStackTrace();
    }
    System.out.println("Check Your Grade Card Report!!\n");
    System.out.printf("Your Total Marks are %d out of %d\n",total,700);
    try{
      Thread.sleep(1500);
    }catch(InterruptedException e){
      e.printStackTrace();
    }
    System.out.printf("Your Average percentage is %d\n",avg);
    try{
      Thread.sleep(1500);
    }catch(InterruptedException e){
      e.printStackTrace();
    }
    System.out.printf("You Secured %s Grade\n",grade);
  }
}