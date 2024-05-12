public class SwitchCase {
    
    public static void main(String args[]){
        String gamelevel = "dont know";
        int level = 0;

        switch (gamelevel) {
            case "Beginner":level =1;
                
                break;
            case "Intermediate":level=2;
                break;
            case "Expert":level=3;
                break;
            default:level=0;
                break;
        }
        System.out.println("Your game level is : "+level);
    }
}
