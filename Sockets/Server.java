import java.net.*;  
import java.io.*;  
import java.util.*;

class ReadClient extends Thread {
  DataInputStream din = null;
  ReadClient(DataInputStream din){
    this.din = din; 
  }
  
  public void run(){
    try{
      String str = "";
      while(!str.equals("stop")){
        // System.out.println("Hi");
        str = din.readUTF();
        if(str!=null){
          System.out.println("client says: "+str);
        }
      }
    }
    catch(Exception E){
      System.out.println("Error");
    }
  }
  
}

class WriteClient extends Thread {
  ArrayList<DataOutputStream> arr = new ArrayList<DataOutputStream>();
  Scanner sc = new Scanner(System.in);
  void add(DataOutputStream dout){
    arr.add(dout);
  }
  public void run(){
    String str2 = "";
    try{ 
      while(!str2.equals("stop")){      
        str2=sc.nextLine();
        if(str2!=null){
          for(int i=0;i<arr.size();i++){
            arr.get(i).writeUTF(str2);
            arr.get(i).flush();
          }
        }
        //dout.writeUTF(str2);  
        //dout.flush();  
      }
    }
    catch(Exception e){
      System.out.println("error");
    }
  }
}


class ServerHandler extends Thread {
  DataInputStream din = null;
  //BufferedReader br = null;
  //Scanner scanner;
  String str2="";
  //ArrayList<Socket> list;
  ServerHandler(Socket s){
    try{
      din=new DataInputStream(s.getInputStream());    
    }
    catch(Exception e){
      
    }
  }
  
  public void run(){
    new ReadClient(din).start();
  }
  
}

class Server extends Thread{ 

  public static void main(String args[])throws Exception{  
    ServerSocket ss=new ServerSocket(3333); 
    ArrayList<Socket> arr = new ArrayList<Socket>();
    WriteClient writing = new WriteClient();
    while(true){
      Socket s=ss.accept(); 
      new ServerHandler(s).start();
      DataOutputStream dout = new DataOutputStream(s.getOutputStream());
      writing.add(dout);
      writing.start();
    }
    
  }
}  
