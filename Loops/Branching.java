public class Branching {
    public static void main(String[] args) {
        /*
        Java supports 3 branching statements
        1) continue
        2) pass
        3) return
        it is used to terminating the  execution flow and send the control to different place
        break  >>>
        for(-;-;-){
        ----------
        ---------
        break;
        }
        continue>>>
        for(-;-;-){
        ----------
        ---------
      continue;
      // terminates only  current iteration and send it to the begining
        }
         */
        for(int i = 1; i < 5; i++) {
            System.out.println("iteration"+i +"start");
            if(i==3)
            break;
            System.out.println("iteration"+i +"end\n"); // after break we can not place  any statement directly without any above condition statemnet


        }
        for(int i = 1; i < 5; i++) {
            System.out.println("iteration" + i + "start");
            if (i == 3){
                continue;
            }
        System.out.println("iteration"+i +"end\n");
            // continue is used for termination only current iteration of the loop


        }
    }
}
