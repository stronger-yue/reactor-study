package reactor0;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author chenyang.yue@ttpai.cn
 */
public class ClassicServer {

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = new ServerSocket(8080);

		while (!Thread.interrupted()) {
			new Thread(new Handler(serverSocket.accept())).start();
		}

	}


	static class Handler implements Runnable {
		Socket socket;

		Handler(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			// TODO 业务处理逻辑
		}
	}
}
