class IOEasy2 { public static void main(String[] args) throws Exception{ try(java.io.PrintWriter pw = new java.io.PrintWriter("log.txt")) { pw.println("log entry"); } } }
