public String endUp(String str) {
  if(str.length() < 3)
    return str.toUpperCase();
    
  String portion = str.substring(str.length()-3,str.length());
  String old = str.substring(0,str.length()-3);
  
    return old + portion.toUpperCase();
}
