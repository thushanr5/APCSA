public int intMax(int a, int b, int c) {
  int maxVal;
  
  if(a>b)
    maxVal = a;
  else
    maxVal = b;
  
  if(c>maxVal)
    return c;
    
  return maxVal;
}
