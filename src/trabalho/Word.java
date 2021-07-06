package trabalho;

/**
 * Representação de uma palavra do dicionario e seu significado.
 *
 * @author Anderson Sprenger, Cassiano Flores
 */

public class Word {
    private String word;
    private String meaning;

    public Word(String wordString, String meaning) {
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return "Palavra: " + word + "\nSignificado: " + meaning + '\n';
    }
}
