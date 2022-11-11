package ch05;

public class ArrayMultiEx {

	public static void main(String[] args) {
//		int[] scores = { 81, 90, 100 };

		int[][] scores = { { 80, 90, 96 }, { 76, 88, 97 } };

		System.out.println("1차원 배열길이(반의 수): " + scores.length);
		System.out.println("2차원 배열길이(첫째반의 학생 수): " + scores[0].length);
		System.out.println("3차원 배열길이(둘째반의 학생 수): " + scores[1].length);
		System.out.println("1번째 반의 3번째 : " + scores[0][2]);
		System.out.println("2번째 반의 2번째 : " + scores[1][1]);

		// 첫번째 반의 평균점수

		int class1Sum = 0;
		for (int i = 0; i < scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("첫번째 반의 평균" + class1Avg);

		// 2번째 반의 평균점수

		int class2Sum = 0;
		for (int j = 0; j < scores[1].length; j++) {
			class2Sum += scores[1][j];
		}
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("두번째 반의 평균" + class2Avg);

		// 전체 학생의 평균점수

		int totalStudent = 0;
		int totalSum = 0;

		for (int i = 0; i < scores.length; i++) {
			totalStudent += scores[i].length; // 총 학생수

			for (int k = 0; k < scores[i].length; k++) {
				totalSum += scores[i][k]; // 점수 합산
			}

		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생 평균" + totalAvg);
		
		int [][] mathScores = new int [2][3];
		
		for (int l = 0; i < mathScores.length; l++ ) {
			for (int m = 0; m < mathScores[l].length ; m++) {
				System.out.println("수학점수: " + mathScores[l][m]);
			}
		}
		
		mathScores[0][0] = 80;
		mathScores[0][1] = 82;
		mathScores[0][2] = 84;
		mathScores[1][0] = 85;
		mathScores[1][1] = 87;
		mathScores[1][2] = 89;
		}

		
		
	}
}
