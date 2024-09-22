package com.membership.common;

import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

/**
 * packageName    : com.membership.common
 * fileName       : BaseEntity
 * author         : NAHAEJUN
 * date           : 2024-09-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-22        NAHAEJUN              최초생성
 */
@MappedSuperclass
public abstract class BaseEntity {
        /**
         * 생성일시
         */
        @CreationTimestamp
        protected LocalDateTime createTime;

        /**
         * 수정일시
         */
        @UpdateTimestamp
        protected LocalDateTime updateTime;
}
