package trabalho;

/**
 * Representação de uma palavra do dicionario e seu significado.
 *
 * @author Anderson Sprenger, Cassiano Flores
 */

public record Word(String word, String meaning) {

    // TODO: verificar se records precisam de getters...

    @Override
    public String toString() {
        return "Palavra: " + word + "\nSignificado: " + meaning + '\n';
    }
}
