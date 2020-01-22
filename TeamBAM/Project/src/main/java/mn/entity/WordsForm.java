package mn.entity;

import java.util.ArrayList;

public class WordsForm {
    private ArrayList<WordWrapper> words;

    public WordsForm() {
        this.words = new ArrayList<>();
    }

    public ArrayList<WordWrapper> getWords() {
        return words;
    }
    public void addWord(WordWrapper word)
    {
        this.words.add(word);
    }

    public void setWords(ArrayList<WordWrapper> words) {
        this.words = words;
    }
}
