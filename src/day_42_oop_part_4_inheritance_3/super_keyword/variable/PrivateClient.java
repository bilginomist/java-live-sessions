package day_42_oop_part_4_inheritance_3.super_keyword.variable;

public class PrivateClient extends Client{

    public double creditRate=3;


    public double getNonPrivateClientRate(){
      return   super.creditRate;


    }

    @Override
    public String toString() {
        return "PrivateClient{" +
                "creditRateForClient=" + super.creditRate +
                ", creditRateForPrivateClient=" + this.creditRate +
                '}';
    }
}
