package Java.Big_O;

import java.util.Arrays;
class FindingNemo {
  public static void main(String[] args) {
    // String[] nemo = new String[] {"Nemo"};
    // String[] everyone = new String[] {"dory","bruce","marlin","nemo","gill","bloat","nigel","squirt","darla","hank"};
    String[] large = new String[1000];
    Arrays.fill(large,"Nemo");
    FindingNemo fn = new FindingNemo();
    fn.findNemo(large); // O(n) --> Linear Time
    // fn.findNemo(nemo); // O(1) --> Constant Time
  }

  void findNemo(String [] s){
    for(int i = 0; i < s.length; i++){
      if(s[i].equals("Nemo")){
        System.out.println("Found Nemo!");
        return;
      }
    }
    System.out.println("Nemo not found!");
  }
}

/*
  Big O Rules:
    - Worst Case
    - Remove Constants
    - Different Termns for Inputs
    - Drop Non Dominants*/