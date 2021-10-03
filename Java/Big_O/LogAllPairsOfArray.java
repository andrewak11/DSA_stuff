package Java.Big_O;

 class LogPairsArray {
    
    public static void main(String[] args) {
        int [] boxes = new int[] {1,2,3,4,5};
        LogPairsArray l = new LogPairsArray();
        l.LogAllPairsOfArray(boxes);
    }
    void LogAllPairsOfArray(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.println(array[i]+" "+array[j]);
            }
        }
    }
}

// O(n * n) = O(n^2) --> Quadratic Time
