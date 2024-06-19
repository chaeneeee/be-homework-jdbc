package com.springboot.member.repository;

import com.springboot.member.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

// TODO 페이지네이션을 적용하세요!
// 스프링 데이터  jdbc 를 쓸 때는 데이터 엑세스 계층을 인터페이스로 추상화 된 것을 가져다 쓴다
// 실질적 쿼리를 날리는 추상메서드는 여기 레포지토리에 구현되어있지 않고 상속받은 crud 인터페이스에 정의되어 있다.
//crud에 페이지 관련된 건 없다 직접 구현해야한다.

//CrudRepository<Member, Long>  이걸 PagingAndSortingRepository<Member,Long>  로 변경후 원래 것 삭제
//다중상속이 되기 때문에 삭제 안해도 되지만 PagingAndSortingRepository 안에 crud를 상속받는다
public interface MemberRepository extends  PagingAndSortingRepository<Member,Long> {
    Optional<Member> findByEmail(String email);
    //이렇게 구현한 메서드도 멤버라는테이블에 들어가서 우리가 전달하는 이메일의 컬럼에 맞는 데이터만 조회해서 준다
//    Page<Member> findAllByOrderMemberIdDesc(Pageable pageable);
    //멤버 리파지토리 그렇다면 리파지토리가 하는 역할은?
 // 이 메서드 이름을 가지고 추론해서 스프링이 데이터베이스에 접속해서 가져오는 쿼리문을 만든다
    //조회할겁니다 멤버에서 ORDER 모든 걸 가져와서 멤버 아이디를 기준으로 정렬해요 근데 뒤집어서 정렬해요


//    Page<Member> findAll (Pageable pageable);
}
