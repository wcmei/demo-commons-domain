package com.wcmei.demo.commons.domain;


import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author wcmei
 * @date 2019-12-11
 * @description
 */
@Data
@MappedSuperclass
public abstract class AbstractBaseDomain implements Domain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String created;

    private String updated;

}
