package hard;

public class EditDistance_72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minDistance("intention","execution"));
	}
	 public static int minDistance(String word1, String word2) {
	        int[][] countOpMemo = new int [word1.length()+1][word2.length()+1];
	        
	        
	        for(int i=0 ;i<= word1.length(); i++){
	            for(int j=0; j<= word2.length(); j++){
	                /*if(i==0 && j==0){
	                    countOpMemo[i][j] = 0;
	                }*/
	                if(i ==0)
	                    countOpMemo[i][j]= j;
	                else if(j==0)
	                    countOpMemo[i][j] = i;
	                else if(word1.charAt(i-1) == word2.charAt(j-1)){ //copy
	                    countOpMemo[i][j] = countOpMemo[i-1][j-1];
	                }else{ //find min of insert,delete, replace
	                    countOpMemo[i][j]=1+ Math.min(countOpMemo[i-1][j-1],Math.min(countOpMemo[i-1][j], countOpMemo[i][j-1]));
	                }
	            
	            }
	        }
	        return countOpMemo[word1.length()][word2.length()];
	        
	    }
}
