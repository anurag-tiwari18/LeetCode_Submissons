class ProductOfNumbers {

    List<Long> prefix = new ArrayList<>();

    public ProductOfNumbers() {
        prefix.add(1L);
    }
    
    public void add(int num) {
        if(num == 0){
            prefix.clear();
            prefix.add(1L);
        }

        else{
            long prod = prefix.get(prefix.size()-1) * num;
            prefix.add(prod);               
        }     
    }
    
    public int getProduct(int k) {
        if( k < prefix.size()){
            int size = prefix.size()-1;
            return (int)(prefix.get(size) / prefix.get(size - k));
        }
        return 0;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */