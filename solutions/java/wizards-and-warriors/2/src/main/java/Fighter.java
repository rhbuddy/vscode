class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class

class Warrior extends Fighter{

    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }

        @Override
    boolean isVulnerable(){
        return false;
    }

        @Override
    int getDamagePoints(Fighter  fighter){
        if( fighter.isVulnerable() == false ){
            return 6;
        } else {
            return 10;
        }
    }
}


// TODO: define the Wizard class

class Wizard extends Fighter {
    
    private boolean spell = false;

    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }

    public void prepareSpell(){
        spell = true;
    }

        @Override
    boolean isVulnerable(){
        return !spell;
    }

        @Override
    int getDamagePoints(Fighter fighter){
    if(!spell){
    return 3;
    } else {
    return 12;
    }
}
}
