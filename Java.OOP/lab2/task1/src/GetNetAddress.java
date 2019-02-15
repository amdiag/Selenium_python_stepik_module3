class GetNetAddress {
  public static void main(String[] args) {
    //put your task here
    //Scanner in = new Scanner(System.in);
    if ( args.length != 2 ){
      System.out.println("GetNetAddress <IP address> <Subnet mask>");
      return;
    }

    String address[] = args[0].split(".");
    String mask[] = args[1].split(".");

    if ( mask.length != 4 || address.length != 4 ){
      System.out.println("Wrong ip address");
      return;
    }

    for (int i = 0; i < 4; i++){
      if ( (Integer.parseInt( mask[i] ) <= 0 & Integer.parseInt( mask[i] ) >= 255 ) ||
              (Integer.parseInt( address[i] ) <= 0 & Integer.parseInt( address[i]) >= 255 ) ){
        System.out.println("Wrong ip address");
        return;
      }
    }




    //if (){}


    //byte[] result = mask;// & address.getBytes();
    System.out.println( resultAND( address, mask ) );
  }

  private static String resultAND(String[] address, String[] mask){
    byte[] result = null;
    String addrNet = null;


    return addrNet;
  }
}