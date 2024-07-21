/**
 * CharDataType
 */
public class CharDataType {

    public static void main(String[] args) {
        char my_char1 = 'A';
        char my_char2 = 'B';
        System.out.println("my_char1 : "+ my_char1 );
        System.out.println("my_char2 : "+ my_char2);
        System.out.println("after increment my_char2 " + (char)(my_char2+1));

        char my_char3 = '&';
        System.out.println("my_char3 : " + my_char3);
        char my_char4 ='1';
        System.out.println("my_char4 :" + my_char4);

        char my_char5 = 'अ';
        System.out.println(my_char5);

        String hindi = "कृपया मान दर्ज करें" ;
        System.out.println(hindi);
        
        
        // boolean datatype

        int a =9;
        boolean b = a<10;
        System.out.println(b);

        if(false)
        {
            System.out.println("hello");
        }
        else
        {
            System.out.println("World");
        }

        // example  of boolean data type
        int c=10,d=10,f=10;
        boolean g = (10>5) == (11<5); 
        System.out.println(g);

        // example of type casting uin boolean data type
        int a_int = 10;
        boolean a_bool =(boolean)(a_int);
        int b_int =1;
        boolean b_bool = (boolean) (b_int);


        // integer datatype





    }
}