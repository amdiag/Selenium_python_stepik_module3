class GetNetAddress {
  public static void main(String[] args) {
    //put your task here
    //Scanner in = new Scanner(System.in);

    String IPADDRESS_PATTERN =
            //"(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
            "(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
    String MASK_PATTERN =
            "^(((25[245]|24[82]|224|192|128|[0]*).){3})(25[245]|24[82]|224|192|128|[0]*)";

    if ( args.length == 0 ){
      System.out.println("GetNetAddress <IP address> <Subnet mask>");
      return;
    }

    if ( !args[0].matches( IPADDRESS_PATTERN )  ){
      System.out.println("Wrong ip address");
      return;
    }

    if ( args.length != 2 ){
      System.out.println("GetNetAddress <IP address> <Subnet mask>");
      return;
    }

    if ( !args[1].matches( MASK_PATTERN )  ){
      System.out.println("Wrong mask");
      return;
    }

    String address[] = args[0].split("\\.");
    String mask[] = args[1].split("\\.");

    /*try {
      for (int i = 0; i < 4; i++) {
        if (((Integer.parseInt(mask[i]) < 0) || (Integer.parseInt(mask[i]) >= 255)) &&
                ((Integer.parseInt(address[i]) < 0) ||
                        (Integer.parseInt(address[i]) >= 255))) {
          System.out.println("Wrong ip address");
          return;
        }
      }
    }
    catch (Exception e){
      System.out.println("Wrong ip address");
      return;
    }*/

    if ( address.length != 4 ){
      System.out.println("Wrong ip address");
      return;
    }
    else if(mask.length != 4 ){
      System.out.println("Wrong mask");
      return;
    }



    System.out.println( resultAND( address, mask ) );
  }

  private static String resultAND(String[] address, String[] mask){
    //byte[]
    int[] result = new int[4];
    String addrNet = new String();

    for (int i = 0;i<4;i++) {
      result[i] = (/*(byte)*/ (  Integer.parseInt( address[i] ) & Integer.parseInt( mask[i] ) ));
      addrNet += Integer.toString( result[i] );
      if( i!=3 ) addrNet+=".";
    }



    return addrNet;
  }
}