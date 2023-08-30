package DZ1;

class Test {
    public static void main(String[] args) {
        Steel steel = new Steel();
        Sword<Steel> steelSword = new Sword<>(steel);
        System.out.print(steelSword.strengthTest());
        /*Plastic plastic = new Plastic();
        Sword<Plastic> = new Sword<>(Plastic);*/
    }
}
