package TopDSQuestions;
// https://leetcode.com/problems/gas-station/

public class GasStation {
    public static void main(String[] args) {

    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        for(int i=0;i<gas.length;i++){
            sum += gas[i] - cost[i];
        }
        if(sum<0){
            return -1;
        }

        int gain=0, sumnow=0;
        int index=0;
        for(int i=0;i<gas.length;i++){
            gain = gas[i] - cost[i];
            if((gain + sumnow) < 0){
                index = i + 1;
                sumnow = 0;
            }
            else{
                sumnow += gain;
            }
        }
        return index;
    }

}
