class Main {
  public static String first_case(String temp_val){
    temp_val.replace("t","T");
    String final_val = temp_val.replace("est","EST");
    
    return final_val;
  }
  public static void main(String[] args) {
    String temp_val = "Test";
    String ans = first_case(temp_val);
  }
}