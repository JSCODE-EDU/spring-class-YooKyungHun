package com.jscode.spring.day04.Example2;

import lombok.Getter;
import lombok.Setter;

/**
 * 상품 등록 API ([POST] /api/products) 요청에 필요한 리퀘스트 바디 정의.
 */
@Getter
@Setter
public class CreateProductReq2 {
    String name;
    Long price;

}