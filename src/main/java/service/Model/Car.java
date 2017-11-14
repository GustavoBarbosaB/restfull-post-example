package service.Model;

public class Car {

   private int id;
   private String name;
   private String cor;
   private String marca;
   private String placa;

   public Car(){
      //Spring precisa para POST
   }

   public Car(int id,String name, String cor, String marca, String placa) {
      this.id = id;
      this.name = name;
      this.cor = cor;
      this.marca = marca;
      this.placa = placa;
   }

   public int getId() {
      return id;
   }

   public void setId(int i) {
      this.id =i;
   }

   public String getName() {
      return name;
   }

   public String getCor() {
      return cor;
   }

   public String getMarca() {
      return marca;
   }

   public String getPlaca() {
      return placa;
   }

}

