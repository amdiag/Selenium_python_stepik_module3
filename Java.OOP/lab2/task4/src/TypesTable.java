class TypesTable {
  public static void main(String[] args) {
    //put your task here

    System.out.printf("%-7s %-22s %-23s %s%n","Type", "Min", "Max", "Size" );
    System.out.printf("%-7s %-22d %-23d %d%n", "Long", Long.MIN_VALUE, Long.MAX_VALUE, Long.SIZE/8);
    System.out.printf("%-7s %-22d %-23d %d%n", "Integer", Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.SIZE/8);
    System.out.printf("%-7s %-22d %-23d %d%n", "Short", Short.MIN_VALUE, Short.MAX_VALUE, Short.BYTES);
    System.out.printf("%-7s %.1E %37.16E %d%n","Double",Double.MIN_VALUE, Double.MAX_VALUE, Double.BYTES);
    System.out.printf("%-7s %-22d %-23d %d%n", "Byte",Byte.MIN_VALUE,Byte.MAX_VALUE,Byte.BYTES);
    //System.out.printf("%-7s %.1E %37.17E %d%n","Double",Double.MIN_VALUE, Double.MAX_VALUE, Double.BYTES);
    //System.out.println("Double 4.9E-324 1.7977931348723157E+308 8");


    System.out.printf("%-7s %.1E %28.7E %11d%n","Float",Float.MIN_VALUE,Float.MAX_VALUE,Float.BYTES);
    System.out.printf("%-7s %22s %23s %d%n",Character.TYPE,Character.MIN_VALUE,Character.MAX_VALUE,Character.BYTES);
    //System.out.printf("%-7s %22d %23d %d%n",Byte.TYPE,Byte.MIN_VALUE,Byte.MAX_VALUE,Byte.BYTES);
  }
}