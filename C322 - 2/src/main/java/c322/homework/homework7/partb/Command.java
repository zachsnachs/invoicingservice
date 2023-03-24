package c322.homework.homework7.partb;

public abstract class Command {
    public Editor editor;
    private String backup;


    Command(Editor editor) {
        this.editor = editor;


    }

    void backup() {
        backup = editor.text.getText();
    }

    void undo(){
        editor.text.setText(backup);
    }

    public abstract boolean execute();

}