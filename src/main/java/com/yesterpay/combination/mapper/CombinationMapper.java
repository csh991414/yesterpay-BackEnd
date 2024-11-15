package com.yesterpay.combination.mapper;

import com.yesterpay.combination.dto.Combination;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CombinationMapper {
    int selectSharedId(Combination combination);
    int addSharedId(Combination combination);
    int addCombiCnt(Long memberId);
    int subCombiCnt(Long memberId);
    int getCombiCnt(Long memberId);
    Long findLetter(String letter);
    Long addLetterInDB(String letter);
    int addLetterToMember(Long letterId, Long memberId);
    int deleteLetter(Long letterId, Long memberId);
    List<String> selectLetterList(Long memberId);
}
