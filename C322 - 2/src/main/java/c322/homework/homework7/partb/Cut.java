package c322.homework.homework7.partb;

public class Cut extends Command {
    Cut(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {

        if (editor.text.getSelectedText().isEmpty()) {
            return false;
        } else {

            backup();
            String source = editor.text.getText();
            editor.clipboard = editor.text.getSelectedText();
            editor.text.setText(cutString(source));
            return true;
        }
    }

    private String cutString(String source) {
        String start = source.substring(0, editor.text.getSelectionStart());
        String end = source.substring(editor.text.getSelectionEnd());
        return start + end;
    }
}