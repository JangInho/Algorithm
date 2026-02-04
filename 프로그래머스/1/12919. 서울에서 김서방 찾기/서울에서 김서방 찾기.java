class Solution {
    public String solution(String[] seoul) {
        
        String answer = "";
        
        int targetIndex = 0;
        
        for (int i =0; i< seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                targetIndex = i;
                break;
            }
        }
        
        answer = "김서방은 " + targetIndex + "에 있다";
        return answer;
    }
}