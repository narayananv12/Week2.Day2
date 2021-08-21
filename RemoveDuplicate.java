package week2.day2;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialize the variables
				String text = "We learn java basics as part of java sessions in java week1";
				int count = 0;
				
				//Split and store in Array
				String[] textArr = text.split(" ");

				//Iterate to compare words		
				for (int i = 0; i < textArr.length; i++) {

					for (int j = i + 1; j < textArr.length; j++) {

						if (textArr[i].equals(textArr[j])) {
							
							//Removing the duplicates
							textArr[i] = "";
							count++;
						}
					}
				}
				
				//Printing the string if duplicate exists
				if (count > 1) {
					for (int k = 0; k < textArr.length; k++)
						System.out.print(textArr[k] + " ");
				}
				else
					System.out.println("No Duplicates in the string");

			}

		
	}


