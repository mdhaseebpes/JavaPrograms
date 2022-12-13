package module3;

public class ContinueBreakConcept {


        public static void main(String args[]){
            // Illustrating break statement (execution stops when value of i becomes to 4.)
            System.out.println("Break Statement\n");
            for(int i=1;i<=5;i++){
                if(i==2) break;
                System.out.println(i);
            }
            // Illustrating continue statement (execution skipped when value of i becomes to 1.)
            System.out.println("Continue Statement\n");
            for(int i=1;i<=5;i++){
                if(i==2) continue;
                System.out.println(i);
            }
        }
    }

