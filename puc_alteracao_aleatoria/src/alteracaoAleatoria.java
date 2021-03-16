import java.util.Random;

public class alteracaoAleatoria {

	public static String alterarCaractere(String frase) {

		Random gerador = new Random();
		gerador.setSeed(4);

		char sorteiaPrimeira = (char) ('a' + gerador.nextInt(26));
		char sorteiaSegunda = (char) ('a' + gerador.nextInt(26));

		String fraseAlterada = frase.replace(sorteiaPrimeira, sorteiaSegunda);
		MyIO.println(fraseAlterada);

		return frase;

	}

	public static void main(String[] args) {

		String frase = MyIO.readLine();
		while (!(frase.equals("FIM"))) {

			alterarCaractere(frase);
			frase = MyIO.readLine("");

		}

	}

}
