
private int tamanho ;
private double [ ] Array_temp;

public Temperatura (){

        String aux = JOptionPane.showInputDialog ( " Quantos dias ");

        tamanho = Integer.parseInt(aux);
        Array_temp = new double [tamanho ];
}


public double [ ] getArray (){
        return Array_temp ;
}

public double getTemperaturaPosicaoDoArray(int indice ){
        return Array_temp[  indice ];

}


public void setTemperatura(int indice , double valor ){
        Array_temp[  indice ]= valor ;
        }

public void EntradaValor(){
        int i = 0;
        while ( i <  tamanho){
        String aux = JOptionPane.showInputDialog ( " Entre com a temperatura  ");
        Array_temp[i]= Double.parseDouble(aux);
        i ++ ;

        }
}

public double menorTemperatura (){
        double menortemp = Array_temp[0];
        int i = 0;
        while ( i < tamanho ) {
        if ( menortemp > Array_temp[i]  ){
        menortemp = Array_temp[i];
        }
        i++ ;

        }
        return menortemp ;
}

public double maiorTemperatura(){
        double maiorTemp = 0;
        int i = 0 ;
        while  ( i < tamanho ){
        if ( maiorTemp < Array_temp[i]) {
        maiorTemp = Array_temp[i];
        }
        }
        return maiorTemp ;

}
