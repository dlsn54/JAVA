

public class CtrlFor05 {

	public static void main(String[] args) {
		int i,hap=0;
		
		for(i=1;i<=100;i++) {
			hap += i;
			
			if(hap>=500) {
				break;
			}
		}
		System.out.println("i = "+i+" hap = "+hap);
	}

}
