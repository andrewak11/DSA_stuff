package Java;

import java.util.Arrays;
class FindingNemo {
  public static void main(String[] args) {
    String[] nemo = new String[] {"Nemo"};
    String[] everyone = new String[] {"dory","bruce","marlin","nemo","gill","bloat","nigel","squirt","darla","hank"};
    String[] large = new String[1000];
    Arrays.fill(large,"Nemo");
    FindingNemo fn = new FindingNemo();
    fn.findNemo(large);
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
