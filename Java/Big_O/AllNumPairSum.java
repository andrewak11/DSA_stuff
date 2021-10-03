package Java.Big_O;

class AllNumPairSum {
    public static void main(String[] args) {
        AllNumPairSum p = new AllNumPairSum();
        int [] arr = new int[] {1,2,3,4,5};
        p.PrintAllNumbersThenAllPairSums(arr);
    }

    void PrintAllNumbersThenAllPairSums(int[] numbers){
        System.out.println("These are the numbers: ");
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("and these are their sums: ");
        for (int i : numbers) {
            for (int j : numbers) {
                System.out.println(i+j);
            }
        }
    }
}

// O(n + n^2) = O(n^2) -- Dropping non dominant i.e n