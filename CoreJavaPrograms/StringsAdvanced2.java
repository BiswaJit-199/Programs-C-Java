class StringsAdvanced2 {
    // Efficient string building for huge concatenation using StringBuilder + charset handling
    public static void main(String[] args){
        StringBuilder b = new StringBuilder(1000);
        for(int i=0;i<100;i++) b.append(i).append('|');
        System.out.println(b.substring(0, Math.min(b.length(), 200)));
    }
}
