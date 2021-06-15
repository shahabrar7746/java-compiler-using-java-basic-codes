
import java.awt.Desktop;
import java.io.*;


public class Run {

	public void run(String fname) {
		try {
			FileWriter fw = new FileWriter("C:\\myJavaIDE\\tester.bat");
                          fw.write("cd\\\n");
					fw.write("cd myJavaIDE\n");
			fw.write("set path=\"C:\\Program Files\\Java\\jdk-15.0.2\\bin\";\n");
			fw.write("javac " + fname + "\n");
			fw.write("java " + fname + "\n");
			fw.write("pause");
			fw.close();//
//System.out.println(fname);
			launcher l = new launcher();
			l.launch();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
