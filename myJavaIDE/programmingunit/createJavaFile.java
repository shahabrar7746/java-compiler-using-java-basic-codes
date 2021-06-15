
import java.util.*;



import java.io.*;
public class createJavaFile {

	public  void create() throws IOException {
		Scanner s = new Scanner(System.in);
		while(true) {
			ArrayList<String> al = new ArrayList<>();
			System.out.println("Type your file name(with extension),does not contain spaces");
		String F_name = s.nextLine();
		FileWriter code = new FileWriter("C:\\myJavaIDE\\" + F_name);
		
		System.out.println("Type your code below \nif finished hit enter and type exit");
		for(int i = 1;i>0;i++) {
			String temp = s.nextLine();
			
						if(temp.equals("exit") ){
			
			break;
			}
						al.add(temp);
			
		}
		
		

		for(int j = 0;j<al.size();j++) {
			code.write(al.get(j) + "\n");
		}
		code.close();
		System.out.println("wanna test it ?");
		 String F_name1 = s.nextLine();
		 System.out.println(F_name1);
		if(F_name1.equals("yes")) {
			Run compile = new Run();
			compile.run(F_name);
		}
		}
	}
		
	}


