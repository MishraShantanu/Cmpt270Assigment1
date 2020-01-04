
/**
 * CapitalCounter count the number of capital letter in a string
 */
class CapitalCounter {
    /**
     * start the execution of class
     *  @param args type string[]
     */
    public static void main(String[] args){
        System.out.println(countCaps("hello"));
        System.out.println(countCaps("hElLo"));
        System.out.println(countCaps("helLo"));
        System.out.println(countCaps("hELlOOooo 1803"));

    }

    /**
     *
     * @param s type : String ; holds strings for which capitalisation is to be tested
     * @return count type : int ; the no of capital letter in the string
     */
    public static int countCaps(String s)
    {   int count = 0;

        for(int i=0; i<s.length();i++)
        {  char x;

            x = s.charAt(i);
            if( Character.isUpperCase(x)){
                count +=1;
            }

        }
     return count;
    }

}
