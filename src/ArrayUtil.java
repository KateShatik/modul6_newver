/**
 * Created by Катя on 04.12.2016.
 */
public final class ArrayUtil{
    public static int[] bubleSort(int[] array){
        boolean change = true;//booble sort

        while (change)
        {
            change = false;
            for (int j = 0; j < array.length - 1; j++)
            {

                if (array[j] < array[j + 1])
                {
                    int t = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = t;
                    change = true;
                }

            }
        }
        return array;
    }
    public final static int sum(int array[]){
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum+=array[i];
        }
        return sum;
    }

    public final static int min (int array[]){

        return bubleSort(array)[array.length - 1];
    }

    public final static int max (int array[]){

        return bubleSort(array)[0];
    }

    public final static int multiplication   (int array[]){
        int d=1;
        for (int i=0; i< array.length; i++){
            d*=array[i];
        }
        return d;
    }

    public final static int modulus (int array[]){

        return array[0]%array[array.length-1];
    }

    public final static int  secondLargest(int array[]){
        for(int i=0; i< array.length;i++){
            if (array[i]!=array[i+1]) return array[i+1];
        }
        return 0;
    }

    public final static void  maxPositive(int array[]){
        int count =0;// number of negative elements
        for(int i=0; i< array.length; i++){
            if(array[i]<0) count++;
        }
        System.out.println(" MAX POSITIVE " );
        if (array.length == count){ System.out.println("There are no positive elements in array");
            System.out.println("The biggest from negative elements" + array[0]);
        }
        else System.out.println("Max positive element: " + array[0]);
    }

    public final static int[] reverse(int[] array){
        for(int  i=0; i<array.length / 2; i++){
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[i] = tmp;
        }
        return array;
    }

    public final static int[] findEvenElements (int[] array){
        int[] evenElements = new int[array.length];
        int index=0;
        for(int i=0; i<array.length; i++){
            if(array[i]%2==0){
                evenElements[index]=array[i];
                index++;
            }
        }
        return evenElements;
    }

}
