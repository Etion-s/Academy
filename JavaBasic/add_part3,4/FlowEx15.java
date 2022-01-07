package jan20;

class FlowEx15
{
	public static void main(String[] args) 
	{
		int sum =0;
		for(int i=1; i <=10; i+=2) {
			sum += i;		// sum = sum + i;
			System.out.println(i + " : " + sum);
		}
	}
}