package calculation;

public class Triangle {

	public static void main(String[] args) {
		 
		// ������鐔�l�͎��R�ɕύX���Ă�������
		int a = 8;
		int b = 4;
		int c = 5;

		if (a == b && b == c && c == a) {
			System.out.println("���̎O�p�`�͐��O�p�`�ł��B");
		} else if (a == b || b == c || c == a) {
			System.out.println("���̎O�p�`�͓񓙕ӎO�p�`�ł��B");
		} else {
			System.out.println("���̎O�p�`�͕s���ӎO�p�`�ł��B");
		}
	}
}
