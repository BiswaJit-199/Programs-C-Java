class StringsAdvanced1 {
    // Use regex groups to extract numbers from text
    public static void main(String[] args){
        String txt = "order: 123, qty: 5";
        java.util.regex.Matcher m = java.util.regex.Pattern.compile("(\\d+)").matcher(txt);
        while(m.find()) System.out.println(m.group());
    }
}
