public class student {
    course course1;
    course course2;
    course course3;
    String name;
    String studentnumber;
    String Class1;
    double average;
    boolean isPass;

    public student() {
    }

    public student(String name, String studentnumber, String Class, course course1, course course2, course course3) {
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.name = name;
        this.studentnumber = studentnumber;
        this.Class1 = Class;
        this.average = 0;
        this.isPass = false;
    }
    void bulkExamNote(int note1, int note2, int note3, int vivanote1, int vivanote2, int vivanote3){
        if (note1 <= 100 && note1 >= 0) {
            this.course1.note = note1;
        }
        else{
            this.course1.note = 0;
        }
        if (note2 <= 100 && note2 >= 0) {
            this.course2.note = note2;
        }
        else{
            this.course2.note = 0;
        }
        if (note1 <= 100 && note1 >= 0) {
            this.course3.note = note3;
        }
        else{
            this.course3.note = 0;
        }
        if (vivanote1 <= 100 && vivanote1 >= 0) {
            this.course1.vivanote = vivanote1;
        }
        else{
            this.course1.vivanote = 0;
        }
        if (vivanote2 <= 100 && vivanote2 >= 0) {
            this.course2.vivanote = vivanote2;
        }
        else{
            this.course2.vivanote = 0;
        }
        if (vivanote3 <= 100 && vivanote3 >= 0) {
            this.course3.vivanote = vivanote1;
        }
        else{
            this.course3.vivanote = 0;
        }
    }
    void printNote(){
        System.out.println("**********************************************************************");
        System.out.println(this.name);
        System.out.println("Exam Note for "+this.course1.name +" is : "+this.course1.note);
        System.out.println("Exam Note for "+this.course2.name +" is : "+this.course2.note);
        System.out.println("Exam Note for "+this.course3.name +" is : "+this.course3.note);
        System.out.println("Teacher Note for "+this.course1.name +" is : "+this.course1.vivanote);
        System.out.println("Teacher Note for "+this.course2.name +" is : "+this.course2.vivanote);
        System.out.println("Teacher Note for "+this.course3.name +" is : "+this.course3.vivanote);
        System.out.println("**********************************************************************");
    }
    void isPass(){
        double examresult1 = (this.course1.note*0.8) + (this.course1.vivanote*0.2);
        double examresult2 = (this.course2.note*0.8) + (this.course2.vivanote*0.2);
        double examresult3 = (this.course3.note*0.8) + (this.course3.vivanote*0.2);
        this.average = (examresult1+examresult2+examresult3)/3;
        if (this.average>=55) {
            System.out.println("The general point for this student named "+this.name+" is "+this.average);
            System.out.println("This student qualified to complete "+this.Class1+". class");
            this.isPass = true;
        }
        else{
            System.out.println("The general point for this student named "+this.name+" is "+this.average);
            System.out.println("This student didn't qualify to complete "+this.Class1+". class");
            this.isPass = false;
        }
        System.out.println("Avarage Point : "+this.average);
        printNote();
    }
}