import java.util.*;

public class Exer12 {
	public static void menu() {
		System.out.println("Pressione 1 para \"fumante\"\nPressione 2 para \"não fumante\"\nSair - 0");
		System.out.print(": ");
	}
	public static boolean[] reservarArea(boolean[] assentos, int classe) {
		Scanner scan = new Scanner(System.in);
		boolean mostrarReserv = false;
		boolean lotados = false;
		boolean continuarEscolha = true;

		String principal = definePrincipal(classe);
		String classeAlternativa = defineAlternativa(classe);

		mostraArea(assentos, classe);

		boolean isClasseLotada = capacidade(assentos, classe);
		if (isClasseLotada) {
			System.out.println(principal + " lotada. é a ceitável ser colocado na área de " + classeAlternativa + "?");
			System.out.println("1. Sim\n2. Não");
			System.out.print(": ");
			int op = scan.nextInt();
			switch (op) {
				case 1:
					classe = inverteClasse(classe);
					if (capacidade(assentos, classe)) {
						System.out.println("Aguarde o próximo vôo.");
						lotados = true;
					} else {
						mostrarReserv = true;
					}

					break;
				case 2:
					continuarEscolha = false;
					System.out.println("Aguarde o próximo vôo.");
					break;
				default:
					System.out.println("Opção inválida");
					break;
			}
		}
		if (lotados) {
			continuarEscolha = false;
		}
		if (mostrarReserv == true && lotados == false) {
			mostraArea(assentos, classe);
		}
		if (continuarEscolha) {
			do {
				System.out.println("Escolha o número do assento.");
				System.out.print(": ");
				int poltrona = scan.nextInt();
				poltrona--;

				if (acessoIndevido(classe, poltrona)) {
					System.out.println("Número de assento inválido!");
				} else {
					if (assentoDisponivel(assentos, poltrona)) {
						assentos[poltrona] = true;
						exibeCartaoDeEmbarque(assentos, poltrona, classe);
						break;
					} else {
						System.out.println("Assento indisponível. Escolha outro.");
					}
				}

			} while (true);
		}
		return assentos;
	}

	public static boolean acessoIndevido(int classe, int cadeiraEscolhida) {
		int areaFumante[] = {0, 1, 2, 3, 4};
		int areaNaoFumante[] = {5, 6, 7, 8, 9};
		boolean acessoIndevido = true;

		if (classe == 1) {
			for (int i = 0; i < areaFumante.length; i++) {
				if (areaFumante[i] == cadeiraEscolhida) {
					acessoIndevido = false;
				}
			}
		}

		if (classe == 2) {
			for (int i = 0; i < areaNaoFumante.length; i++) {
				if (areaNaoFumante[i] == cadeiraEscolhida) {
					acessoIndevido = false;
				}
			}
		}
		return acessoIndevido;
	}

	public static void exibeCartaoDeEmbarque(boolean[] assentos, int poltrona, int classe) {
		String area = definePrincipal(classe);
		String classeAlternativa = defineAlternativa(classe);
		System.out.println("***********************");
		System.out.println("         Ticket          ");
		System.out.println(area);
		System.out.println("Poltrona Nº " + (++poltrona));
		System.out.println("***********************");
	}
	public static void mostraArea(boolean[] assentos, int classe) {

		int inicioSetor = 0;
		int fimSetor = 5;
		if (classe == 2) {
			inicioSetor = 5;
			fimSetor = assentos.length;
		}

		for (int i = inicioSetor; i < fimSetor; i++) {
			if (i != fimSetor - 1) {
				System.out.print("[" + (i + 1) + "]" + " - ");
			} else {
				System.out.print("[" + (i + 1) + "]");
			}
		}
		System.out.println();

		for (int i = inicioSetor; i < fimSetor; i++) {
			String ocupado;
			if (assentos[i]) {
				ocupado = "X";
			} else {
				ocupado = " ";
			}
			if (i != fimSetor - 1) {
				System.out.print("|" + ocupado + "|" + " - ");
			} else {
				System.out.print("|" + ocupado + "|");
			}
		}
		System.out.println();
	}
	public static String definePrincipal(int classe) {
		if (classe == 1) {
			return "Área Fumante";
		} else {
			return "Área não Fumante";
		}
	}
	public static String defineAlternativa(int classe) {
		if (classe == 1) {
			return "Área não Fumante";
		} else {
			return "Área Fumante";
		}
	}
	public static void pressioneEnter() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter para continuar.");
		scan.nextLine();
	}
	public static boolean assentoDisponivel(boolean[] assentos, int numeroPoltrona) {
		if (assentos[numeroPoltrona]) {
			return false;
		}
		return true;
	}
	public static boolean capacidade(boolean[] assentos, int classe) {
		int inicioSetor = 0;
		int fimSetor = 5;
		if (classe == 2) {
			inicioSetor = 5;
			fimSetor = assentos.length;
		}
		boolean cheio = true;
		for (int i = inicioSetor; i < fimSetor; i++) {
			if (!assentos[i])
			{
				cheio = false;
			}
		}
		return cheio;
	}
	public static int inverteClasse(int classe) {
		if (classe == 1) {
			return 2;
		} else {
			return 1;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean continua = true;
		boolean[] assentos = new boolean[10];

		do {
			menu();
			int classe = scan.nextInt();
			switch (classe) {
				case 1:
				case 2:
					assentos = reservarArea(assentos, classe);
					pressioneEnter();
					break;
				case 0:
					continua = false;
					break;
				default:
					System.out.println("Opção inválida.");
					break;
			}
		} while (continua);
	}
}
