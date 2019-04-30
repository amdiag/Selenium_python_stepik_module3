import java.util.Random;

class PasswordGenerator {
  public static void main(String[] args) {
    //put your task here
    try{
      if (args.length != 2) {
        System.out.println("Wrong arguments");
        return;
      } else if (Integer.parseInt(args[0]) <= 0) {
        System.out.println("Wrong arguments");
        return;
      }
    }catch(Exception e){
      System.out.println("Wrong arguments");
      return;
    }

    int lenght = Integer.parseInt( args[0] );
    String symb = args[1];

    System.out.println(generatePass( lenght, symb ) );
  }

  private static String generatePass(int lenght, String symb) {
    StringBuilder pass = new StringBuilder();
    char[] massChar = symb.toCharArray();
    Random rand = new Random();
    for ( int i = 0; i < lenght; i++ ){
      pass.append( massChar[rand.nextInt(symb.length())] );
    }

    return pass.toString();
  }
}