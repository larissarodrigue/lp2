public class Palindrome {
   public static void main(String[] args){
       boolean bool = false;
       String texto = args[0];
       String teste = "";
		 int x;
      int tamanho = 5;
      int size = texto.length();
      int qtdTeste = size-tamanho;
		String reverso;
		
    for(x=0; x<=qtdTeste; x++){

      teste = texto.substring(x,x + tamanho);
        
      StringBuffer txtrever = new StringBuffer(teste);
      txtrever.reverse();
			reverso = txtrever.toString();

      if (teste.equals(reverso)) {
        System.out.println("Há um palíndrome: " + teste);
				System.out.println("O palíndrome está  na posição: (" + (x+1) + "," + (x + tamanho) + ")");
        bool = true;
				System.exit(0);
      }
		}	

    if (bool == false) {
      System.out.println("Não existe Palíndrome nesta palavra !");
    }
    
  }
}
