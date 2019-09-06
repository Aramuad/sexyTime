package monica;

import java.util.Scanner;

public class sexyTime {

	public static void main(String[] args) {
		
		int feeling;
		int annoyed;
		String notBusy;
		String no;
		String yes;
		
		Scanner sc = new Scanner(System.in);
		
		no = "no";
		yes = "yes";
		
		System.out.println();
		System.out.println("Hey Monica, enter \"yes\" or \"no\"...");
		System.out.print("We have more than an hour before we have to be somewhere: ");
		notBusy = sc.nextLine().toLowerCase();
		
			if (notBusy.contentEquals(no)) {
			
				System.out.println();
				System.out.println("Sorry, friend, no time for funny bussiness...");
				System.out.println();
				System.exit(0);
			}
		
		System.out.println();
		System.out.println("On a scale of 1 (not so good) - 10 (good)...");
		System.out.print("How are you feeling today?: ");
		
		feeling = sc.nextInt();
		System.out.println();
		
		System.out.println("On a scale of 1 (be my pillow) - 10 (go away!)...");
		System.out.print("How annoyed are you with me right now?: ");
		annoyed = sc.nextInt();
		
			if ((feeling - annoyed) >= 7 && notBusy.contentEquals(yes)) {
				
				System.out.println();
				System.out.println("She wants the wants the D!");
				System.out.println();
				
			} else if ((feeling - annoyed) >= 6 && notBusy.contentEquals(yes)) {
				
				System.out.println();
				System.out.println("Go for it compa, there's a good chance she's down...");
				System.out.println();
			
			} else if ((feeling - annoyed) >= 5 && notBusy.contentEquals(yes)) {
				
				System.out.println();
				System.out.println("Make the attempt, but be ready for failure...");
				System.out.println();
				
			} else if ((feeling - annoyed) >= 4 && notBusy.contentEquals(yes)) {
				
				System.out.println();
				System.out.println("No funny bussiness; bring her cheese, maybe give her space...");
				System.out.println();
				
			} else if ((feeling - annoyed) >= 3 && notBusy.contentEquals(yes)) {
				
				System.out.println();
				System.out.println("Get her flowers, chocolate, and a foot rub immediately...then go away.");
				System.out.println();
				
			} else {
				
				System.out.println();
				System.out.println("The data is too complicated, don't make any sudden movements...");
				System.out.println();
			}
		
			
	}	

}