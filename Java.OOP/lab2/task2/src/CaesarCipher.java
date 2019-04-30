class CaesarCipher {
  public static void main(String[] args) {
    int shift;
    try {
      if (args.length < 3 ) {
        shift = Integer.parseInt( args[1] )%26;
        System.out.println("Wrong arguments");
        return;
      }
      else shift = Integer.parseInt( args[1] )%26;
    }
    catch(Exception e){
      System.out.println("Wrong arguments");
      return;
    }

    if( args[0].equals("-d") ){       //decode
      System.out.println( decode( shift , args[2]) );
    }
    else if( args[0].equals("-e") ){    //encode
      System.out.println( encode( shift , args[2]) );
    }
    else
        System.out.println("Wrong arguments");
        return;
  }

  private static String encode(int shift, String str) {
    StringBuilder encoded = new StringBuilder();
    for (char i : str.toCharArray()) {
      if (Character.isUpperCase(i)){
        encoded.append(Character.toChars('A' + (i - 'A' + shift) % 26 ));
      }
      else if(Character.isLowerCase(i)){
        encoded.append(Character.toChars('a' + (i - 'a' + shift) % 26 ));
      }
      else{
        encoded.append(Character.toChars(i + shift));
      }
    }

    return encoded.toString();
  }

  private static String decode(int shift, String str) {
//    StringBuilder encoded = new StringBuilder();
//    for (char i : str.toCharArray()) {
//      encoded.append(Character.toChars( i - shift ));
//    }
//
//    return encoded.toString();
    return encode(26-shift, str);
  }
}