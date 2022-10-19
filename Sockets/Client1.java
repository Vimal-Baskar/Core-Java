import java.net.*;  
import java.io.*;  


class Client1 extends Thread {  
  static DataInputStream din = null;
  public void run(){
    try{
      while(true){
        String str=din.readUTF();
        if(str!=null){
          System.out.println("server says: "+str);
        }
      }
    }
    catch(Exception E){
      System.out.println(E);
    }
  }
  
  
  public static void main(String args[])throws Exception{  
    Socket s=new Socket("localhost",3333);  
    din=new DataInputStream(s.getInputStream());  
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
    Client1 t1 = new Client1();
    dout.writeUTF("client connected");
    dout.flush();
    t1.start();
    String str2="";  
    while(!str2.equals("stop")){  
      str2=br.readLine();  
      dout.writeUTF(str2);  
      dout.flush();  
    }  
 
    dout.close();  
    s.close();  
  }
}  
