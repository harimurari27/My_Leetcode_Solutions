public class MovieRentingSystem {
    private Map<Integer, Map<Integer, Integer>> priceMap = new HashMap<>();
    private Map<Integer, TreeSet<PriceShop>> available = new HashMap<>();
    private TreeSet<PriceShopMovie> rented = new TreeSet<>();

    private static class PriceShop implements Comparable<PriceShop> {
        int price, shop;
        PriceShop(int p, int s) {
            price = p;
            shop = s;
        }
        @Override
        public int compareTo(PriceShop o) {
            if (this.price != o.price) return Integer.compare(this.price, o.price);
            return Integer.compare(this.shop, o.shop);
        }
    }

    private static class PriceShopMovie implements Comparable<PriceShopMovie> {
        int price, shop, movie;
        PriceShopMovie(int p, int s, int m) {
            price = p;
            shop = s;
            movie = m;
        }
        @Override
        public int compareTo(PriceShopMovie o) {
            if (this.price != o.price) return Integer.compare(this.price, o.price);
            if (this.shop != o.shop) return Integer.compare(this.shop, o.shop);
            return Integer.compare(this.movie, o.movie);
        }
    }

    public MovieRentingSystem(int n, int[][] entries) {
        for (int[] entry : entries) {
            int shop = entry[0], movie = entry[1], price = entry[2];
            priceMap.computeIfAbsent(shop, k -> new HashMap<>()).put(movie, price);
            available.computeIfAbsent(movie, k -> new TreeSet<>()).add(new PriceShop(price, shop));
        }
    }

    public List<Integer> search(int movie) {
        TreeSet<PriceShop> set = available.get(movie);
        List<Integer> res = new ArrayList<>();
        if (set != null) {
            Iterator<PriceShop> it = set.iterator();
            for (int i = 0; i < 5 && it.hasNext(); i++) {
                res.add(it.next().shop);
            }
        }
        return res;
    }

    public void rent(int shop, int movie) {
        int price = priceMap.get(shop).get(movie);
        TreeSet<PriceShop> set = available.get(movie);
        set.remove(new PriceShop(price, shop));
        if (set.isEmpty()) available.remove(movie);
        rented.add(new PriceShopMovie(price, shop, movie));
    }

    public void drop(int shop, int movie) {
        int price = priceMap.get(shop).get(movie);
        rented.remove(new PriceShopMovie(price, shop, movie));
        available.computeIfAbsent(movie, k -> new TreeSet<>()).add(new PriceShop(price, shop));
    }

    public List<List<Integer>> report() {
        List<List<Integer>> res = new ArrayList<>();
        Iterator<PriceShopMovie> it = rented.iterator();
        for (int i = 0; i < 5 && it.hasNext(); i++) {
            PriceShopMovie psm = it.next();
            res.add(Arrays.asList(psm.shop, psm.movie));
        }
        return res;
    }
}