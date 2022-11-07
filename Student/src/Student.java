public class Student {
    private int stt;
    private  String name;
    private static String truong = "codeGym";

    public Student(int stt, String name) {
        this.stt = stt;
        this.name = name;
    }
    public void hien(){
        System.out.println(stt + " name " + truong);
    }

    public static void main(String[] args) {
        Student student = new Student(1, "nam");
        Student student1 = new Student(2, "manh");
        student1.hien();
        student.hien();
    }
}
