class Discount
{
	public static void main(String[] args)
	{
		int table,chair;
		int discount;
		int total;
		table=500;
		chair=400;
		total=table+chair;
		System.out.println("sum of all amount :- "+total);
		if(total>1000)
		{
			discount=total/100*10;
		}
		else
		{
			discount=0;
		}
		total=(table+chair)-discount;
		System.out.println("Total :- "+total);
	}
}