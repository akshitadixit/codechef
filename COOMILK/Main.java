import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			String[] S = new String[N];
			for (int i = 0; i < S.length; i++) {
				S[i] = sc.next();
			}

			System.out.println(solve(S) ? "YES" : "NO");
		}

		sc.close();
	}

	static boolean solve(String[] S) {
		return IntStream.range(0, S.length)
				.allMatch(i -> !S[i].equals("cookie") || (i + 1 < S.length && S[i + 1].equals("milk")));
	}
}
