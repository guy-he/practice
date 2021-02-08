  package com.company;

  import lombok.AllArgsConstructor;
  import lombok.ToString;

  @ToString
  @AllArgsConstructor
  public class Dog {



      String name;
      int age;
      String brand;

      public  void bark(){
          System.out.println(String.format("woof! woof! %s", name));
      }
  }
