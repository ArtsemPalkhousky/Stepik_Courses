package textAnalyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer{
    final String[] NegativeKeywords;

    public NegativeTextAnalyzer() {
        this.NegativeKeywords = new String[]{":(", "=(", ":|"};
    };

    @Override
    protected String[] getKeywords() {
        return NegativeKeywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
