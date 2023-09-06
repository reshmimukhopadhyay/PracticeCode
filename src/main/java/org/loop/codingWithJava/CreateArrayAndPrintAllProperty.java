package org.loop.codingWithJava;

public class CreateArrayAndPrintAllProperty {

    public void createArrayAndPrintArray(){
        int [] mark={1,2,3,4,5,6,7};
        for(int i=0;i<=mark.length-1;i++){
            System.out.println(mark[i]);
        }
    }

    public static void main(String[] args){
        CreateArrayAndPrintAllProperty createArrayAndPrintAllProperty=new CreateArrayAndPrintAllProperty();
        createArrayAndPrintAllProperty.createArrayAndPrintArray();
    }
}
