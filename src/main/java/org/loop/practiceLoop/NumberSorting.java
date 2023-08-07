package org.loop.practiceLoop;

public class NumberSorting {

    int []a={2,4,4,5,7,8,8,8,9};
    int []temp=new int[a.length];
    int j=0;

    public void sortingProcessUsingTemporaryArray(){
        try{
        for(int i = 0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                temp[j]=a[i];
                j++;
            }
        }for(int j=0;j<temp.length;j++){
            System.out.print(temp[j]);
        }
    }catch (Exception e){
        System.out.println(e);}
    }

    public void sortingProcessUsingSingleArray(){
        try {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] != a[i + 1]) {
                    a[j] = a[i];
                    j++;
                }
            }
            for (int j = 0; j <a.length-1; j++) {
                System.out.print(a[j]);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
