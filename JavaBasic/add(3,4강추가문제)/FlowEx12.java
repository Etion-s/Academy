package jan20;

class FlowEx12
{
	public static void main(String[] args) 
	{
		int sum =0;			// 합계를 저장하기 위한 변수.
		
		for(int i=1; i <= 10000; i++) {
			sum += i ;		//	sum = sum + i;
	     }
	     System.out.println( "1~" + i+ "까지의 합: " + sum);	// 에러발생!!!
	}
}