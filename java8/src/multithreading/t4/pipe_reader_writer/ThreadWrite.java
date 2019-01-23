package multithreading.t4.pipe_reader_writer;

import java.io.PipedWriter;

public class ThreadWrite extends Thread {
	private WriteData write;
	private PipedWriter output;
	
	public ThreadWrite(WriteData write, PipedWriter output) {
		super();
		this.write = write;
		this.output = output;
	}
	
	public void run() {
		write.writeMethod(output);
	}
}
