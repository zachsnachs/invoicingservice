package c322.homework.homework4.parta;

public class Student implements Observer, Display{
    private String name;
    private String header;
    private String body;
    private Forum forum;

    public Student(Forum forum){
        this.forum = forum;
        forum.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Update to the forum from " + name +
                "Title: " + header + "message body: " + body) ;

    }

    @Override
    public void update(String name, String header, String body) {
        this.name = name;
        this.header = header;
        this.body = body;
        display();

    }
}
