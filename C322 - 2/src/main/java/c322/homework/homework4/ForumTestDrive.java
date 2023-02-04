package c322.homework.homework4;

public class ForumTestDrive {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Student student = new Student(forum);


        forum.setForum("James,: ", "Hello!: ",
                "Have a nice day!");
    }
}
