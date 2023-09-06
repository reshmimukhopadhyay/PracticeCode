package org.loop.codeException;

public class  ExceptionHandler {

        public void exc1(){
            try {
                String name = null;
                name.length();
                System.out.println("Pass exc1");
            }catch(NullPointerException ex){
                System.out.println("NullPointerException observed");
                ex.printStackTrace();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }

    public void exc2(){
            exc1();
            try{
                int [] i= {1,2};
                int a = i[3];
                System.out.println("Pass exc2");
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("ArrayIndexOutOfBoundsException Observed");
                ex.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }
        System.out.println("Pass exc2");
    }

    public void exc3(){
            exc2();
            System.out.println("Pass exc3");
    }

}
