import java.util.Scanner;

/**
 * Realizar un programa que permita ingresar el peso (en kilogramos) de piezas.
 * 
 * El proceso termina cuando ingresamos el valor 0. Se debe informar:
 * 
 * a) Cu�ntas piezas tienen un peso entre 9.8 Kg. y 10.2 Kg.?, cu�ntas con m�s
 * de 10.2 Kg.? y cu�ntas con menos de 9.8 Kg.?
 * 
 * b) La cantidad total de piezas procesadas.
 * 
 * @author Rad
 *
 */
public class T13EjPromedio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una medida entre 9.8 y 10.2 kg");
		double medida = sc.nextDouble();
		int pieza9k = 0;
		int pieza10k = 0;

		do {
			if (((medida >= 9.8) && (medida <= 10.2) ? true : false)) {
				if ((medida >= 9.8) && (medida <= 10.2) ? true : false) {

				}

			}

		} while (medida != 0);

	}
}