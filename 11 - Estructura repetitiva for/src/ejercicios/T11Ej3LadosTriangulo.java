package ejercicios;

/**
 * Realizar un programa que lea los lados de n tri�ngulos, e informar: a) De
 * cada uno de ellos, qu� tipo de tri�ngulo es: equil�tero (tres lados iguales),
 * is�sceles (dos lados iguales), o escaleno (ning�n lado igual) b) Cantidad de
 * tri�ngulos de cada tipo. c) Tipo de tri�ngulo que posee menor cantidad.
 * 
 * @author Rad
 *
 */
public class T11Ej3LadosTriangulo {

	public static void main(String[] args) {

		int eq = 0;
		int iso = 0;
		int esc = 0;

		for (int i = 0; i <= 10; i++) {
			int l1 = (int) (Math.random() * (1 + 10) + 1);
			int l2 = (int) (Math.random() * (1 + 10) + 1);
			int l3 = (int) (Math.random() * (1 + 10) + 1);

			System.out.println("Lado 1: " + l1 + "\nLado 2: " + l2 + "\nLado 3: " + l3);

			if ((l1 == l2) && (l2 == l3)) {
				System.out.println(" + Equilatero : " + ++eq);
			}

			if ((l1 != l2) && (l1 == l3)) {
				System.out.println(" + Isosceles : " + ++iso);
			}
			if ((l2 == l1) && (l2 != l3)) {
				System.out.println(" + Isosceles : " + ++iso);
			}
			if ((l3 == l2) && (l3 != l1)) {
				System.out.println(" + Isosceles : " + ++iso);
			}

			if (l1 != l2 && l2 != l3 && l1 != l3) {
				System.out.println(" - Escaleno : " + ++esc);
			}
		}
		System.out.println("Equilatero : " + eq + " - Isosceles : " + iso + " - Escaleno : " + esc);
	}
}
