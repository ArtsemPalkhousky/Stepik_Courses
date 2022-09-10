package textAnalyzer;

public class TooLongTextAnalyzer implements TextAnalyzer{
    final private int MaxLength;

    public TooLongTextAnalyzer(int commentMaxLength){
        this.MaxLength = commentMaxLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > this.MaxLength) {
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}
