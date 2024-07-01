class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    Student(Student std) {
        this.roll = std.roll;
        this.name = std.name;
    }
}

class ConstructorDemo {

    public static void main(String[] as) {
        System.out.println();
        Student nisu = new Student(7, "Nisarg");
        Student man = new Student(nisu);
        System.out.println(man.name);
        System.out.println(man.roll);
    }
}