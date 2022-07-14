package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class b10926 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> idList = new ArrayList<>();
		String id = in.next();
		idList.add(id);

		if (idList.get(0) == id) {
			System.out.print(id + "??!");
		}

	}

}
