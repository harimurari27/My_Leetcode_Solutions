class Solution {
    static class N {
        Map<String, N> c = new TreeMap<>();
        boolean d = false;
    }
    public List<List<String>> deleteDuplicateFolder(List<List<String>> p) {
        N r = new N();
        for (List<String> l : p) {
            N n = r;
            for (String s : l) {
                n = n.c.computeIfAbsent(s, k -> new N());
            }
        }
        Map<String, List<N>> m = new HashMap<>();
        e(r, m);
        for (List<N> g : m.values()) {
            if (g.size() > 1) {
                for (N n : g) n.d = true;
            }
        }
        List<List<String>> res = new ArrayList<>();
        col(r, new ArrayList<>(), res);
        return res;
    }
    private String e(N n, Map<String, List<N>> m) {
        if (n.c.isEmpty()) return "()";
        List<String> s = new ArrayList<>();
        for (Map.Entry<String, N> en : n.c.entrySet()) {
            String sub = e(en.getValue(), m);
            s.add(en.getKey() + sub);
        }
        Collections.sort(s);
        String sig = "(" + String.join("", s) + ")";
        m.computeIfAbsent(sig, k -> new ArrayList<>()).add(n);
        return sig;
    }
    private void col(N n, List<String> p, List<List<String>> r) {
        for (Map.Entry<String, N> e : n.c.entrySet()) {
            if (e.getValue().d) continue;
            p.add(e.getKey());
            r.add(new ArrayList<>(p));
            col(e.getValue(), p, r);
            p.remove(p.size() - 1);
        }
    }
}