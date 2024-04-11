import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MProcess extends Thread{
	private Socket socket;

	public MProcess(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			// doc du lieu tu socket
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			// ghi du lieu tu socket
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			Scanner sc = new Scanner(System.in);
			
				System.out.println("Server: "  );
				for (int i = 1; i < 1000; i++) {
					writer.println(i);
					writer.flush();
					Thread.sleep(1000);
				}
				
			//	writer.flush();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
