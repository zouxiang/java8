package multithreading.t4.pipe_input_output;

import java.io.PipedOutputStream;

public class ThreadWrite extends Thread {
	private WriteData write;
	private PipedOutputStream output;
	
	public ThreadWrite(WriteData write, PipedOutputStream output) {
		super();
		this.write = write;
		this.output = output;
	}
	
	public void run() {
		write.writeMethod(output);
	}
}
