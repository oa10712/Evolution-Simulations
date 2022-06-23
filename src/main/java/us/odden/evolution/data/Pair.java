package us.odden.evolution.data;

import lombok.Data;

@Data
public class Pair<L, R> {

    L left;
    R right;

    private Pair(L l, R r) {
        left = l;
        right = r;
    }

    public static <L, R> Pair<L, R> of(L left, R right) {
        return new Pair<>(left, right);
    }
}
