public boolean in3050(int a, int b) {
  if(((Math.abs(a-40)<=10 && Math.abs(a-30)<=10) 
  && (Math.abs(b-40)<=10 && Math.abs(b-30)<=10)) 
  || ((Math.abs(a-40) <=10 && Math.abs(a-50) <=10))
  && (Math.abs(b-40)<=10 && Math.abs(b-50)<=10))
    return true;
  
  return false;
}
