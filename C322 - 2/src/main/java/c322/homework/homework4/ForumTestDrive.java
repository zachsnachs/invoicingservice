package c322.homework.homework4;

public class ForumTestDrive {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Student student = new Student(forum);

        String name = "James";
        String body =  "Here's to a nice Saturday!";
        String header = "Hello, Everyone!";

        forum.setForum(name, header, body);
    }
}
