public class teacher {
    String name;
    String personalnumber;
    String branch;

    public teacher() {
    }

    public teacher(String name, String personalnumber, String branch) {
        this.name = name;
        this.personalnumber = personalnumber;
        this.branch = branch;
    }
    
    public void print(){
        System.out.println("Name of Teacher : "+this.name);
        System.out.println("Personal Phone Number for This Teacher : "+this.personalnumber);
        System.out.println("Branch for This Teacher : "+this.branch);
    }
    
    
    
}

