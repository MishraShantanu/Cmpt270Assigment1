
/**
 * ArrayAverage class get the sum of given num and the total no present
 * and using those values it calculate the average by
 * averageOfElement = sumOfElement / totalElements
 */
class ArrayAverage{
    /**
     * start the execution of class
     *  @param args type string[]
     */
    public static void main(String[] args) {
        double numberArray[] = {1, 3, 4, 5};
        double avgValue = average(numberArray);
        System.out.println("average = " + avgValue);
    }

    /**
     * compute the average of the given set of numbers
     * @param array type: Double[]; holds the array of given numbers
     * @return the Average
     */
    public static double average( double[] array){
        double sum = 0;
        for(int i = 0 ; i < array.length;i++)
        {
            sum += array[i];
        }
        return sum/array.length;

    }
}

