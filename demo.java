class demo{
	public static void main(String[] args){
		int num = 786;
		int sum = 0;

		while (num!= 0){
			int ld = num % 10;
			sum += ld;
			num /= 10;
		}
		System.out.println(sum);
	}
}
