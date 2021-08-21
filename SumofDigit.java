package week2.day2;

public class SumofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String text = "Tes12Le79af65";
		int sum = 0;
		for(int i=0;i<text.length();i++)
		{
			char temp=text.charAt(i);
			if (Character.isDigit(temp)) 
			{
		        int b = Character.getNumericValue(temp);
		        sum=sum+b;
			}   
			
		}
			
		System.out.println(sum);	

	}
	
	

	}


