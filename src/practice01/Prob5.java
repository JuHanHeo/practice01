package practice01;

public class Prob5 {

	public static void main(String[] args) {

		String num=null;
		int cnt = 0;
		
		for(Integer i=0;i<=99;i++){
			num = i.toString();
			
			for(int j=0;j<num.length();j++){
				if(num.charAt(j)=='3' || num.charAt(j)=='6' || num.charAt(j)=='9'){
					cnt++;
				}
			}
			
			if(cnt!=0){
				System.out.print(i+" ");
				for(int j=0;j<cnt;j++){
					System.out.print("짝");
				}
				System.out.println();
				System.out.println();
			}
			
			cnt=0;
			
		}
	}
}