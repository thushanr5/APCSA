public String backAround(String str) {
  String c1 = str.substring(str.length()-1,str.length());
  return c1 + str + c1;
}
