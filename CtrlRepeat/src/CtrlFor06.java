

public class CtrlFor06 {

	public static void main(String[] args) {
		int i,hap=0;
		
		for(i=0;i<=100;i++) {
			if(i%7==0)
				continue;
			hap+=i;
		}
		System.out.println("1부터 100까지의 합 중에 7의 배수는 제외한 합 = "+hap);
	}

}
