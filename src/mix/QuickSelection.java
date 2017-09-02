package mix;

public class QuickSelection {

	 
    private int partition(int[] list, int p, int r) {
        
    		//select median as pivot, and swap with end.
        int tmp = list[(p+r+1)/2];
        list[(p+r+1)/2] = list[r];
        list[r] = tmp;
        
        int x = list[r];
        int i = p-1;
        for (int j=p;j<r;j++) {
            if (list[j] <= x) {
                i++;
                tmp = list[i];
                list[i] = list[j];
                list[j] = tmp;
            }
        }
        i++;
        tmp = list[i];
        list[i] = list[r];
        list[r] = tmp;
        return i;
    }
    
    public int quickSelect(int[] list, int p, int r, int k) {
        
        if (p==r)
            return list[p];
        
        //System.out.println("before: "+Arrays.toString(list));
        int q = partition(list, p, r);
        //System.out.println("after:  "+Arrays.toString(list));
        int i = q-p+1;
        
        //System.out.println("q="+q+", i="+i+", k="+k);
        if (i==k) 
            return list[q];
        else {
            if (i>=k)
                return quickSelect(list, p, q-1, k);
            else
                return quickSelect(list, q+1, r, k-i);
        }
    }
    
    public int findKthNumber(int m, int n, int k) {
        
        int[] inputList = new int[m*n];
        
        int counter = 0;
        for (int i=1;i<=m;i++) {
            for (int j=1;j<=n;j++) {
                inputList[counter++] = i*j;
            }
        }
        
        System.out.println("inputList.length="+inputList.length);
        int num = quickSelect(inputList, 0, inputList.length-1, k);
        
        return num;
    }
    
	public static void main(String[] args) {
		QuickSelection obj = new QuickSelection();
		int result = obj.findKthNumber(5, 3, 6);
		System.out.println("result="+result);

	}

}
