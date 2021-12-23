public class course{
    teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int vivanote;

    public course() {
    }
    
    public course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.vivanote = 0;
    }
    void addTeacher(teacher teacher){
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            System.out.println("The operation is succeed."+"The teacher for this "+this.name+" is "+teacher.name);
        }
        else{
            System.out.println("Sorry, We couldnt add your teacher in this course. Wrong branch. Please try to add another teacher for this course...");
        }
    } 
    void printTeacher(){
        if (teacher.name.equals(null)) {
            System.out.println("There is no teacher for this lesson..."+this.name);
        }
        else{
            System.out.println("Teacher : "+teacher.name);
        }
    }
}
