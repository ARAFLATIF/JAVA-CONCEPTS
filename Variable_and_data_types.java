class HelloWorld{
    public static void main(String[] args) {
        //integer Types 
        byte sSingleByte = 100; // -128 to 127
        short aSmallNumber = 0; //-32,768 to 32767
        int anInteger = 22334334;// -2147483648 to 2147483647
        long aLargeNumber = 85757875; // 9223372036854775808 to -9223372036854775807
    
        //decimal Types
        double aDouble = 1.57888478; // 
        float aFloat = 3.4028F;
        
        //booleans
        boolean isWeekend = false;
        boolean isWorkday = true;
        
        //characters
        char copyrightSymbol = '\u00A9';
        
        System.out.println("This is a copyright symbol: " + copyrightSymbol);
        
        
    }
}


//CONVERSION OF DATA TYPES:

class HelloWorld {
  public static void main(String[] args) {
    int number1 = 5;
    double number2 = number1;

    System.out.println(number2);
  }
}

// But we always need to keep in mind that that the data type does not exceed
//the range and the holding capability of the data type range, can't convert double to int, that would be very problematic
