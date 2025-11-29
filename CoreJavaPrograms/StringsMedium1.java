class StringsMedium1 {
    public static void main(String[] args){
        String s = "aabccde";
        StringBuilder out = new StringBuilder();
        for(int i=0;i<s.length();){ int j=i; while(j<s.length()&&s.charAt(j)==s.charAt(i)) j++; out.append(s.charAt(i)).append(j-i); i=j; }
        System.out.println(out.toString()); // run-length encoding
    }
}
