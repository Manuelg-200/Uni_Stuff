package progetto2023_lpo22_37.visitors.typechecking;

public interface Type {
    default void checkEqual(Type found) throws TypecheckerException {
        if(!equals(found))
            throw new TypecheckerException(found.toString(), toString());
    }

    default PairType checkIsPairType() throws TypecheckerException {
        if(this instanceof PairType pt)
            return pt;
        throw new TypecheckerException(toString(), PairType.TYPE_NAME);
    }

    default Type getFstPairType() throws TypecheckerException {
        return checkIsPairType().getFsType();
    }

    default Type getSndPairType() throws TypecheckerException {
        return checkIsPairType().getSndType();
    }
}