public class MyLinearSearch {
    private int[] arr;
    public MyLinearSearch(int[] arr){
        this.arr=arr;
    }

    public boolean linearSearch(int searchElement){
        boolean found =false;
        for(int i=0;i<arr.length;i++){
            if(searchElement==arr[i]){
                found=true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int[] array={25,8,2,60,60,10,15,5};
        MyLinearSearch obj=new MyLinearSearch(array);

        boolean result=obj.linearSearch(15);
        if(result){
            System.out.println("element found");
        }
        else{
            System.out.println("element not found");
        }
    }
}
