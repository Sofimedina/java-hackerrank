package org.skm.DataStructures;

import java.util.*;

public class SortingExample {

    static class Student implements Comparable<Student>{
        private int ID;
        private String FirstName;
        private float CGPA;

        @Override
        public int compareTo(Student o) {
            if (Float.compare(this.getCGPA(),o.getCGPA())==0){
                if (this.getFirstName().compareTo(o.getFirstName())==0){
                    return Integer.compare(this.getID(),o.getID());

                }else{
                    return this.getFirstName().compareTo(o.getFirstName());
                }

            }else{
                return Float.compare(o.getCGPA(),this.getCGPA());
            }

        }

        public Student(int ID, String firstName, float CGPA) {
            this.ID = ID;
            FirstName = firstName;
            this.CGPA = CGPA;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getFirstName() {
            return FirstName;
        }

        public void setFirstName(String firstName) {
            FirstName = firstName;
        }

        public float getCGPA() {
            return CGPA;
        }

        public void setCGPA(float CGPA) {
            this.CGPA = CGPA;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "ID=" + ID +
                    ", FirstName='" + FirstName + '\'' +
                    ", CGPA=" + CGPA +
                    '}';
        }


    }


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int numberOfStudents=Integer.parseInt(scanner.nextLine());

        List<Student> studentList=new ArrayList<>(numberOfStudents);

        for (int i=0;i<numberOfStudents;i++){
            String[] student=scanner.nextLine().split(" ");
            studentList.add(new Student(Integer.parseInt(student[0]),student[1],Float.parseFloat(student[2])));
        }

        /*
        5
        33 Rumpa 3.68
        85 Ashis 3.85
        56 Samiha 3.75
        19 Samara 3.75
        22 Fahim 3.76
        * */


        Collections.sort(studentList);

        studentList.stream().forEach(n-> System.out.println(n.getFirstName()));



    }
}
