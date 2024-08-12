package com.sgtest.Constructor;
class University
{
    String universityname;
    int  universityno;
    University( String universityname,int  universityno)
    {
        this.universityname=universityname;
        this.universityno=universityno;
        System.out.println("Universityname:"+universityname);
        System.out.println("Universityno:"+universityno);
    }
    void display()
    {
        System.out.println("Universityname:"+universityname);
        System.out.println("Universityno:"+universityno);
    }
}
class College
{
    String collegename;
    int collegeRegno;
    College(String collegename,int collegeRegno)
    {
        this.collegename=collegename;
        this.collegeRegno=collegeRegno;
        System.out.println("CollegeName:"+collegename);
        System.out.println("CollegeRegno:"+collegeRegno);
    }
    void display()
    {
        System.out.println("CollegeName:"+collegename);
        System.out.println("CollegeRegno:"+collegeRegno);
    }
}
class Student
{
    String studentname;
    int studentid;
    Student( String studentname,int studentid)
    {
        this.studentname=studentname;
        this.studentid=studentid;
        System.out.println("StudentName:"+studentname);
        System.out.println("Studentid:"+studentid);
    }
    void display()
    {
        System.out.println("StudentName:"+studentname);
        System.out.println("Studentid:"+studentid);
    }
}

public class UniversityEx
{
    public static void main(String[] args)
    {
        University u1=new University("VTU", 11001);
        College c1=new College("BKECollege",12);
        Student s1=new Student("Asha",111);
    }
}
