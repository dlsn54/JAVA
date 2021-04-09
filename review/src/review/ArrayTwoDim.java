package review;

public class ArrayTwoDim {

	public static void main(String[] args) {
		double score[][]= { {4.3,4.2},{3.0,3.2},{4.2,4.1},{3.8,3.2} };
		double sum=0;
		
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[0].length;j++) {
				sum+=score[i][j];
			}
		}
		int count=score.length*score[0].length;
		System.out.println("ÆòÁ¡= "+sum/count);
	}

}
