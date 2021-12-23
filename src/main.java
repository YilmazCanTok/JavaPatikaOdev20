public class main {
    public static void main(String[] args) {
        course maths = new course("Mathemathics","101","Mat");
        course physics = new course("Physics","101","Phy");
        course chemistry = new course("Chemistry","101","Che");
        teacher teacher1 = new teacher("Yılmaz","054869753213","Mat");
        teacher teacher2 = new teacher("Muhammet","054869753213","Phy");
        teacher teacher3 = new teacher("Mustafa","054869753213","Che");
        student student1 = new student("Müslüm Gürses","1596354","1",maths,physics,chemistry);
        student student2 = new student("Ferdi Tayfur","1596364","1",maths,physics,chemistry);
        student student3 = new student("Orhan Gencebay","1596374","1",maths,physics,chemistry);
        maths.addTeacher(teacher1);
        physics.addTeacher(teacher2);
        chemistry.addTeacher(teacher3);
        student1.bulkExamNote(55, 80, 10, 82, 25, 61);
        student1.isPass();
        
        student2.bulkExamNote(75, 68, 95, 90, 80, 95);
        student2.isPass();
        
        student3.bulkExamNote(10, 80, 30, 20, 90, 40);
        student3.isPass();
        

    }
}
