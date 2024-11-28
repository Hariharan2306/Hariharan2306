import java.util.Scanner;
public class Cycles extends PersonalDetails {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        //super.details();
        int yearExperience=sc.nextInt();
        decider(yearExperience);
    }
    static void decider(int yearExperience){
        ProfessionalCyclists obj1=new ProfessionalCyclists();//creating obj for prof class
        ProfessionalCyclists obj2=new BeginnerCyclists();//creating obj for beginner class
        if(yearExperience>=5)
            obj1.experience(yearExperience);
        else
            obj2.experience(yearExperience);
    }
}
