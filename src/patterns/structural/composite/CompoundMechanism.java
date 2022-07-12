package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundMechanism implements Mechanism{

    private List<Mechanism> mechanisms = new ArrayList<>();
    private String name;

    public CompoundMechanism(String name) {
        this.name = name;
    }

    public List<Mechanism> getMechanisms() {
        return mechanisms;
    }

    public void setMechanisms(List<Mechanism> mechanisms) {
        this.mechanisms = mechanisms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void addMechanism(Mechanism mechanism) {
        if(mechanism.equals(this)) return;
        mechanisms.add(mechanism);
    }

    @Override
    public int getPrice() {
        int sum = 0;
        for (Mechanism mechanism : mechanisms){
            sum += mechanism.getPrice();
        }
        return sum;
    }
}
