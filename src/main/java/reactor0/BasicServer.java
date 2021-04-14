package reactor0;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author chenyang.yue@ttpai.cn
 */
public class BasicServer {

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = new ServerSocket(8080);

		while (!Thread.interrupted()) {
			Socket accept = serverSocket.accept();
			handler(accept);
		}

	}


	public static void handler(Socket socket){
		// 业务处理
	}
}
