package cafe.review.repository.cafe;

import cafe.review.domain.cafe.Cafe;
import cafe.review.domain.cafe.CafeMember;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Slf4j
@Repository
public class CafeRepository {
    private static final Map<Long, CafeMember> store = new HashMap<>();

    private static long sequence=0l;

    public static List<CafeMember> findAll() {
       return new ArrayList<>(store.values());
    }

    public CafeMember save(CafeMember cafeMember){
        cafeMember.setCafeId(++sequence);
        store.put(cafeMember.getCafeId(),cafeMember);
        return cafeMember;
    }

}