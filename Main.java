
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + " : " + new Solution().solution(i));
		}
	}
	static class Solution {
	  public String solution(int n) {
	      StringBuilder answer = new StringBuilder();
	      int num = n;
	      
	      while(num > 0) {
	    	  switch (num % 3) {
				case 0:
					answer.append(4);
					break;
				case 1:
					answer.append(1);
					break;
				case 2:
					answer.append(2);
					break;
				}
	    	  num = (num-1)/3;
	      }
	      return answer.reverse().toString();
	  }
	}
}
