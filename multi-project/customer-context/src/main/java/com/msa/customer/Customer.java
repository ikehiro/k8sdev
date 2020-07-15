package com.msa.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.seasar.doma.*;

@Table(name = "customer")
@Entity
@Getter
@Setter
public class Customer {

    private static final long serialVersionUID = 4512633005852272922L;

    @OriginalStates // 差分UPDATEのために定義する
    @JsonIgnore // APIのレスポンスに含めない
            Customer originalStates;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    // ハッシュ化されたパスワード
    //@JsonIgnore
    @Column(name = "corporate_number")
    String corporateNumber;

    // 名前
    String name;

    String jsonVal;

    String vc;
    /*
    // メールアドレス
    @Email
    String email;

    // 電話番号
    @Digits(fraction = 0, integer = 10)
    String tel;

    // 郵便番号
    @NotEmpty
    String zip;

    // 住所
    @NotEmpty
    String address;

    // 添付ファイルID
    @JsonIgnore
    Long uploadFileId;
*/

}

