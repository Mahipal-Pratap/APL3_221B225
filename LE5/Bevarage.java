 abstract class Beverage {
    private void pour(int qty){
        System.out.println("Add"+qty+"ml of Beverage");
    }
    
    protected abstract void addCondiment();
    
    protected void stir(){
        
    }
    
    private void serve(){
        System.out.println("serve through waiter");
    }
    
    public final void templateMethod(int qty){
        pour(qty);
        addCondiment();
        stir();
        serve();
    }
}

