package functions;

public class GST {

        static int[] getPricesWithGST(int prices[], int index) {
            // base case
            if (index == prices.length) {
                // price array end
                int gst[] = new int[prices.length]; // fill with 0
                return gst;
            }
            // GST = 18% - New Price --> Price + GST
            int gst[] = getPricesWithGST(prices, index + 1);
            gst[index] = prices[index] + (int) (prices[index] * 0.18);
            return gst;
        }

        public static void main(String[] args) {
            int prices[] = { 100, 200, 430, 999, 7777 }; // price with no tax
            int newPrices[] = getPricesWithGST(prices, 0);
            for (int p : newPrices) {
                System.out.println(p);
            }
        }

}
