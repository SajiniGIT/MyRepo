package ncTestScript;

public class Ex_NestedLoops1 {

	public static void main(String[] args) {
		
		/*int k=1;

        for(int i =0 ; i <4 ; i++){
        	
        	for (int j=1 ; j <=4-i ; j++) {
        		
        		System.out.print( k);
        		
        		System.out.print("\t");  //to provide a space between numbers
        		
        		k++;
        	}
        	
        	System.out.println( " ");  //to point out to new line
        }*/
		
		/*int k=1;
		
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
                System.out.print( k);
        		System.out.print("\t"); 
				k++;
			}
			System.out.println( " ");
		}*/
		
		/*for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
                System.out.print( j);
        		System.out.print("\t"); 
			}
			System.out.println( " ");
		}*/
		int k=3;
		for(int i=0;i<3;i++) {
			
			for(int j=0; j<=i; j++) {
				System.out.print( k);
        		System.out.print("\t");
        		k +=3;
			}
			System.out.println( " ");
		}

	}

}
