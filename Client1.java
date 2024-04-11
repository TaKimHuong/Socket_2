import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
	public static void main(String[] args) {
		int port = 99;
		try {
			Socket socket = new Socket("localhost" , port);
			// doc du lieu tu socket
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			// ghi du lieu tu socket
//			PrintWriter writer = new PrintWriter(socket.getOutputStream());
//			Scanner sc = new Scanner(System.in);
			String message ;
			while(true) {
				// nhan tin nhan
				message= reader.readLine();
					System.out.println("server: " + message );
		}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("ket noi khong thanh cong");
			e.printStackTrace();
		}
	}

}
