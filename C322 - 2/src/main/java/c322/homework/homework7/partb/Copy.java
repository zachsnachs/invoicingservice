package c322.homework.homework7.partb;

public class Copy extends Command {
    @Override
    public boolean execute() {
        editor.clipboard = editor.text.getSelectedText();
        return false;
    }

    public Copy(Editor editor){
        super(editor);
    }
}
