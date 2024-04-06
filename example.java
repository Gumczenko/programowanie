public class example { 
    public static int szukajka(int tablica[], int liczba){
        int liczba1= 0;
        for(int liczbaa= tablica.length; liczbaa > liczba1; liczba1++ ){

            if(tablica[liczba1]== liczba){
                System.out.println(liczba1);
                return liczba1;
                
            }
         }
         return -1;
      }
    public static void main(String[] args) {
       int numerki[]={1, 2, 3,5,4,6,7,643,153,7654,1134};
       szukajka(numerki,153);
                         
}
}
