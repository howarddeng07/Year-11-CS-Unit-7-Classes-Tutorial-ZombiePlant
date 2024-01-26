public class ZombiePlant {
    private int maxPotency;
    private int treatmentsNeeded;

    public ZombiePlant(int maxPotency, int treatmentsNeeded){
        this.maxPotency = maxPotency;
        this.treatmentsNeeded = treatmentsNeeded;
    }

    public int getPotency(){
        return maxPotency;
    }

    public int treatmentsNeeded(){
        return this.treatmentsNeeded;
    }

    public boolean isDangerous(){
        if (treatmentsNeeded>0){
            return true;
        }
        return false;
    }

    public void treat(int num){
        if (treatmentsNeeded<0){
            return;
        }
        else if (num == 0){
            return;
        }
        else if (num<=maxPotency&&num>0&&treatmentsNeeded>0){
            treatmentsNeeded--;
        }
        else if (num>maxPotency&&num>0&&treatmentsNeeded >= 0){
            treatmentsNeeded++;
        }
    }
}
