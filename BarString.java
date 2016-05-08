public class BarString{
  private String b;
  public String BarString(String a){
    for (int i = 0; i < a.length()-1; i++){
      b += a.charAt(i) + "|";
    }
    return b;
  }
}