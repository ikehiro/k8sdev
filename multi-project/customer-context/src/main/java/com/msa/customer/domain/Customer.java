package com.msa.customer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Customer {
    /**
     * 一連番号
     */
    private Integer sequenceNumber;

    /**
     * 法人番号
     */
    private Long corporateNumber;

    /**
     * 処理区分
     */
    private Integer process;

    /**
     * 訂正区分
     */
    private Byte correct;

    /**
     * 更新年月日
     */
    private LocalDate updateDate;

    /**
     * 変更年月日
     */
    private LocalDate changeDate;

    /**
     * 商号又は名称
     */
    private String name;

    /**
     * 商号又は名称イメージID
     */
    private Integer nameImageId;

    /**
     * 法人種別
     */
    private Integer kind;

    /**
     * 国内所在地（都道府県）
     */
    private String prefectureName;

    /**
     * 国内所在地（市区町村）
     */
    private String cityName;

    /**
     * 国内所在地（丁目番地等）
     */
    private String streetNumber;

    /**
     * 国内所在地イメージID
     */
    private Integer addressImageId;

    /**
     * 都道府県コード
     */
    private Integer prefectureCode;

    /**
     * 市区町村コード
     */
    private Integer cityCode;

    /**
     * 郵便番号
     */
    private Integer postCode;

    /**
     * 国外所在地
     */
    private String addressOutside;

    /**
     * 国外所在地イメージID
     */
    private Integer addressOutsideImageId;

    /**
     * 登記記録の閉鎖等年月日
     */
    private LocalDate closeDate;

    /**
     * 登記記録の閉鎖等の事由
     */
    private Integer closeCause;

    /**
     * 承継先法人番号
     */
    private Long successorCorporateNumber;

    /**
     * 変更事由の詳細
     */
    private String changeCause;

    /**
     * 法人番号指定年月日
     */
    private LocalDate assignmentDate;

    /**
     * 最新履歴
     */
    private Byte latest;

    /**
     * 商号又は名称（英語表記）
     */
    private String enName;

    /**
     * 国内所在地（都道府県）(英語表記）
     */
    private String enPrefectureName;

    /**
     * 国内所在地（市区町村丁目番地等）（英語表記）
     */
    private String enCityName;

    /**
     * 国外所在地（英語表記）
     */
    private String enAddressOutside;
}
