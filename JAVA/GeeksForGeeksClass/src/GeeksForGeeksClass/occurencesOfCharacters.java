package GeeksForGeeksClass;

class occurencesOfCharacters{
	static final int MAX_CHAR = 256;
	int find=0;
	static void getOccuringCharacters(String str){
		int count[] = new int[MAX_CHAR];
		int length=str.length();
		for(int i=0;i<length;i++){
			count[str.charAt(i)]++;
		}
		char ch[]=new char[length];
		for (int i = 0; i < length; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {

				// If any matches found
				if (str.charAt(i) == ch[j])
				{
					find++;
				}
			}

			if (find == 1)
			{
				System.out.println(
					"Number of Occurrence of count in second loop  "
					+ str.charAt(i)
					+ " is:" + count[str.charAt(i)]);
			}
		}

	}
		public static void main(String[] args)
		{
			String name="kritika";
			getOccuringCharacters(name);
		}
}		