package multithreading.t4.pipe_input_output;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriteData {
	public void writeMethod(PipedOutputStream out) {
		try {
			System.out.println("write: ");
			for(int i=0;i<300;i++) {
				String outData = "" + (i + 1);
				out.write(outData.getBytes());
				System.out.println(outData);
			}
			out.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
