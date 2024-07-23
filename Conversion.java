class Conversion {

    public static void main ( String args [ ] )
    
    {
    
    byte a_byte = 1;
    short a_short = 2;
    int a_int = 3;
    long a_long = 4;

    float a_float = a_byte;
    float b_float = a_short;
    float c_float = a_int;
    float d_float = a_int;

    double a_double = a_byte ;
    double b_double = a_short;
    double c_double = a_int;
    double d_double = a_long;

    System.out.println(a_float);
    System.out.println(b_float);
    System.out.println(c_float);
    System.out.println(d_float);
    System.out.println(a_double);
    System.out.println(b_double);
    System.out.println(c_double);
    System.out.println(d_double);


   char a_char = (char)(97-32);
   System.out.println(a_char);


   byte b_byte = 10;
   short b_short = 20;
   int b_int = 30;
   long b_long = 10,bb_long;
   bb_long = b_byte +b_short+b_int +b_long;
   System.out.println(bb_long);



   byte a=10,b=20;
   int c;
   c= (a+b);
   System.out.println(c);


   char b_char = 'A' ;
   System.out.println(b_char);
   char c_char = (char)(b_char + 10);
   System.out.println(c_char);

   
   short ss = 10 ;
   int ii = ss;
   System.out.println(ii);


   int vv = 013+10;
   System.out.println(vv);

   char cc  = (char)(0130);
   System.out.println(cc);


   byte bb = 65 ;
   char mm = (char)bb;
   System.out.println(mm);






    
    }
    
    }