class Solution {
    public String discountPrices(String sentence, int discount) {
        String[] words = sentence.split(" ");

        for(int i =0 ; i <words.length ;i++){
            if(words[i].charAt(0) != '$') continue;

            else {
                int len = words[i].length();
                String sub = words[i].substring(1,len);
                if(!sub.matches("[0-9]+")) continue;

                StringBuilder newWord = new StringBuilder();
                double cost = Double.parseDouble(sub);
                cost = cost - discount*(cost)/100;
                System.out.println(cost);
                newWord.append("$");
                newWord.append(String.format("%.2f",cost));

                words[i] = newWord.toString();
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i <words.length ; i++){
            sb.append(words[i]);

            if(i != words.length-1) sb.append(" ");
        }

        return sb.toString();
    }
}