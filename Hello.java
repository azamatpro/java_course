class Hello{
  public static void main(String args[]){

    // Primitive data types
    // int num = 9;
    // byte by = 127; // last byte number
    // short sh = 55;
    // long l = 7867l;

    // float f = 3.5f;
    // double d = 3.5;

    // char c = 'k';
    // boolean b = true;

    int a = 257;
    byte b = 127;
    byte k = (byte) a; // Casting => explicitly conversion
    int s = b; // Conversion => Automatically converion

    float f = 5.6f;
    int nf = (int) f;

    byte z = 10;
    byte y = 30;
    int res = z * y; // Type promotion

    System.out.println(res);
  }
}