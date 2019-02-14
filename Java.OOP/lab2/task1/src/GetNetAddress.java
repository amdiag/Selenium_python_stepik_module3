class GetNetAddress {
  public static void main(String[] args) {
    //put your task here
    //Scanner in = new Scanner(System.in);
    if ( args.length != 2 ){
      System.out.println("GetNetAddress <IP address> <Subnet mask>");
      return;
    }

    byte[] address = args[0].getBytes();
    byte[] mask = args[1].getBytes();

    //if (){}


    byte[] result = mask;// & address.getBytes();
    System.out.println(result);
  }
}