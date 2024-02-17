public class Product {
   private String name;
   public Boolean desconto;
   public Double weight;
   public Double preco;



    public void setName(String productName){
        name = productName;
    }

    public String getName(){
       return name;
    }


    public void setPreco(Double productPreco){
        preco = productPreco;
    }

    public Double getPreco(){
        return preco;
    }

    public void setWeight(Double productWeight){
        weight = productWeight;
    }

    public Double getWeight(){
        return weight;
    }

    public void setDesconto(Boolean productDesconto){
        desconto = productDesconto;
    }

    public Boolean getDesconto(){
        return desconto;
    }
}


    public Double CalcDesconto(){
        if(desconto != False ){
            preco = (preco - (preco*0.1));
        }

}

