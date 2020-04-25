package impl.pair;

import api.pair.NumberPair;

public class NumberPairImpl<T extends Number, K extends Number> extends PairImpl<T, K> implements NumberPair<T, K> {
    public NumberPairImpl(final T first, final K second) {
        super(first, second);
    }
}
