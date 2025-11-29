class ThreadsAdvanced2 {
    // ForkJoin for divide-and-conquer
    static class SumTask extends java.util.concurrent.RecursiveTask<Long> {
        final long[] arr; int lo, hi; SumTask(long[] arr,int lo,int hi){ this.arr=arr;this.lo=lo;this.hi=hi; }
        protected Long compute(){ if(hi-lo<10){ long s=0; for(int i=lo;i<hi;i++) s+=arr[i]; return s; } int mid=(lo+hi)/2; SumTask l=new SumTask(arr,lo,mid); SumTask r=new SumTask(arr,mid,hi); l.fork(); long rs=r.compute(); long ls=l.join(); return ls+rs; }
    }
    public static void main(String[] args){ long[] a = new long[100]; for(int i=0;i<a.length;i++) a[i]=i+1; long sum = new java.util.concurrent.ForkJoinPool().invoke(new SumTask(a,0,a.length)); System.out.println(sum); }
}
