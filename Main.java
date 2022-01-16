public class Main {

    public static void main(String[] args) {
    //Example 1
	System.out.println("Hello, I am Poh Yi Jie Nicholas!");
    //Example 3
    String module = "CSC1009";
    switch(module)
    {
        case "CSC1006":
            System.out.println("Mathematics 2");
            break;
        case "CSC1007":
            System.out.println("Operating Systems");
            break;
        case "CSC1008":
            System.out.println("Data Structures and Algorithms");
            break;
        case "CSC1009":
            System.out.println("Object Oriented Programming");
            break;
        case "CSC1010":
            System.out.println("Computer Networks");
            break;
        default:
            System.out.println("Unknown Currency");
            break;
    }
    System.out.println("After switch");

    //Example 4
        for(int x = 102; x > 65; x = x-1){
		if(x % 2 == 1){
			System.out.println("value of x : " + x);
            		System.out.println("\n");
		}
        }
    }
}
