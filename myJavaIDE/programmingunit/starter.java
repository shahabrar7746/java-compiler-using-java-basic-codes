import java.io.IOException;
import java.util.Scanner;


public class starter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Type create to create a new file \nType run to existing code");
		Scanner s = new Scanner(System.in);
		String operation = s.nextLine();
		if(operation.equals("create")) {
			System.out.println("WHILE GIVING ANY NAME TO FILES THESE NAMES MUST BE AVOIDED \nRUN, LAUNCHER,STARTER, AND CREATEJAVAFILE ");
			createJavaFile JF = new createJavaFile();
			JF.create();
		}if(operation.equals("run")) {
			Run rn = new Run();
			System.out.println("File name ?");
			operation = s.nextLine();
			rn.run(operation);
			
		}else {
			System.out.println("Feature does not available");
		}

	}

}
