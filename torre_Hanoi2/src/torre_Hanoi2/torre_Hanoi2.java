package torre_Hanoi2;
	import java.util.Scanner;
	public class torre_Hanoi2 {

		private static void mover(int O, int D) {
			System.out.println(O + " | " + D);
		}

		static void hanoi(int n, int O, int D, int T) {

			if (n > 0) {
				hanoi(n - 1, O, T, D);
				mover(O, D);
				hanoi(n - 1, T, D, O);
			}

		}
		public static void main(String[] args) {

			int n; // numero de discos

		
			Scanner entrada = new Scanner(System.in);
			System.out.println("Informe a quantidade dos discos: ");
			n = entrada.nextInt();

			
			torre_Hanoi2.hanoi(n, 1, 3, 2);
		}
	}

