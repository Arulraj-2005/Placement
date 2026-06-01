public class MaxDiff {

    public static void main(String[] args) {

        int[] arr = {2,1,8};

        int[] l = new int[arr.length];
        int[] r = new int[arr.length];

        // Left smaller
        for(int i = 0; i < arr.length; i++){

            if(i == 0){
                l[i] = 0;
            } 
            else{
                l[i] = 0;

                for(int j = i - 1; j >= 0; j--){

                    if(arr[j] < arr[i]){
                        l[i] = arr[j];
                        break;
                    }
                }
            }
        }

        // Right smaller
        for(int i = 0; i < arr.length; i++){

            if(i == arr.length - 1){
                r[i] = 0;
            }
            else{
                r[i] = 0;

                for(int j = i + 1; j < arr.length; j++){

                    if(arr[j] < arr[i]){
                        r[i] = arr[j];
                        break;
                    }
                }
            }
        }

    int max = 0;

for(int i = 0; i < arr.length; i++){
    int diff = Math.abs(l[i] - r[i]);

    if(diff > max){
        max = diff;
    }
}

System.out.println("Max Difference = " + max);

    }
}