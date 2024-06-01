public class Count {
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,4,34,2,1,1,2,3,3,2,12};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]){

                    count += 1;
                }


            }



        }
    }
}
