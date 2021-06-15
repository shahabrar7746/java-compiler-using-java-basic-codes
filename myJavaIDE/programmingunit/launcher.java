
import java.util.*;
import java.awt.*;
import java.net.*;
public class launcher {
	public void launch() {
		 
		if (Desktop.isDesktopSupported()) {
            Desktop d = Desktop.getDesktop();
           
            try {
                d.browse(new URI("file:///C:/myJavaIDE/tester.bat"));
                Toolkit.getDefaultToolkit().beep();
            } catch (Exception e) {
                System.out.println(e.getStackTrace());

            }

	}else {
		System.out.println(" not working");
	}

	}
}
