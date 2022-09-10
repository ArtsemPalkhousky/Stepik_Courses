package textAnalyzer;

public abstract class KeywordAnalyzer implements TextAnalyzer{
    protected abstract String[] getKeywords();
    protected abstract Label getLabel();
    @Override
    public Label processText(String text) {
        String[] keywords = getKeywords();
        for (String keyword : keywords) {
            if (text.toLowerCase().contains(keyword.toLowerCase())) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
