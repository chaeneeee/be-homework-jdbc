package com.springboot.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SingleResponseDto<T> {

    private T data;
}


//데이터 하나만 담아서 보낼거면 얘를 덮어서 보낼 것
//클라이언트에서 받을 때
//바디에 컬럼이 어디에 들어가나?
//키에 맵핑돼서 들어온다
//바디에 있는 데이터를 보통 다룬다
///맞춰서 준다.
//키가 데이터를 맞춘다
//그래서 외부에서 한번 덮은 것
//

