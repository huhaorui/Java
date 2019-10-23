class Student {
    private String name;
    private int age;

    Student() {
        name = "无名氏";
        age = 20;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    boolean isSameAge(Student student) {
        return age == student.age;
    }
}

class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setAge(19);
        s1.setName("胡皓睿");
        s2.setAge(30);
        s2.setName("尊敬的陆老师");
        System.out.println("姓名:" + s1.getName() + " 年龄:" + s1.getAge());
        System.out.println("姓名:" + s2.getName() + " 年龄:" + s2.getAge());
        System.out.println(s1.isSameAge(s2) ? "两人的年龄相同" : "两人的年龄不同");
    }
}