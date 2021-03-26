package Task5;

public class School {
    String name;
    int pupils;
    int teachers;

    public School(String name) {
        this.name = name;
        System.out.println("My school");
    }



    public School (String name, int pupils){
        this (name);
        this.pupils = pupils;
        System.out.println("Pupils");
    }


    public School (String name, int pupils, int teachers){
        this(name, pupils);
        this.teachers = teachers;
        System.out.println("Teachers");
    }
}
