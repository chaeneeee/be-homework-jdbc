package com.springboot.response;

import lombok.Getter;
import org.springframework.data.domain.Page;
import java.util.List;


@Getter
public class MultiPageResponseDto<T> {
    private List<T> data;
    private PageInfo pageInfo;

        public MultiPageResponseDto(List<T> data , Page page) {
            this.data = data;
            this.pageInfo= new PageInfo(page.getNumber() +1 , page.getSize(),
                    page.getTotalElements(), page.getTotalPages());
            //페이지 넘버에 +1 해줘야한다 왜? 우린 0 부턴데 0으로 보내주면 안되니까
            //reponse 헤줄 땐 -1 해줘야힌디
        }
//pageInfo 로 안 받고 페이지로 받는다
    //멤버 컨트롤러 에 있는 pageMember 가 Page로 구현되어 있어서

}
