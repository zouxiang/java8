package multithreading.t4.pipe_reader_writer;

import java.io.PipedReader;

public class ThreadRead extends Thread {
	private ReadData read;
	private PipedReader input;
	
	public ThreadRead(ReadData read, PipedReader input) {
		super();
		this.read = read;
		this.input = input;
	}
	
	public void run() {
		read.readMethod(input);
	}
	
}
