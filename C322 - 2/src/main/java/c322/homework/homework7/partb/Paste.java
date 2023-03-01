package c322.homework.homework7.partb;

public class Paste extends Command {
    Paste(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) {
            return false;
        } else {

            editor.text.insert(editor.clipboard, editor.text.getCaretPosition());
            return true;
        }
    }
}