public class SearchUtils {

    public static Product linearSearch(Product[] products,int targetId){
        for(Product i:products){
            if(i.getProductId()==targetId){
                return i;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products,int targetId){
        int low = 0;
        int high = products.length-1;
        while(low<=high){
            int mid = (low + high)/2;
            int midId = products[mid].getProductId();
            if(midId == targetId){
                return products[mid];
            }
            else if(midId<targetId){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return null;
    }

}
