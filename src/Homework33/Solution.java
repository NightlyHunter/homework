package Homework33;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by user on 15.02.2017.
 */
public class Solution {
    Course English = new Course("English",40,"Valenok");
    Course Java= new Course(new Date(2017,12,10),"Java");
    Course Handmade= new Course("Handmade",25,"Gorilla");
    Course CSS= new Course("CSS",120,"Jadai");
    Course KungFu=new Course("Kung-Fu",200,"Panda");
    Course[] var1={English,Java,CSS};
    Course[] var2={Handmade,KungFu};
    Student DjangoUnchained=new Student("Django","Unchained",15);
    Student DoctorStarnge=new Student ("Starnge",var2);
    CollegeStudent Deadpool=new CollegeStudent("Wilson","Wayde",15);
    CollegeStudent BabaJaga=new CollegeStudent("Jaga",var2);
    CollegeStudent DedPechto=new CollegeStudent("Ded","Pechto",13,"Army",666,1000005);
    SpecialSudent Superman=new SpecialSudent("L",var1);
    SpecialSudent Batman=new SpecialSudent("Bruce","Wayne",12,666);
    SpecialSudent Wolwerine=new SpecialSudent("Hughe","Jackman",15);


}
