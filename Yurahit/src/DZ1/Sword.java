package DZ1;

class Sword<T extends Metal> {
    private T sword;
    Sword(T sword){
        this.sword = sword;
    }

    protected boolean strengthTest(){
        return sword.getEndurance()>49;
    }
}
