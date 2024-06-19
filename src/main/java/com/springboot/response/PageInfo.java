package com.springboot.response;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor   //만들어야하니까 생성자 필요 빌더 써도 괜찮다 정보를 가지고 와야지  얘를 가지고 뭔가 json 으로 변경 o
public class PageInfo {
    private  int page;
    private int size;
    private long totalElements;
    private int totalPages;

}

