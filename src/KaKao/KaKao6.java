package KaKao;
import java.util.ArrayList;
import java.util.HashSet;

public class KaKao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 6, n = 6;
		String[] board = {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};

		Solution1 so = new Solution1();
		so.solution(m, n, board);
	}
}


class Solution1 {

	public int solution(int m, int n, String[] board) {
		int answer = 0;
		answer = getBlocks(board, m, n);

		System.out.println(answer);
		return answer;
	}

	public int getBlocks(String[] board, int m, int n) {
		ArrayList<String> deleteBlocks = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();
		HashSet<String> distinct = new HashSet<>(deleteBlocks);

		while (true) {
			list = computeBlocks(board, m, n);
			if (list.size() == 0)
				return deleteBlocks.size();
			
			distinct = new HashSet<>(list);
			list = new ArrayList<String>(distinct);
			deleteBlocks.addAll(list);

			board = deleteBlock(board, deleteBlocks);
		}
	}

	public ArrayList<String> computeBlocks(String[] board, int m, int n) {
		ArrayList<String> deleteBlocks = new ArrayList<>();
		
		for (int i = 0; i < m - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				String str = board[i];
				String str1 = board[i + 1];
				if (str.charAt(j) != 'X') {
					if (str.charAt(j) == str.charAt(j + 1) && str.charAt(j) == str1.charAt(j) &&
							str.charAt(j) == str1.charAt(j + 1)) {
						deleteBlocks.add(String.valueOf(i) + "," + String.valueOf(j));
						deleteBlocks.add(String.valueOf(i) + "," +  String.valueOf(j + 1));
						deleteBlocks.add(String.valueOf(i + 1) + "," +  String.valueOf(j));
						deleteBlocks.add(String.valueOf(i + 1) + "," +  String.valueOf(j + 1));
					}
				}
			}
		}
		
		return deleteBlocks;
	}

	public String[] deleteBlock(String[] board, ArrayList<String> deleteBlock) {
		for (int i = 0; i < deleteBlock.size(); i++) {
			String str = deleteBlock.get(i);
			String[] ss = str.split(",");
			int a = Integer.parseInt(ss[0]);
			int b = Integer.parseInt(ss[1]);
			
			StringBuilder builder = new StringBuilder(board[a]);
			builder.setCharAt(b, 'X');
			board[a] = builder.toString();
		}

		for (int i = board.length - 1; i >= 0; i--) {
			String str = board[i];
			for (int j = 0; j < str.length(); j++) {
				// 공백 문자열 찾음
				if (str.charAt(j) == 'X') {
					// 위로 공백 아닌 문자 검색
					for (int z = i - 1; z >= 0; z--) {
						String s = board[z];
						if (s.charAt(j) != 'X') {
							// 문자 밑으로 내리기
							StringBuilder builder = new StringBuilder(board[i]);
							builder.setCharAt(j, s.charAt(j));
							board[i] = builder.toString();

							// 내린 문자 치환
							builder = new StringBuilder(board[z]);
							builder.setCharAt(j, 'X');
							board[z] = builder.toString();
							break;
						}
					}
				}
			}
		}
		return board;
	}
}